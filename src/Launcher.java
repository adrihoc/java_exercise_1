import java.util.Scanner;

class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String sc = myObj.nextLine();  // Read user input

        if ("quit".equals(sc)) {
            
        } else {
            System.out.println("Unknown command");
        }
    }
}

