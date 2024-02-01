import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();

        System.out.println("Digite o nome e a inicial do sexo (F: Feminino - M: Masculino) do cliente:");
        System.out.println("Exemplo -> Camila,F | Para sair digite: S");

        System.out.println("--------------");
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("S")){

            input = scanner.nextLine();

            String[] inputSplit = input.split(",");

            if (input.equals("S")) {
                System.out.println("Obrigado");
                System.out.println();
            }
            else if(inputSplit.length < 2) {
                System.out.println("Erro ao cadastrar usuario, tente outra vez.");
            }else{
                String name = inputSplit[0].trim();
                String gender = inputSplit[1].trim().toLowerCase();

                Customer costumer = new Customer(name, gender);
                customers.add(costumer);
                System.out.println("Adicione mais um cliente ou digite S para finalizar.");
            }
        }

        System.out.println("Clientes homens:");
        customers.stream().filter(c -> c.getMale().equals("m")).forEach(c -> System.out.println(c.getName()));
        System.out.println("Clientes mulheres:");
        customers.stream().filter(c -> c.getMale().equals("f")).forEach(c -> System.out.println(c.getName()));

        scanner.close();
    }
}