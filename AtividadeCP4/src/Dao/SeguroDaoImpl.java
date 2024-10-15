package Dao;

import Model.Seguro;

import java.util.HashMap;
import java.util.Map;

public class SeguroDaoImpl implements SeguroDao {

    private Map<Integer, Seguro> registros = new HashMap<>();

    @Override
    public void salvar(Seguro entidade) {
        registros.put(entidade.getId(), entidade);
        System.out.println("seguros salvo com sucesso!");
    }

    @Override
    public Seguro buscarPorId(int id) {
        return registros.get(id);
    }

    @Override
    public void atualizar(Seguro entidade) {
        if(registros.containsKey(entidade.getId())) {
            registros.put(entidade.getId(), entidade);
            System.out.println("Cliente atualizado com sucesso!");

        }else{
            salvar(entidade);
        }
        System.out.println("Cliente atualizado com sucesso!");
    }

    @Override
    public void excluir(Seguro entidade) {
        registros.remove(entidade.getId());
        System.out.println("Cliente excluido com sucesso!");
    }

    @Override
    public Map<Integer, Seguro> getAll() {
        return registros;
    }
}
