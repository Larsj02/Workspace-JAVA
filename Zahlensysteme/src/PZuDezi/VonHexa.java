package PZuDezi;

public class VonHexa {

	public static void main(String Zahl) {
		int länge = Zahl.length(),teilZahl,teilSumme, potenz = 1,Summe=0;
		String teil;
		for (int i = 0; i < länge; i++) {
			teil = Zahl.substring(länge-i-1,länge-i);
			switch (teil.toLowerCase()) {
			case "a":
				teil = "10";
				break;
			case "b":
				teil = "11";
				break;
			case "c":
				teil = "12";
				break;
			case "d":
				teil = "13";
				break;
			case "e":
				teil = "14";
				break;
			case "f":
				teil = "15";
				break;
			}
			teilZahl = Integer.valueOf(teil);
			teilSumme = teilZahl*potenz;
			Summe = Summe + teilSumme;
			potenz = potenz * 16;
		}
		PMain.Cmain.SummeS = String.valueOf(Summe);
	}

}
