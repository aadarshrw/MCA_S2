import java.util.Scanner;
import java.io.*;

class FileReadWriter {
    public static void writetoFile(String content, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Content Written!!!");
        } catch (IOException e) {
            System.out.println("File not found!!! " + e.getMessage());
        }
    }

    public static String readfromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader read = new FileReader(filename);
            BufferedReader buffread = new BufferedReader(read);
            String line;
            while ((line = buffread.readLine()) != null) {
                content.append(line).append("\n");
            }
            buffread.close();
        } catch (IOException e) {
            System.out.println("File Not Found!!! " + e.getMessage());
        }
        return content.toString();
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = s.next();
        s.nextLine(); // Consume the newline character left by next()
        System.out.println("Enter the content: ");
        String content = s.nextLine();
        writetoFile(content, filename);
        System.out.println("The written content is: ");
        String readvalue = readfromFile(filename);
        System.out.println(readvalue);
        s.close();
    }
}
