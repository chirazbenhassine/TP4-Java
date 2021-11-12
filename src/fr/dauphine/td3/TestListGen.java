package fr.dauphine.td3;

public class TestListGen {

	public static void main(String[] args) {
		ListeGen listeGen = new ListeGen();
		listeGen.addLast("tatu");
		listeGen.add("toto");
		listeGen.add("titi");
		listeGen.addLast("tutu");
	    System.out.println(listeGen.toString());
		}
	}

