//Enter any five digits number and revers the number
public class ReversTheNumber {
    public static void main(String[] args) {

        int num = 35421; //declared five digit number
        int revers=0;
        System.out.println("Original five digit number: " + num);
        while (num!=0)
        {
            int remainder = num%10; //calculating remainder
            revers = revers*10+remainder;
            num=num/10;
        }
        System.out.println("Revers of given five digit number: " + revers);
    }
}
