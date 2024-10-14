package AbstractGeralSingleton;

import Model.Cliente;
import Model.Veiculo;

import java.util.List;
import java.util.Map;

public interface AbstractGeral<T> {

    void salvar(T entidade);
    T buscarPorId(int id);
    void atualizar(T entidade);
    void excluir(T entidade);
    Map<Integer, T> getAll();
}
