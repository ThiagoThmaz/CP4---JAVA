import Model.Cliente;
import Model.Veiculo;
import Service.ClienteService;
import Service.ClienteServiceImpl;
import Service.VeiculoService;
import Service.VeiculoServiceImpl;

public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        veiculo.setId(0);
        veiculo.setAno(2024);
        veiculo.setPlaca("FLT0023");

        VeiculoService veiculoService = new VeiculoServiceImpl();
        veiculoService.salvar(veiculo);

        System.out.println(veiculoService.getAll());


        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Joao");
        cliente.setContato("Thiago");

        ClienteService clienteService = new ClienteServiceImpl();
        clienteService.salvar(cliente);
        System.out.println(clienteService.getAll());
    }
}