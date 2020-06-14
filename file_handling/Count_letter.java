package file_handling;
import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
public class Count_letter {
    public static int count(char find,Path file) throws IOException {
        int count = 0;
        try 
        {
            InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (find == line.charAt(i)) {
                        count++;
                    }
                }
            }
        } catch (IOException x) {
            System.out.println(x);
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name ");
        Scanner s=new Scanner(System.in);
        String name=s.next();
        System.out.println("Enter char to find ");
        char find=s.next().charAt(0);
        Path file = Paths.get(name);
        int count = count(find, file);
        System.out.format("File "+file+" has "+count+" instances of letter "+find+"\n");
    }
}
