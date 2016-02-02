package patu.commercialista.main;

public class Commercialista {
	
	private Cliente[] clienti;
	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	};
	public Cliente[] getClienti() {
		return clienti;
	};
	
	public int calcolaReddito(){
		int tot = 0;
		for(Cliente c:clienti) {
			tot += c.calcParcella();
		}
		return tot;
	}
}
