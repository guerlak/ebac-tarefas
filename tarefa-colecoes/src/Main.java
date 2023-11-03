import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserir lista de nomes separados por virgula: Eg -> Rafael,Marina,Marcela");
        String names = sc.nextLine();
        orderedByNames(names);

        System.out.println("Inserir lista de nomes com genero separados por virgula: Eg -> Rafael-M,Marina-F,Marcela-F");
        String genreNames = sc.nextLine();
        separateGenres(genreNames);
        sc.close();
    }

    public static void orderedByNames(String names){

        String[] namesArr = names.split(",");

        List<String> namesList = new ArrayList<>();

        for (String n: namesArr
             ) {
            namesList.add(n.trim());
        }

        Collections.sort(namesList);
        System.out.println("Nomes inseridos ordenados:");
        for (String name: namesList
             ) {
            System.out.println(name);
        }
    }

    public static void separateGenres(String names){

        String[] namesList = names.split(",");

        List<String> femaleList = new ArrayList<>();
        List<String> maleList = new ArrayList<>();

        for (String o: namesList
             ) {
            try {
                String[] genre = o.split("-");
                if(genre[1].equalsIgnoreCase("F")){
                    femaleList.add(genre[0].trim());
                }else if (genre[1].equalsIgnoreCase("M")){
                    maleList.add(genre[0].trim());
                }else {
                    System.out.println("Erro na captura do genero -> " + o);
                }
            }catch (Exception e){
                System.out.println("Erro no padrao nome-genero => " + o);
            }
        }

        System.out.println("**** Lista das mulheres: ****");
        for (String name: femaleList
        ) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("**** Lista dos homens: ****");
        for (String name: maleList
        ) {
            System.out.println(name);
        }
    }
}