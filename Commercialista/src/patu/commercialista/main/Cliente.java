package patu.commercialista.main;

public abstract class Cliente {
	private String nome;
	private String cognome;
	private String cf;
	
	public abstract int calcParcella();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getCf() {
		return cf;
	}
}
