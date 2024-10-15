package Singleton;

import java.util.Map;

public interface AbstractGeral<T> {

    void salvar(T entidade);
    T buscarPorId(int id);
    void atualizar(T entidade);
    void excluir(T entidade);
    Map<Integer, T> getAll();
}

