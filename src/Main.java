import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pięć imion");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String name3 = scan.nextLine();
        String name4 = scan.nextLine();
        String name5 = scan.nextLine();

        System.out.println("Witaj " + name5);
        System.out.println("Witaj " + name4);
        System.out.println("Witaj " + name3);
        System.out.println("Witaj " + name2);
        System.out.println("Witaj " + name1);

    }
}
