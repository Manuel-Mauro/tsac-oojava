package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	private Porto port;

	public Gioco(Porto p) {
		this.port = p;
	}
	
	public void attacco(Invasore invasori[]){
		for(Invasore inv: invasori){
			int potenzadifuoco = inv.potenzaFuoco();
			port.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
		}
	}
	
	public boolean portoDistrutto(){
		return port.getDimensioneSqMetersNonDistrutta() <= 0; 
	}

}
