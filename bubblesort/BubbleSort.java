package bubblesort;
//Sort array elements using bubble sort technique
public class BubbleSort {
    public void bubbleSort(int array[])
    {
        int n = array.length;
        for(int i=0; i<n-1; i++)
        {
            int flag = 0;
            for(int j=0; j<n-i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    //Swapping adjacent elements
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
            {
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int array[] = {34,23,2,12,45,33};
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(array);

        //print array elements
        for(int elements: array)
        {
            System.out.print(elements+" ");
        }

    }

}
