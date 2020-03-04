package PDeziZu;

public class ZuBinär {

	public static void main(String Zahl) {
		int zzahl = Integer.valueOf(Zahl);
		String zSumm = "";
		do {
			if(zzahl % 2 == 1) {
				zSumm="1"+zSumm;
			}else {
				zSumm="0"+zSumm;
			}
			zzahl = zzahl /2;
		} while (zzahl != 0);
		PMain.Cmain.SummeS = zSumm;
	}

}
