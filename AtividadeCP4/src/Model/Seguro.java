package Model;

public class Seguro {
    private int id;
    private Cliente cliente;
    private Double valor;
    private String dataInicio;
    private String dataFim;

    public Seguro(int id, Cliente cliente, Double valor, String dataInicio, String dataFim) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public double calcularValor() {
        return valor;
    }

    public void atualizarValor(double valor) {
        System.out.println("Atualizando valor: " + valor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
