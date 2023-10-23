import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();

        System.out.println("Digite sua primeira nota:");
        notas.add(sc.nextDouble());

        System.out.println("Digite sua segunda nota:");
        notas.add(sc.nextDouble());

        System.out.println("Digite sua terceira nota:");
        notas.add(sc.nextDouble());

        System.out.println("Digite sua quarta nota:");
        notas.add(sc.nextDouble());

        sc.close();

        double soma = 0;
        for (Double i : notas) {
            soma += i;
        }

        double media = soma / notas.size();

        System.out.println("Sua Media anual foi: " + media);

        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 5 && media < 7) {
            System.out.println("RECUPERAÇÂO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}