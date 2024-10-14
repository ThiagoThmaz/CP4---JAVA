package Model;

public class Sinistro {
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private String data;
    private String descricao;

    public Sinistro(int id, Cliente cliente, Veiculo veiculo, String data, String descricao) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.data = data;
        this.descricao = descricao;
    }
}
