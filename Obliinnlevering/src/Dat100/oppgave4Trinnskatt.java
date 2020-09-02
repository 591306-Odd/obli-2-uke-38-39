package Dat100;

import static javax.swing.JOptionPane.*;

public class oppgave4Trinnskatt {
	
	public static void main(String[] args) {
		
	double inntekt = Double.parseDouble(showInputDialog("Brutto: "));
	int trinn = 0;
	double skatt = 0;
	
	if(inntekt < 180800) {
		skatt=0;
		trinn=0;
	}else if(inntekt > 180800 && inntekt < 254500) {
		skatt =inntekt * 0.019;
		trinn=1;

	}else if(inntekt > 254500 && inntekt < 639750) {
		skatt =inntekt * 0.042;
		trinn=2;

	}else if(inntekt > 639750 && inntekt < 99550) {
		skatt =inntekt * 0.132;
		trinn=3;

	}else if(inntekt > 999550 ) {
		skatt =inntekt * 0.162;
		trinn=4;

	}
	showMessageDialog(null,"Brutto: " + inntekt + "\nDitt trinn: " + trinn + "\nSkatt: " + skatt );
		

	
}

}


