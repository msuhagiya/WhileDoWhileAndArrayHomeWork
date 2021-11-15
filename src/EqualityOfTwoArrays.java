//test the equality of two array
import java.util.Arrays;
public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        //defining arrays to be compared
int i[] = {20,45,36,50};
int j[] = {20,45,36,40};
//comparing two arrays using equals() method
if (Arrays.equals(i,j)){
    System.out.println("Arrays are equal");
}else {
    System.out.println("Arrays are not equal");
}
    }
}
