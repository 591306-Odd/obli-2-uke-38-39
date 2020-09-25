package Dat100;

public class oppgave3uke39obli2 {
	
	static int[][] matrise1={
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	static int[][] matrise2= {
			{1,2,3},
			{4,5,6},
			{7,8,9}

	};
	static int[][] matrise3= {
			{0,0,1,1,1,1,0,0},
			{0,1,0,0,0,0,1,0},
			{0,1,0,0,0,0,1,0},
			{0,0,1,1,1,1,0,0},
			{0,1,0,0,0,0,1,0},
			{0,1,0,0,0,0,1,0},
			{0,1,0,0,0,0,1,0},
			{0,0,1,1,1,1,0,0}
	};
	
	
	//a
	public static void skrivUtv1(int[][] matrise) {
		
		for(int[] i:matrise) {
			
			for(int j:i) {
				
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
	
	
	//b
	public static String tilStreng(int[][] matrise) {
		
		String tekst="";
		
		for(int[] i:matrise) {
			
			for(int j:i) {
				
				tekst+=(j+" ");
			}
			tekst+="\n";
		}
		return tekst;
	}
		
	//c
	public static int[][] skaler(int tall, int[][] matrise) {
			
		int[][] nyMatrise=new int[matrise.length][matrise[0].length];
				
		for(int i=0; i<matrise.length; i++) {
				
			for(int j=0; j<matrise[i].length; j++) {
				
				nyMatrise[i][j]=matrise[i][j]*tall;
			}
		}
		return nyMatrise;
	}

	//d
	public static boolean erLik(int[][] mat1, int[][] mat2) {
			
		for(int i=0; i<mat1.length; i++) {
				
			if (mat1[i].length!=mat2[i].length) {
					
				return false;
					
			} else {
				for(int j=0; j<mat1[i].length; j++) {
						
					if (mat1[i][j]!=mat2[i][j]) {
							
						return false;
					}
				}
			}
		}
		return true;
	}
		
	//e
	public static int[][] speile(int [][] matrise) {
			
		int[][] speilaMat=new int[matrise.length][matrise[0].length];
			
		for (int i=0; i<matrise.length; i++) {
				
			for (int j=0;j<matrise[i].length;j++) {
					
				speilaMat[j][i]=matrise[i][j];
			}
		}
		return speilaMat;
	}
	
	
	
	//f
	public static int [][] multipliser(int[][] a,int[][] b){
		
		int [][] nymat = new int [a.length][b[0].length];
		
		if(a.length==b[0].length) {
			
			for(int row = 0; row < nymat.length; row++) {
				
				for(int col = 0; col < nymat.length; col++) {
					
					int sum = 0;
					
					for(int colb = 0; colb < nymat.length; colb++) {
						
						sum += a[row][colb] * b[colb][col];
					}
					nymat[row][col] += sum;
				} 
			}
		}else {
			throw new UnsupportedOperationException("antall kolonner i første matrise må ver like lang som antall rad i andre matrise");
		}
		
		return nymat;	
	}
	
	public static void main(String[] args) {

		//a
		System.out.println("oppgave a:");
		skrivUtv1(matrise1);
		System.out.println();
		//b
		System.out.println("oppgave b:");
		System.out.print(tilStreng(matrise1));
		System.out.println();
		//c
		System.out.println("oppgave c:");
		skrivUtv1(skaler(2,matrise1));
		System.out.println();
		//d
		System.out.println("oppgave d:");
		System.out.print(erLik(matrise1,matrise2));
		System.out.println();
		//e
		System.out.println();
		System.out.println("oppgave e:");
		skrivUtv1(speile(matrise3));
		System.out.println();
		//f
		System.out.println("oppgave f:");
		skrivUtv1(multipliser(matrise1,matrise2));
	}

}
