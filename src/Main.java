import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ile imion chcesz wpisać");
        int qty = scan.nextInt();
        String[] names = new String[qty + 1];

        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
        }

        for (int i = names.length - 1; i > 0; i--) {
            System.out.println(names[i]);
        }
        
    }
}
