package Tp2copmilation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Test du parseur descendant ###");
        System.out.println("Entrez une chaîne à analyser : ");
        String input = scanner.nextLine();

        
        DescendantParser parser = new DescendantParser(input);


        if (parser.parse()) {
            System.out.println("La chaîne \"" + input + "\" est acceptée !");
        } else {
            System.out.println("La chaîne \"" + input + "\" est rejetée !");
        }

        scanner.close();
    }
}

