package fr.dauphine.td3;

public class CellGen <T> {
	private T val;
	private CellGen suivant;
	/**
	 * 
	 * @param val
	 * @param suivant
	 */
	public CellGen(T vale, CellGen suivante) {
		val=vale;
		suivant=suivante;
	}
	public CellGen(T valeur) {
		this.val=valeur;
	}
	/**
	 * 
	 * @return
	 */
	public T getVal() {
		return val;
	}
	/**
	 * 
	 * @return
	 */
	public CellGen getSuivant() {
		return this.suivant;
	}
	/**
	 * 
	 * @param suivant
	 */
	public void setSuivant(CellGen suivant) {
		this.suivant = suivant;
	}

}
