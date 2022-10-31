package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) throws FileNotFoundException {

		boolean sjekket = false;
		
		do {
			
		try {
		
		PrintWriter skriver = new PrintWriter(filnavn);
		
		for (String samlinger: samling.getSamling()) {
			skriver.println(samlinger);
		}
		
		}
		
		skriver.close();
		
		}
	}
}
