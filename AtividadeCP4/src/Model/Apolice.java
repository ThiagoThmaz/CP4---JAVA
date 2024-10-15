package Model;

public class Apolice {
    private int id;
    private Seguro seguro;
    private String cobertura;
    private double valor;

    public Apolice(int id, double valor, String cobertura, Seguro seguro) {
        this.id = id;
        this.valor = valor;
        this.cobertura = cobertura;
        this.seguro = seguro;
    }
}
