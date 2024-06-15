/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.persistence;

/**
 *
 * @author Campos
 */
import javax.persistence.NoResultException;
import java.util.List;

public interface InterfaceDao<ID, T> {
    public default void salvar(T entidade) {
        Dao.getInstace().salvar(entidade);
    }

    public default void atualiza(T entidade) {
        Dao.getInstace().atualiza(entidade);
    }

    public default void remove(T entidade) {
        Dao.getInstace().remove(entidade);
    }

    T listarId(ID id) throws NoResultException;

    List<T> listar() throws NoResultException;
}
