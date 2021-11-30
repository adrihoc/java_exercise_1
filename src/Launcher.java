import java.util.Scanner;

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
                sc = myObj.nextLine();  // Read user input
                int n1=0, n2=1, n3=0, i;
                for (i = 0; i < n-1; ++i) {
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                }
                System.out.println("F(" + n + ") = "+ n3);
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
}

