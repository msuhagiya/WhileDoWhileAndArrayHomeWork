//Enter array and sort the value of array in ascending order
public class SortTheValuesOfArray {
    public static void main(String[] args) {
        int arr[] = {3,5,-2,9,13,50,20};
        System.out.println("Elements of original array");
        int temp=0;
        int i = 0;
        while (i< arr.length)
        {
            System.out.print(arr[i]+ " ");
            i++;
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (i = 0; i < arr.length; i++) //used for loop to run the loop to arrange the number in ascending
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }
    }
