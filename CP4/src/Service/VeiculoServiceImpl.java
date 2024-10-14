package Service;

import DAO.VeiculoDao;
import DAO.VeiculoDaoImpl;
import Model.Veiculo;

import java.util.List;
import java.util.Map;

public class VeiculoServiceImpl implements VeiculoService {

    private VeiculoDao veiculoDao =  new VeiculoDaoImpl();

    @Override
    public void salvar(Veiculo entidade) {
        veiculoDao.salvar(entidade);
    }

    @Override
    public Veiculo buscarPorId(int id) {
        return veiculoDao.buscarPorId(id);
    }

    @Override
    public void atualizar(Veiculo entidade) {

    }

    @Override
    public void excluir(Veiculo entidade) {

    }

    @Override
    public Map<Integer, Veiculo> getAll() {
        return veiculoDao.getAll();
    }
}
