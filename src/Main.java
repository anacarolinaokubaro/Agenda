import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<Contatos> listaContatos = new ArrayList<Contatos>();

        var anaThais = new Contatos("Ana Thais", "(45) 999999998", LocalDate.of(2000,1,8), 22);
        var anaCarolina = new Contatos("Ana Carolina", "(11) 999999998", LocalDate.of(1992,04,13), 30);
        var hugo = new Contatos("Hugo", "(61) 999999998", LocalDate.of(1997,01,28), 25);

        listaContatos.add(anaThais);
        listaContatos.add(anaCarolina);
        listaContatos.add(hugo);


        somarIdades (listaContatos.stream());

        System.out.println("________________________________\n");
        filtroNascimento(listaContatos.stream());

        System.out.println("________________________________\n");
        filtroNomeOuID(listaContatos.stream());

        System.out.println("________________________________\n");
        ordenarNome(listaContatos.stream());

        System.out.println("________________________________\n");
        maxeMinIdades(listaContatos.stream(), listaContatos.stream());



    }

    public static int somarIdades (Stream<Contatos> soma){
       int somaIdades = soma
                .reduce(0, (sum , idade) -> sum+idade.getIdade(), Integer::sum);

        System.out.println("Soma de idades " + somaIdades );

        return somaIdades;
    }

    public static void filtroNascimento (Stream<Contatos> filtro){
        filtro
                .filter(item -> item.getDataDeNascimento().getYear()== 2000)
                .forEach(System.out::println);
    }

    public static void filtroNomeOuID (Stream<Contatos> filtro){
        filtro
                .filter(item -> item.getNome().equals("Ana Carolina") || item.getId() == 1 )
                .forEach(System.out::println);
    }

    public static void ordenarNome (Stream<Contatos> nome){
        nome
                .sorted(Comparator.comparing(Contatos::getNome))
                .forEach(System.out::println);
    }

    public static void maxeMinIdades (Stream<Contatos> max, Stream<Contatos> min){
        System.out.println("Pessoa mais velha: " + max
                .max(Comparator.comparing(Contatos::getIdade)));

        System.out.println("Pessoa mais nova: " +min
                .min(Comparator.comparing(Contatos::getIdade)));
    }

}