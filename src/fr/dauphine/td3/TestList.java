package fr.dauphine.td3;

public class TestList {

	public static void main(String[] args) {
		
	MyList ml = new MyList();
	ml.addLast("tatu");
    ml.add("toto");
	ml.add("titi");
	ml.addLast("tutu");
	
    System.out.println(ml.toString());
	}

}
