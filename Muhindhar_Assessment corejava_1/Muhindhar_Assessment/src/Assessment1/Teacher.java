package Assessment1;
import java.util.*;
public class Teacher {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of subjects");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the marks");
	int b=0;
	while(true) {
		int a = sc.nextInt();
		if(a<0) {
			break;
		}
		arr[b++]=a;
	}
	System.out.println("Scores before processing");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i] + " ");
	}
	System.out.println("Scores after processing:");
	for(int i=0;i<n;i++) {
		int m = arr[i];
		int res;
		
		if(m%9==0) {
			res = 4;
		}
		else if(m%8==0) {
			res=2;
		}
		else if(m%10==3) {
			res=3;
		}
		else if(m%2!=0) {
			res=1;
		}
		else {
			res=0;
		}
		System.out.print(res + " ");
	}
	
	}
}
