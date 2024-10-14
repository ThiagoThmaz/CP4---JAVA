package Model;

public class Apolice {
    private int id;
    private Seguro seguro;
    private String cobertura;
    private double valor;

    public Apolice(int id, Seguro seguro, String cobertura, double valor) {
        this.id = id;
        this.seguro = seguro;
        this.cobertura = cobertura;
        this.valor = valor;
    }
}
