package scanner;
import java.util.Scanner;
public class Scannerclass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.nextLine(); 
		System.out.println("enter your age");
        int age = scan.nextInt();
        System.out.println("enter your mobile number");
        long mobileNo = scan.nextLong();
        System.out.println("enter your cgpa");
        double cgpa = scan.nextDouble();
  
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
		
	}

}
