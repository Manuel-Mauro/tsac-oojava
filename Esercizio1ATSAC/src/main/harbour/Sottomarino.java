package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */

public class Sottomarino extends Invasore {
	
	private int nArmamenti;
	private int stazza;


	public int getnArmamenti() {
		return nArmamenti;
	}


	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}


	public int getStazza() {
		return stazza;
	}


	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	@Override
	public int potenzaFuoco() {
		return (int) Math.ceil(nArmamenti * stazza / 4);
	}
	
}