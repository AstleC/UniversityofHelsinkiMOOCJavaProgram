
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int num = scanner.nextInt();
        
        int total=0;
        int i=0;
        while(i <= num){
            total += i;
            i++;
        }
        System.out.println("The sum is "t + total);

    }
}
