package bao.dev;

public class HelloWorld2 {
	public static void main(String[] args) {
		for ( int i = 2 ; i <= 9 ; i ++){		
					  for ( int j = 1; j<= 10 ; j ++) {
			            System.out.print(j  + " x " + i + " = " + (i * j) + "\t");
					  }
					  System.out.println();
		}			   
	}
}