import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
//import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);
        
        System.out.println(sum);

        System.out.println(gaussianSumOfNumbers(3));

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    public static int sumOfNumbers(int n) {
    //for loop going over and adding it all up, create a variable
        int total_sum = 0;
        for(int i = 1; i <= n; i++){ //starts i at 1, no point for 0
            total_sum += i;
        }
        return total_sum;
    }
    
    
    
    public static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    public static int gaussianSumOfNumbers(int n) {
        return (n * (n + 1)) / 2;
    }

    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
