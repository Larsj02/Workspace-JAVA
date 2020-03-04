package PDeziZu;

import PMain.Cmain;

public class ZuOktal {

	public static void main(String Zahl) {
		int kZahl = Integer.valueOf(Zahl),full;
		double gZahl,x;
		String zSumm = "";
		gZahl = kZahl;
		do {
			kZahl = kZahl /8;
			gZahl = gZahl /8;
			x = gZahl - kZahl;
			if(x > 0) {
				full = (int) (x*8);
				zSumm=full+zSumm;
			}else {
				zSumm="0"+zSumm;
			}
		} while (kZahl != 0);
		Cmain.SummeS = zSumm;
	}

}
