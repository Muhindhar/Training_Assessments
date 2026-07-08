package Assessment1;
import java.util.*;

public class LuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of participants : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the numbers :");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int first = 0, second = 0, third = 0;

        for(int i=0;i<n;i++) {

            int num = arr[i];
            int sum = 0;

            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }

            while(sum > 9) {
                int temp = 0;
                while(sum > 0) {
                    temp += sum % 10;
                    sum /= 10;
                }
                sum = temp;
            }

            if(sum == 7 && first == 0) {
                first = arr[i];
            }
            else if(sum == 5 && second == 0) {
                second = arr[i];
            }
            else if(sum == 3 && third == 0) {
                third = arr[i];
            }
        }

        System.out.println("First prize token : " + first);
        System.out.println("Second prize token : " + second);
        System.out.println("Third prize token : " + third);
    }
}
