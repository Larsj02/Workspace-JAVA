package PDeziZu;

import PMain.Cmain;

public class ZuHexa {

	public static void main(String Zahl) {
		int kZahl = Integer.valueOf(Zahl),full;
		double gZahl,x;
		String zSumm = "";
		gZahl = kZahl;
		do {
			kZahl = kZahl /16;
			gZahl = gZahl /16;
			x = gZahl - kZahl;
			if(x > 0) {
				full = (int) (x*16);
				String Ziffer = String.valueOf(full);
				if(full >= 15) {
					Ziffer="F";
				}else if(full >= 14) {
					Ziffer="E";
				}else if(full >= 13) {
					Ziffer="D";
				}else if(full >= 12) {
					Ziffer="C";
				}else if(full >= 11) {
					Ziffer="B";
				}else if(full >= 10) {
					Ziffer="A";
				}
				zSumm=Ziffer+zSumm;
			}else {
				zSumm="0"+zSumm;
			}
		} while (kZahl != 0);
		Cmain.SummeS = zSumm;
	}

}
