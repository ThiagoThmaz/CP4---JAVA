package Service;

import Dao.ClienteDao;
import Dao.ClienteDaoImpl;
import Model.Cliente;

import java.util.Map;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDao clienteDao = new ClienteDaoImpl();

    @Override
    public void salvar(Cliente entidade) {
        clienteDao.salvar(entidade);
    }

    @Override
    public Cliente buscarPorId(int id) {
        return clienteDao.buscarPorId(id);
    }

    @Override
    public void atualizar(Cliente entidade) {
        clienteDao.atualizar(entidade);
    }

    @Override
    public void excluir(Cliente entidade) {
        clienteDao.excluir(entidade);
    }

    @Override
    public Map<Integer, Cliente> getAll() {
        return clienteDao.getAll();
    }
}
