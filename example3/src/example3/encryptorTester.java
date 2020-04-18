package example3;

import java.io.IOException;
import java.util.Scanner;

public class encryptorTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Input file : ");
            String inFile = in.next();
            System.out.print("Output file : ");
            String outFile = in.next();

            System.out.print("Encryption key : ");
            int key = in.nextInt();
            encryptor crypt = new encryptor(key);
            crypt.encryptFile(inFile, outFile);
            in.close();
        }
        catch(IOException exception){
            System.out.println("Error processing file : " + exception);
        }
    }
}
