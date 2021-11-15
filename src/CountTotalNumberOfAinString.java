//Enter any string and count the total number of a in string
public class CountTotalNumberOfAinString {
    public static void main(String[] args) {
        String str = "Automation Software testing";
        System.out.println("String is: " + str);
        //declared variables
        int count = 0;
        int i = 0;
       while (i<str.length()){
           if (str.charAt(i)=='a' || str.charAt(i)=='A')
               count++;
           i++;

        }
        System.out.println("The character 'A' or 'a' used: " + count + "times");
    }
}

