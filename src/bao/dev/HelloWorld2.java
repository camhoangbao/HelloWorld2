package bao.dev;

public class HelloWorld2 {
	public static void main(String[] args) {
		double a = 2;
		double b = 15;
		double c = 1;
		double x1,x2,x; 
		
		double delta = (b*b)-(4*a*c);
		if (delta<0) { 
		 System.out.println("Phuong Trinh vo nghiem");};
	   if (delta>0 ) {
	   	x1=(-b+Math.sqrt(delta))/(2*a);
	   	x2=(-b-Math.sqrt(delta))/(2*a);
	   	System.out.println("Nghiem cua x1 la :"+x1);
	   	System.out.println("Nghiem cua x2 la :"+x2);
	   }
	   if (delta==0) {
	   	x=((-b)/(2*a));
	   	System.out.println("Nghiem kep cua phuong trinh la:"+x);
	   }
	}
}