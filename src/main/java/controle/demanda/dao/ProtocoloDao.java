package controle.demanda.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import controle.demanda.entity.ProtocoloEntity;

public class ProtocoloDao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DAO<ProtocoloEntity> dao;
	@Inject
	private EntityManager em;
	
	public void init() {
		this.dao = new DAO<ProtocoloEntity>(this.em, ProtocoloEntity.class);
	}

	public void adicionar(ProtocoloEntity entidade) {
		dao.adicionar(entidade);
	}

	public void atualizar(ProtocoloEntity entidade) {
		dao.atualizar(entidade);
	}

	public void remover(ProtocoloEntity entidade) {
		dao.remover(entidade);
	}

	public ProtocoloEntity buscarPorId(Integer id) {
		return dao.buscarPorId(id);
	}
	
}