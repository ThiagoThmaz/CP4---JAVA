package Model;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String contato;

    public Cliente() {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
