package bdlabbz2;
	
	import java.util.Scanner;

	public class Compare {
	    static double distance(int x1,int y1,int x2,int y2){
	        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	    }
	
	    public static void main(String[] args) {
	    	System.out.println("Welcome to line comparision program");

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter coordinates of the first line");
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();

	        System.out.println("Enter coordinates of the second line");
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();

	        double length = distance(x1, y1, x2, y2);
	        System.out.println("length of the line is " + length);

	        sc.close();
	    }
}
