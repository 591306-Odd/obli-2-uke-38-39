package Dat100;

import static javax.swing.JOptionPane.*;

public class oppgave6Fakultet {

	public static void main(String[] args) {
		
		
		int number = Integer.parseInt(showInputDialog("Skriv inn Heiltall:" ));
		
		if(number > 0) {
			
			  int i,fact=1;    
			  for(i=1;i<=number;i++){    
			      fact=fact*i;
			  }
			showMessageDialog(null,"Fakultet av: " + number + " er " + fact);
		}else {
			showMessageDialog(null,"Talet må ver større en 0");
		}
		
	}
}