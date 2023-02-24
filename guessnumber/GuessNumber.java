package guessnumber;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String args[])
    {
        boolean isCorrect = false;
        int minBound =0;
        int maxBound =1000;
        System.out.println("Think a number b/w 0 to 1000");
        while(isCorrect == false)
        {
            int mid = (minBound+maxBound)/2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("is "+mid+ " is the correct answer: true or false?");
            String isCorrect1 = scanner.next();
            if(isCorrect1.equalsIgnoreCase("true"))
            {
                System.out.println("The correct answer is "+mid);
                break;
            }
            else
            {
                System.out.println("is the number greater or less than "+mid + " Enter Greater or Less");
                String grtOrLess = scanner.next();
                if (grtOrLess.equalsIgnoreCase("greater"))
                {
                    minBound = mid;
                }
                else
                {
                    maxBound = mid;
                }
            }

        }
    }
}
