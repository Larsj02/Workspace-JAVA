package PZuDezi;

public class VonVierer {

	public static void main(String Zahl) {
		int länge = Zahl.length(),teilZahl,teilSumme, potenz = 1,Summe=0;
		String teil;
		for (int i = 0; i < länge; i++) {
			teil = Zahl.substring(länge-i-1,länge-i);
			teilZahl = Integer.valueOf(teil);
			teilSumme = teilZahl*potenz;
			Summe = Summe + teilSumme;
			potenz = potenz * 4;
		}
		PMain.Cmain.SummeS = String.valueOf(Summe);
	}

}
