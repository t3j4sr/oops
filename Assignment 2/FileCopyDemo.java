import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("input.txt");   // Source file
            fout = new FileOutputStream("output.txt"); // Destination file

            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }

            System.out.println("File copied successfully!");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (fin != null) fin.close();
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}