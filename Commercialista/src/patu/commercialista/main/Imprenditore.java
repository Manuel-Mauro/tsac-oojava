package patu.commercialista.main;

public class Imprenditore extends Cliente {
	private String pivaSocieta;
	private String ragSocSocieta;
	private int nFattAnnoSocieta;
	
	public int calcParcella() {
		if(nFattAnnoSocieta < 100) {
			return 500;
		}else{
			return 500 + (nFattAnnoSocieta - 100) * 1;
		}
	}
	
	public void setPivaSocieta(String pivaSocieta) {
		this.pivaSocieta = pivaSocieta;
	}
	public void setRagSocSocieta(String ragSocSocieta) {
		this.ragSocSocieta = ragSocSocieta;
	}
	public void setNFattSocietaAnno(int nFattAnnoSocieta) {
		this.nFattAnnoSocieta = nFattAnnoSocieta;
	}
	
	public String getPivaSocieta() {
		return pivaSocieta;
	}
	public String getRagSocSocieta() {
		return ragSocSocieta;
	}
	public int getNFattAnnoSocieta() {
		return nFattAnnoSocieta;
	}
}
