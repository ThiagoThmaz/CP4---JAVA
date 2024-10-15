package Dao;

import Model.Veiculo;

import java.util.HashMap;
import java.util.Map;

public class VeiculoDaoImpl implements VeiculoDao {

    private Map<Integer, Veiculo> registros = new HashMap<>();

    @Override
    public void salvar(Veiculo entidade) {
        registros.put(entidade.getId(), entidade);
        System.out.println("seguros salvo com sucesso!");
    }

    @Override
    public Veiculo buscarPorId(int id) {
        return registros.get(id);
    }

    @Override
    public void atualizar(Veiculo entidade) {
        if(registros.containsKey(entidade.getId())) {
            registros.put(entidade.getId(), entidade);
            System.out.println("Cliente atualizado com sucesso!");

        }else{
            salvar(entidade);
        }
        System.out.println("Cliente atualizado com sucesso!");
    }

    @Override
    public void excluir(Veiculo entidade) {
        registros.remove(entidade.getId());
        System.out.println("Cliente excluido com sucesso!");
    }

    @Override
    public  Map<Integer, Veiculo>  getAll() {
        return registros;
    }
}
