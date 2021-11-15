//Printing multiplication table using do while loop
public class PrintingMultiplicationTableWithDoWhile {
    public static void main(String[] args) {
        int i=1; int n;
        System.out.println("Multiplication table\n");
        //outer do while loop
        do{
            n=1; //inner do while loop
            do {
                System.out.printf("%2d", i*n); //used printf for format the multiplication table
                n=n+1;                         //used %2d for creating space between numbers
            }while (n<=3);
            System.out.println();
            i=i+1;
        }while(i<=3);
    }
}
