package Model;

public class Seguro {
    private int id;
    private Cliente cliente;
    private double valor;
    private String dataInicio;
    private String dataFim;

    public Seguro(int id, Cliente cliente, double valor, String dataInicio, String dataFim) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

    }

    public double calcularValorSeguro() {
        return valor;
    }

    public void atualizarCobertura(){
        System.out.println("Cobertura atualizada");

    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }
}
