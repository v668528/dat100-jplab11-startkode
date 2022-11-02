package no.hvl.dat100.jplab11.oppgave4;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;
import java.io.PrintWriter;


public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn)  {

		boolean sjekket = false;
		String melding = samling.toString();

			
		try {
		
		PrintWriter skriver = new PrintWriter(filnavn);
		
	
		skriver.println(melding);
		
		
		
		skriver.close();
		
		return sjekket = true;
		
	} catch (FileNotFoundException e) {
	
	  System.out.println("Error");
	  e.printStackTrace();
	  return sjekket;
	}
	
	}
}
