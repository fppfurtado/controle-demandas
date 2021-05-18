package controle.demanda.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import dominio.rotina.Demanda;
import dominio.rotina.Demanda.Providencia;

@Entity(name = "providencia")
public class ProvidenciaEntity {

	private Long id;
	private Providencia providencia = (new Demanda()).new Providencia();
	private DemandaEntity demandaEntity;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return providencia.getData();
	}
	public void setData(LocalDate data) {
		providencia.setData(data);
	}
	@Column(nullable = false)
	public String getDescricao() {
		return providencia.getDescricao();
	}
	public void setDescricao(String descricao) {
		providencia.setDescricao(descricao);
	}
	@ManyToOne
	public DemandaEntity getDemanda() {
		return demandaEntity;
	}
	public void setDemanda(DemandaEntity demandaEntity) {
		this.demandaEntity = demandaEntity;
	}
	
}