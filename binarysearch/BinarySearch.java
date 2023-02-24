package binarysearch;
import java.util.Scanner;

// Class to sort string array elements and search an element
//  using binary search algorithm
public class BinarySearch {
    public static void main(String[] args)
    {
        String sentence = "Hi every one how are you";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to be searched: ");
        String word = scanner.next();
        scanner.close();
        String array[] = sentence.split(" ");
        int size=array.length;
        sortArray(array,size);
        int result = binarySearch(word, array, size);
        if(result == -1)
        {
            System.out.println("Word is not present in given sentence");
        }
        else
        {
            System.out.println("Word found");
        }
    }
    /**
     * sorting array in ascending order
     * @param array
     * @param size
     */
    private static void sortArray(String[] array,int size)
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i].compareTo(array[j]) > 0 )
                {
                    //swapping
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
    }
    /**
     * Method to search element using binary search algorithm
     * @param word
     * @param array
     * @param size
     * @return
     */
    private static int binarySearch(String word, String[] array, int size)
    {
        int firstIndex = 0;
        int lastIndex = size-1;
        while(firstIndex<=lastIndex)
        {
            int mid = (firstIndex+lastIndex)/2;
            int result = word.compareTo(array[mid]);

            if(result == 0)
            {
                return mid;
            }
            if(result > 0)
            {
                firstIndex = mid+1;
            }
            else
            {
                lastIndex = mid-1;
            }
        }
        return -1;
    }
}
