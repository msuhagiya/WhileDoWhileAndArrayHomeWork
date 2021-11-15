//Find common elements between two arrays
public class FindCommonElementsOfTwoStringArray {
    public static void main(String[] args) {
        //declared two string arrays
        String strarray1[] = {"Soft","Sql","Ware","Testing","Java"};
        String strarray2[] = {"Soft","Ware","Sql","Development","Java"};
        for (int i=0; i<strarray1.length; i++)//using for loop comparing each elements of array
        {
            for (int j=0; j<strarray2.length; j++)
            {
                if (strarray1[i].equals(strarray2[j]))//used in build method of .equals()
                {
                    System.out.print(" " + strarray1[i]);
                }
            }
        }

    }
}
