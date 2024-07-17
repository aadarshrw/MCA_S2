import java.util.Scanner;
class authexception extends Exception
{
    authexception(String message)
    {
        super(message);
    }
}
class authenticator
{
    public static void main(String args[])
    {
        String user = "user";
        String pass = "pass";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username = s.next();
        System.out.print("Enter the password: ");
        String password = s.next();
        try
        {
            if(username.equals(user) && password.equals(pass))
            {
                throw new authexception("Login successful!!");
            }
            else
            {
                throw new authexception("Login Failed!!!");
            }
        }
        catch(authexception e)
        {
            System.out.println(e.getMessage());
        }
    }
}