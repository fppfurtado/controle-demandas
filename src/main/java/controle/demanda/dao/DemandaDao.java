package controle.demanda.dao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import controle.demanda.entity.DemandaEntity;

public class DemandaDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private EntityManager em;
	private DAO<DemandaEntity> dao;
	
	@PostConstruct
	public void init() {
		this.dao = new DAO<DemandaEntity>(this.em, DemandaEntity.class);
	}
	public void adicionar(DemandaEntity entidade) {
		dao.adicionar(entidade);
	}
	public void atualizar(DemandaEntity entidade) {
		dao.atualizar(entidade);
	}
	public void remover(DemandaEntity entidade) {
		dao.remover(entidade);
	}
	public DemandaEntity buscarPorId(Integer id) {
		return dao.buscarPorId(id);
	}
	
}
