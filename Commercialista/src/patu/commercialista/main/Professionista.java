package patu.commercialista.main;

public class Professionista extends Cliente {
	private String piva;
	private String ragSoc;
	private int nFattAnno;
	
	public int calcParcella() {
		return (int) (50 + 0.5 * nFattAnno);
	}
	
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public void setRagSoc(String ragSoc) {
		this.ragSoc = ragSoc;
	}
	public void setNFattAnno(int nFattAnno) {
		this.nFattAnno = nFattAnno;
	}
	
	public String getPiva() {
		return piva;
	}
	public String getRagSoc() {
		return ragSoc;
	}
	public int getNFattAnno() {
		return nFattAnno;
	}
}
