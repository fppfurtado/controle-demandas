package controle.demanda.dao;

import javax.persistence.EntityManager;

public class DAO<T> {

	private EntityManager em;
	private final Class<T> classe;

	public DAO(EntityManager em, Class<T> classe) {
		this.em = em;
		this.classe = classe;
	}

	public void adicionar(T entidade) {

		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		em.close();

	}

	public void atualizar(T entidade) {

		em.getTransaction().begin();
		em.merge(entidade);
		em.getTransaction().commit();
		em.close();

	}

	public void remover(T entidade) {

		em.getTransaction().begin();
		em.remove(em.merge(entidade));
		em.getTransaction().commit();
		em.close();

	}

	public T buscarPorId(Integer id) {
		T entidade = em.find(classe, id);
		em.close();
		return entidade;
	}

}