package Java.src;
import java.util.Scanner;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
        int remainder, sum = 0, temp; 

        if (x < 0){
            x = (-x);
        }

        if((x >= 0) && (x < 10)){
            return true;
        }
        
        temp = x;
        while(x > 0){
            remainder = x % 10;  //getting remainder  
            sum = (sum * 10) + remainder;    // add remainder each iteration
            x = x / 10;   // cut the last digit to continue
        }

        if (temp == sum) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            PalindromeNumber s = new PalindromeNumber();
            if(s.isPalindrome(num)){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}