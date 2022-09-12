import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Pizza menu: %n1. Spinachi %n2. Salami %n3. Napoletana %n");

        String pizza = scan.nextLine();

        switch (pizza){
            case "1" -> System.out.println("Spinachi je na cestě!");
            case "2" -> System.out.println("Salami je na cestě!");
            case "3" -> System.out.println("Napoletana je na cestě!");
        }
        
    }
}
