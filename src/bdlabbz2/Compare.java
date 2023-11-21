package bdlabbz2;
	
	import java.util.Scanner;

	public class Compare {
	    static double distance(int x1,int y1,int x2,int y2){
	        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	    }
	
	    public static void main(String[] args) {
	    	System.out.println("Welcome to line comparision program");

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter first coordinates of the first line");
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();

	        System.out.println("Enter second coordinates of the first line");
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();

	        System.out.println("Enter first coordinates of the second line");
	        int x3 = sc.nextInt();
	        int y3 = sc.nextInt();

	        System.out.println("Enter second coordinates of the second line");
	        int x4 = sc.nextInt();
	        int y4 = sc.nextInt();

	        double length1 = distance(x1, y1, x2, y2);
	        double length2 = distance(x3, y3, x4, y4);
	        System.out.println("length of the line 1 is " + length1);
	        System.out.println("length of the line 2 is " + length2);

	        if(Double.compare(length1, length2) == 0){
	            System.out.println("line1 is equal to line2");
	        }
	        else {
	        	System.out.println("line1 is not equal to line2");
	        }

	        sc.close();
	    }
}
