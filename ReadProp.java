import java.util.*;
import java.io.*;
import java.util.Scanner;
public class ReadProp {
    public static void main(String[] args) throws Exception {
        Properties prop = readPropertiesFile("C:/Users/nolog/OneDrive/Documents/credentials.properties");
        System.out.println("username: "+ prop.getProperty("username"));
        System.out.println("password: "+ prop.getProperty("password"));
        Scanner nm = new Scanner(System.in);
        System.out.print("Please type your name : ");
        String name=nm.next();
        System.out.println("Hello,"+name + " !");
        nm.close();
        System.exit(12);
    }
    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
           fis = new FileInputStream(fileName);
           prop = new Properties();
           prop.load(fis);
        } catch(FileNotFoundException fnfe) {
           System.out.println("Error 13 : Missing properties file.");
           System.exit(13);
        } catch(IOException ioe) {
           System.out.println("Error 14 : Unable to read properties file.");
           System.exit(14);
        } finally {
           fis.close();
        }
        return prop;
     }
}
