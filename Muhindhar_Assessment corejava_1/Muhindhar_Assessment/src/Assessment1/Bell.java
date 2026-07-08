package Assessment1;
import java.util.*;
public class Bell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range :");
		int a = sc.nextInt();
		System.out.println("Enter the ending range ");
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%10==0) {
				System.out.println("Dong");
			}
			else if(i%5==0) {
				System.out.println("Ding");
			}
			else {
				System.out.print(i+ " ");
			}
		}
	}
}
