package controle.demanda.mb;

import java.time.LocalDate;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import controle.demanda.dao.ProtocoloDao;
import controle.demanda.entity.ProtocoloEntity;

@Named
@RequestScoped
public class ProtocoloBean {

	private ProtocoloEntity protocolo = new ProtocoloEntity();
	@Inject
	private DemandaBean demandaBean;
	@Inject
	private ProtocoloDao dao;

	public ProtocoloEntity getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(ProtocoloEntity protocolo) {
		this.protocolo = protocolo;
	}
	
	public void gravarProtocolo() {
		demandaBean.getDemanda().setProtocolo(protocolo);
		dao.adicionar(protocolo);
	}

	public Long getId() {
		return protocolo.getId();
	}

	public void setId(Long id) {
		protocolo.setId(id);
	}

	public String getOrigem() {
		return protocolo.getOrigem();
	}

	public void setOrigem(String origem) {
		protocolo.setOrigem(origem);
	}

	public LocalDate getData() {
		return protocolo.getData();
	}

	public void setData(LocalDate data) {
		protocolo.setData(data);
	}

	public Integer getNumero() {
		return protocolo.getNumero();
	}

	public void setNumero(Integer numero) {
		protocolo.setNumero(numero);
	}
	
}