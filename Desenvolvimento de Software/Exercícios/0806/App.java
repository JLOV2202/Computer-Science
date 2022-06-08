import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 15, 43));
        pessoas.add(new Pessoa("Maria", 13, 47));
        pessoas.add(new Pessoa("Pedro", 30, 78));
        pessoas.add(new Pessoa("Simone", 25, 65));

        for (Pessoa p : pessoas)
            System.out.println(p);

        Collections.sort(pessoas);

        for (Pessoa p : pessoas)
            System.out.println(p); 
    }
}
