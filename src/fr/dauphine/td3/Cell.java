package fr.dauphine.td3;

public class Cell {
	private final String val;
	private Cell suivant;
	/**
	 * 
	 * @param val
	 * @param suivant
	 */
	public Cell(String vale, Cell suivante) {
		val=vale;
		suivant=suivante;
	}
	public Cell(String valeur) {
		this.val=valeur;
	}
	/**
	 * 
	 * @return
	 */
	public String getVal() {
		return val;
	}
	/**
	 * 
	 * @return
	 */
	public Cell getSuivant() {
		return this.suivant;
	}
	/**
	 * 
	 * @param suivant
	 */
	public void setSuivant(Cell suivant) {
		this.suivant = suivant;
	}
	
	
	

}
