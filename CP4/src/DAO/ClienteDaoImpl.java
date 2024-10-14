package DAO;

import Model.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteDaoImpl implements ClienteDao {

    private Map<Integer, Cliente> registros = new HashMap<>();

    @Override
    public void salvar(Cliente entidade) {
        registros.put(entidade.getId(), entidade);
        System.out.println("Cliente salvo com sucesso!");
    }

    @Override
    public Cliente buscarPorId(int id) {
        return registros.get(id);
    }

    @Override
    public void atualizar(Cliente entidade) {
        if(registros.containsKey(entidade.getId())) {
            registros.put(entidade.getId(), entidade);
            System.out.println("Cliente atualizado com sucesso!");

        }else{
            salvar(entidade);
        }
        System.out.println("Cliente atualizado com sucesso!");
    }

    @Override
    public void excluir(Cliente entidade) {
        registros.remove(entidade.getId());
        System.out.println("Cliente excluido com sucesso!");
    }

    @Override
    public Map<Integer, Cliente> getAll() {
        return registros;
    }
}
