package Model;

public class Sinistro {
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private String data;
    private String descricao;

    public Sinistro(int id, String descricao, String data, Veiculo veiculo, Cliente cliente) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.veiculo = veiculo;
        this.cliente = cliente;
    }
}
