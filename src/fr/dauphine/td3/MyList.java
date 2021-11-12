package fr.dauphine.td3;

public class MyList {

	private Cell premier;
	private int size;
	/**
	 * 
	 * @param elem
	 * Création d'un nouveau Cellule de la liste
	 * qui sera la nouvelle tete de la liste
	 * Et la cellule suivante sera l'ancienne tete de la liste
	 */
	public void add(String elem) {
		Cell c =new Cell(elem,premier);
		premier=c;
		size++;
		//System.out.println(premier.getSuivant());
	}
	/**
	 * Pour ajouter un élèment à la fin de la liste
	 * D'abord on doit vérifier si la liste est vide, si elle est vide donc on ajoute un élèment 
	 * Sinon on chercher le dernier element 
	 * Aprés on ajoute l'élèment souhaité
	 * @param valeur
	 */
	public int size() {
		return this.size;
	}
	public void addLast(String valeur) {
		Cell c =new Cell(valeur,null);
		if(this.premier == null) {
			this.premier=c;
			size++;
			return;
		}
		
			Cell t=this.premier;
			for(int i=0; i<size-1; ++i){
				t=t.getSuivant();
			}
			t.setSuivant(c);
			size++;
		}

	public void add(String valeur,int i) {
		Cell t=premier;
		for(int j=0; j<i;j++) {
			t=t.getSuivant();
		}
		Cell c=new Cell(valeur,t.getSuivant());
		t.setSuivant(c);
		size++;
	}
	/**
	 * Pour afficher les élèments de la liste séparés par des virgules en utilsant StringBuilder
	 */
	public String toString() {
		Cell p=premier;
		StringBuilder S=new StringBuilder();

		while (p.getSuivant()!=null) {
			S.append(p.getVal()).append(",");
			p=p.getSuivant();
		}
		return S.toString() ;	
	}
	/**
	 * Renvoyer le contenu de la cellule de l’index i
	 * @param i
	 * @return
	 */
	public String get(int i) {
		if(i<0 || i>this.size()) {
			throw new IndexOutOfBoundsException(i);
		}
		Cell t=premier;
		for(int j=0;j<i;j++) {
			t=t.getSuivant();
		}
		return t.getVal();
	}
	/**
	 * Retourne la somme des lettres qui sont dans la liste
	 * @return
	 */
	public int sumLettres() {
		Cell temp=this.premier;
		int compteur=0;
		while(temp!=null) {
			compteur+=temp.toString().length();
			temp=temp.getSuivant();
		}
		return compteur;
	}



}
