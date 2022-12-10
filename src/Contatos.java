import java.time.LocalDate;
import java.util.Date;

public class Contatos {

    private int id;
    private String nome;
    private String numero ;
    private LocalDate dataDeNascimento;
    private int idade;

    int idQTd = 0;


    public Contatos (){

    }

    public Contatos(String nome, String numero, LocalDate dataDeNascimento, int idade) {
        this.nome = nome;
        this.numero = numero;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
        this.id = idQTd++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", idade=" + idade +
                '}';
    }
}

