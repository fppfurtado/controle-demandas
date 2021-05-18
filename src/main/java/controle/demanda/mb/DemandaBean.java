package controle.demanda.mb;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import controle.demanda.dao.DAO;
import controle.demanda.dao.DemandaDao;
import controle.demanda.entity.DemandaEntity;
import controle.demanda.entity.ProtocoloEntity;
import controle.demanda.entity.ProvidenciaEntity;
import dominio.rotina.Demanda;
import dominio.rotina.Demanda.Providencia;
import dominio.rotina.Protocolo;

@Named
@SessionScoped
public class DemandaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private DemandaEntity demanda = new DemandaEntity();
	// private ProtocoloEntity protocolo = new ProtocoloEntity();
	// private ProvidenciaEntity providencia = new ProvidenciaEntity();
	@Inject
	private DemandaDao dao;
//	private DemandaDao demandaDao;
//	private ProtocoloDao protocoloDao;
//	private ProvidenciaDao providenciaDao;

	public DemandaEntity getDemanda() {
		return demanda;
	}

	public List<DemandaEntity> getListaDemandas() {
		return null;
	}
	
	/*
	 * public List<DemandaEntity> getListaDemandas() { return null; }
	 * 
	 * public String registrarDemanda() { this.demanda = new DemandaEntity(); return
	 * "form-demanda?faces-redirect=true"; }
	 * 
	 * public String editarDemanda(DemandaEntity demanda) { this.demanda = demanda;
	 * return "form-demanda?faces-redirect=true"; }
	 */
	public String carregarView(String view) {
		return view + "?faces-redirect=true";
	}

	public String gravarDemanda() {
		
		// A demanda já existe no banco de dados?
		if(demanda.getId() == null) {
			// Não. Adiciona a demanda.
			dao.adicionar(demanda);
		} else {
			// Sim. Atualiza a demanda.
			dao.atualizar(demanda);
		}
		
		return carregarView("lista-demandas");
			
	}

	/*
	 * public ProtocoloEntity getProtocolo() { return protocolo; }
	 * 
	 * public String registrarProtocolo(DemandaEntity demanda) {
	 * 
	 * this.protocolo = demanda.getProtocolo() == null ? new ProtocoloEntity() :
	 * demanda.getProtocolo(); this.demanda = demanda;
	 * 
	 * return "form-protocolo?faces-redirect=true";
	 * 
	 * }
	 * 
	 * public String excluirProtocolo() { demanda.setProtocolo(null); return
	 * "lista-demandas?faces-redirect=true"; }
	 * 
	 * public String gravarProtocolo() { demanda.setProtocolo(protocolo); protocolo
	 * = new ProtocoloEntity(); return "lista-demandas?faces-redirect=true"; }
	 * 
	 * public ProvidenciaEntity getProvidencia() { return providencia; }
	 * 
	 * public String registrarProvidencia() { if (providencia == null) providencia =
	 * new ProvidenciaEntity();
	 * 
	 * return "form-providencia?faces-redirect=true"; }
	 * 
	 * public String editarProvidencia(ProvidenciaEntity providencia) {
	 * this.providencia = providencia; return
	 * "form-providencia?faces-redirect=true"; }
	 * 
	 * public String excluirProvidencia() {
	 * demanda.getProvidencias().remove(providencia); providencia = null; return
	 * "form-demanda?faces-redirect=true"; }
	 * 
	 * public String gravarProvidencia() {
	 * demanda.getProvidencias().add(providencia); providencia = new
	 * ProvidenciaEntity(); return "form-demanda?faces-redirect=true"; }
	 */

}