package controle.demanda.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import dominio.rotina.Demanda;

@Entity(name = "demanda")
public class DemandaEntity {
	
	private Long id;
	private Demanda demanda = new Demanda();
	private ProtocoloEntity protocoloEntity;
	private List<ProvidenciaEntity> providenciasEntity;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "data_recebimento")
	public LocalDate getDataRecebimento() {
		return demanda.getDataRecebimento();
	}
	
	public void setDataRecebimento(LocalDate dataRecebimento) {
		demanda.setDataRecebimento(dataRecebimento);
	}
	@Column(name = "canal_recebimento")
	public String getCanalRecebimento() {
		return demanda.getCanalRecebimento();
	}

	public void setCanalRecebimento(String canalRecebimento) {
		demanda.setCanalRecebimento(canalRecebimento);
	}
	@Column(nullable = false)
	public String getDescricao() {
		return demanda.getDescricao();
	}

	public void setDescricao(String descricao) {
		demanda.setDescricao(descricao);
	}

	@ManyToOne
	public ProtocoloEntity getProtocolo() {
		return protocoloEntity;
	}

	public void setProtocolo(ProtocoloEntity protocoloEntity) {
		this.protocoloEntity = protocoloEntity;
	}

	@OneToMany(mappedBy = "demanda")
	public List<ProvidenciaEntity> getProvidencias() {		
		return providenciasEntity;
	}

	public void setProvidencias(List<ProvidenciaEntity> providencias) {
		this.providenciasEntity = providencias;
	}
	
}