//Sum value of an int array
public class SumValueOfIntArray {
    public static void main(String[] args) {
        int arr[] = {6,9,13,15,45}; //declared array
        int sum = 0;
        int i=0;
        while (i<arr.length){
            sum=sum+arr[i];
            i++;
        }
        System.out.println("Sum of array elements: " + sum);

    }
}
