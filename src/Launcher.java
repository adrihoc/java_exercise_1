import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String sc = "";  // Read user input

        while (!"quit".equals(sc)) {
            sc = myObj.nextLine();  // Read user input

            if ("quit".equals(sc)) {

            }
            else if ("fibo".equals(sc)) {
                System.out.println("Enter a number:");

                int n = myObj.nextInt();
                myObj.nextLine();  // Read user input

                int n1=0, n2=1, n3=0, i;

                for (i = 0; i < n-1; ++i) {
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                }
                System.out.println("F(" + n + ") = "+ n3);
            }
            else  if ("freq".equals(sc)) {
                System.out.println("What is the path of the file you want to analyse?");
                Path path = Paths.get(myObj.nextLine());

                try {
                    String file = Files.readString(path);
                    System.out.println("Sorry, this function is not working.");

                } catch (IOException e) {
                    System.out.println("Unreadable File: " + e);
                }
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
}

