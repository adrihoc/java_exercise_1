import java.util.Scanner;

class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String sc = myObj.nextLine();  // Read user input

        while (!"quit".equals(sc)) {
            System.out.println("Unknown command");
            sc = myObj.nextLine();  // Read user input
        }
    }
}

