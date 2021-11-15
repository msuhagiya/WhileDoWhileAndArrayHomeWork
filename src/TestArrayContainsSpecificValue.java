//Test if array contains specific value
public class TestArrayContainsSpecificValue {
    public static void main(String[] args) {
        int arr[] = {30,50,40,70,60,80};
        int speValue = 70;
        boolean flag = false;
        for (int i=0; i<arr.length; i++){
            if (speValue==arr[i]){
                System.out.println("The specific value is: " + speValue);
                flag = true;
            }
        }
        if (flag==false){
            System.out.println("specific value of element is not found");
        }
    }
}
