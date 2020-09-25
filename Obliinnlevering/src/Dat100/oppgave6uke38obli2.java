package Dat100;

public class oppgave6uke38obli2 {
	
	
	static int[] tabell= {3,3,5,5,5};
	static int[] tabel2= {4,4,1,1,1};

			
	//a)
	public static void skrivUt (int[] tabell) {
		
		for (int i:tabell) {
			
			System.out.print(i + " ");
			
		}
		System.out.println();
	}
	
	//b)
	public static String tilStreng (int[] tabell) {
		
		String svarTekst="[";
		
		for (int i=0; i<tabell.length; i++) {
			
			if (i==tabell.length-1) {
				
				svarTekst+=(tabell[i] + "]");
				
			} else {
				svarTekst+=(tabell[i] + ", ");
			}
		}
			return svarTekst;
	}
	
	//c)
	public static int summerutvfor (int[] tabell) {
		
		int sum=0;
		
		for (int i: tabell) {
			
			sum+=i;
		}
		return sum;
	}
	
	public static int summerfor (int[] tabell) {
		
		int sum=0;
		
		for (int i=0; i<tabell.length; i++) {
			
			sum+=tabell[i];
		}
		return sum;
	}
	
	public static int summerwhile (int[] tabell) {
		int sum=0;
		
		int i=0;
		
		while(i<tabell.length) {
			
			sum+=tabell[i];
			
			i++;
		}
		return sum;
	}
	
	//d)
	public static boolean finnesTall (int[] tabell, int tall) {
		for (int i: tabell) {
			
			if (i==tall) {
				
				return true;
			}
		}
		return false;
	}
		
	//e)
	public static int posisjonTall (int[] tabell, int tall) {
		
		for (int i=0; i<tabell.length; i++) {
			
			if (tabell[i]==tall) {
				
				return i;
			}
		}
	return -1;
	}
		
	//f)
	public static int[] reverser(int[] tabell) {
		
		int[] nyTabell= new int[tabell.length];
		
		for(int i=0; i<tabell.length; i++) {
			
			nyTabell[i]=tabell[tabell.length-i-1];
		}
		return nyTabell;
	}
		
	//g)
	public static boolean erSortert (int[] tabell) {
		
		int storsteTall=tabell[0];
		
		for (int i=1; i<tabell.length;i++) {
			
			if (storsteTall>tabell[i]) {
				
				return false;
				
			} else {
				storsteTall=tabell[i];
			}
		}
		return true;			
	}
		
	//h)
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		int nyTabell[]=new int[tabell1.length+tabell2.length];
		
		for (int i=0; i<tabell1.length; i++) {
			
			nyTabell[i]=tabell1[i];
		}
		for (int i=tabell1.length; i<(tabell2.length+tabell1.length); i++) {
			
			nyTabell[i]=tabell2[(i-tabell1.length)];
		}
		return nyTabell;
	}
				
	public static void main(String[] args) {
		//a
		System.out.println("a) skrive ut en tabell med heltal: "); 
		skrivUt(tabell);
		System.out.println();
		//b
		System.out.println("b) returnere en string med innholdet av en tabell: ");
		System.out.println(tilStreng(tabell));
		System.out.println();
		//c
		System.out.println("c.1) utvidet for løkke: )");
		System.out.println("sum: " + summerutvfor(tabell));
		System.out.println();
		System.out.println("c.2) for løkke: )" + summerutvfor(tabell));
		System.out.println("sum: " + summerfor(tabell));
		System.out.println();
		System.out.println("c.3) while løkke: )" + summerutvfor(tabell));
		System.out.println("sum: " + summerwhile(tabell));
		System.out.println();
		//d
		System.out.println("d) finnes tall i tabell: ");
		System.out.println(finnesTall(tabell, -1));
		System.out.println();
		//e
		System.out.println("e) tallets posisjon i tabellen er: ");
		System.out.println(posisjonTall(tabell, 5));
		System.out.println();
		//f
		System.out.println("f) tabbel i modsatt rekkefølge: ");
		System.out.println(tilStreng(reverser(tabell)));
		System.out.println();
		//g
		System.out.println("g) er tabellen sortert i stigande rekkefølge: ");
		System.out.println(erSortert(tabell));
		System.out.println();
		//h
		System.out.println("h) sammen satte tabeller: ");
		System.out.println(tilStreng(settSammen(tabell, tabel2)));
	}
			
}