package Test_3;
import java.util.*;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.nextLine();
		if(input.length()>2) {
			System.out.println(input.substring(0,2));
		}
		else if(input.length()==1) {
			System.out.println(input+"@");
		}
		else {
			System.out.println("@@");
		}	
	}
}
