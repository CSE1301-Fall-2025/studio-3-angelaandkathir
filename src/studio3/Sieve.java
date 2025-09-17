import java.util.Scanner;
public class Sieve {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the number n equal to?");
        int n = scanner.nextInt();
        boolean[] userArray = new boolean[n+1];
        for (int i = 2; i <= n; i++){
            userArray[i] = true;
        }
        for (int i = 2; i*i <= n; i++){
            if (userArray[i]){
                for (int j = i*i; j <= n; j += i){
                    userArray[j] = false;
                }
            }
        }
        System.out.println("Prime numbers from 1 to " + n);
        for (int i = 2; i <= n; i++){
            if (userArray[i]){
                System.out.print(i + " ");
            }
        }
    }  
    
}

