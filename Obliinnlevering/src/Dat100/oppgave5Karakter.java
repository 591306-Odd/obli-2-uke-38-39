package Dat100;

import static javax.swing.JOptionPane.*;

public class oppgave5Karakter {

	public static void main(String[] args) {
		
		for (int i = 1; i<= 10; i++) {
		int poeng = Integer.parseInt(showInputDialog("Elev " + i + "\nPoeng: "));
		
		if(poeng >= 90 && poeng <= 100) {
			showMessageDialog(null, "A er Eleven sin karater");
		}else if(poeng >= 80 && poeng <= 89) {
			showMessageDialog(null, "B er Eleven sin karater");
		}else if(poeng >= 60 && poeng <= 79) {
			showMessageDialog(null, "C er Eleven sin karater");
		}else if(poeng >= 50 && poeng <= 59) {
			showMessageDialog(null, "D er Eleven sin karater");
		}else if(poeng >= 40 && poeng <= 49) {
			showMessageDialog(null, "E er Eleven sin karater");
		}else if(poeng >= 0 && poeng <= 39) {
			showMessageDialog(null, "F er Eleven sin karater");
		}else if(poeng > 100 || poeng < 0) {
			showMessageDialog(null, "Ugyldig poeng sum!");
			i--;
		}
	}
	}
}
