import java.util.Scanner;
class employee
{
    int eno,esalary;
    String ename;
    employee()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.print("Enter the Employee Number: ");
        eno = s.nextInt();
        System.out.print("Enter the Employee Name: ");
        ename = s.next();
        System.out.print("Enter the Employee Salary: ");
        esalary = s.nextInt();
    }
    void display()
    {
        System.out.println("---------------------");
        System.out.println("Employee Number: "+eno+"\nEmployee Name: "+ename+"\nEmployee Salary: "+esalary);
    }
}
class searchemp
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i,n,search;
        System.out.print("Enter the number of employees: ");
        n = s.nextInt();
        employee e[] = new employee[n];
        for(i=0;i<n;i++)
        {
            e[i] = new employee();
        }
        System.out.print("The employee number to be searched: ");
        search = s.nextInt();
        for(i=0;i<n;i++)
        {
            if(e[i].eno == search)
            {
                e[i].display();
            }
        }
    }
}