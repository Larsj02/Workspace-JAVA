package PMain;

import java.util.Scanner;

public class CMain {
	
	static Scanner scan = new Scanner(System.in);
    static float a,b,c,d,e,erg1,erg2,erg3,erg4,erg5,ergh1,ergh2,ergh3,ergh4,ergh5;

	public static void main(String[] args) {
		Eingabe();
		Rechnung();
		Ausgabe();
	}
	
	static void Eingabe() {		
        System.out.println("Rechnungen:");
        System.out.println("a + b");
        System.out.println("b - a");
        System.out.println("b * c");
        System.out.println("e²");
        System.out.println("a / d");
        System.out.println("");
        
		System.out.println("Bitte geben sie einen Wert für a ein: ");
        a = scan.nextFloat();
        
        System.out.println("Bitte geben sie einen Wert für b ein: ");
        b = scan.nextFloat();
        
        System.out.println("Bitte geben sie einen Wert für c ein: ");
        c = scan.nextFloat();
        
        System.out.println("Bitte geben sie einen Wert für d ein: ");
        d = scan.nextFloat();
        
        System.out.println("Bitte geben sie einen Wert für e ein: ");
        e = scan.nextFloat();
        
        scan.close();
	}
	
	static void Rechnung() {
        erg1 = a + b;
        erg2 = b - a;
        erg4 = b * c;
        erg5 = e*e;
        
        if(d !=0) {
        	erg3 = a / d;
        	ergh3 = erg3*erg3;
        }
        
        ergh1 = erg1*erg1;
        ergh2 = erg2*erg2;
        ergh4 = erg4*erg4;
        ergh5 = erg5*erg5;
	}
	
	static void Ausgabe() {
		System.out.println("Das Ergebnis von "+a+" + "+b+" ist "+erg1+" ("+erg1+"² ist "+ergh1+")");
        System.out.println("Das Ergebnis von "+b+" - "+a+" ist "+erg2+" ("+erg2+"² ist "+ergh2+")");
        System.out.println("Das Ergebnis von "+b+" * "+c+" ist "+erg4+" ("+erg4+"² ist "+ergh4+")");
        System.out.println("Das Ergebnis von "+e+"² ist "+ erg5+" ("+erg5+"² ist "+ergh5+")");
        
        if(d!=0) {
        	System.out.println("Das Ergebnis von "+a+" / "+d+" ist "+erg3+" ("+erg3+"² ist "+ergh3+")");
        }else {
        	System.out.println(a+" / 0 kann nicht gerechnet werden da man nicht durch 0 teilen kann!");
        }
	}
	
	/*
     * Name: Lars Johnen
     * Klasse: 19IT2
     * Datum: 15.09.2019
     * Zweck: Code Neu Geschrieben weil der alte Code weg war
     * 
     * Name: Lars Johnen
     * Klasse: 19IT2
     * Datum: 20.09.2019
     * Zweck: Den Code geordnet in funktionen gepackt
     */

}
