import java.util.Scanner;
class strsort
{
    public static void main(String args[])
    {
        int i,j;
        String temp;
        Scanner s = new Scanner(System.in);
        String a[] = new String[10];
        System.out.println("Enter 10 strings: ");
        for(i=0;i<10;i++)
        {
            a[i] = s.next();
        }
        System.out.println("\nThe strings before sorting: ");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(a[j].compareTo(a[i])>0)
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nThe strings after sorting: ");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}