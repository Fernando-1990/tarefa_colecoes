import java.util.*;

public class Lista1 {

    public static void nomes() {
        System.out.println("<<<<<<<<<< PARTE I >>>>>>>>>>");

        Scanner s = new Scanner(System.in);

        System.out.println("Digite nomes separados por vírgula");

        String nome = s.next();

        List<String> lista = new ArrayList<>(Arrays.asList(nome.split(",")));

        Collections.sort(lista);

        System.out.println(lista);


    }

}
