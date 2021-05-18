package controle.demanda.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import dominio.rotina.Protocolo;

@Entity(name = "protocolo")
public class ProtocoloEntity {
	
	private Long id;
	private Protocolo protocolo = new Protocolo();
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(nullable = false)
	public String getOrigem() {
		return protocolo.getOrigem();
	}

	public void setOrigem(String origem) {
		protocolo.setOrigem(origem);
	}
	@Column(nullable = false)	
	public LocalDate getData() {
		return protocolo.getData();
	}
	public void setData(LocalDate data) {
		protocolo.setData(data);
	}
	@Column(nullable = false)
	public Integer getNumero() {
		return protocolo.getNumero();
	}
	public void setNumero(Integer numero) {
		protocolo.setNumero(numero);
	}
	
}