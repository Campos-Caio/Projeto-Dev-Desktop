/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.dao;

import campos.gerensystem.model.Validade;
import campos.gerensystem.persistence.InterfaceDao;
import java.util.List;

/**
 *
 * @author Campos
 */
public interface ValidadeDao extends InterfaceDao<Long, Validade> {
    List<Validade> listarPorDataFabricacao(String dataFabricacao);

    List<Validade> listarOrd(boolean asc);
}
