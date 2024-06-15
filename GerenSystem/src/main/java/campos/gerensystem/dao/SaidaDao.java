/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.dao;

import campos.gerensystem.model.Saida;
import campos.gerensystem.persistence.InterfaceDao;
import java.util.List;
/**
 *
 * @author Campos
 */

public interface SaidaDao extends InterfaceDao<Long, Saida> {
    List<Saida> listarMotivo(String motivo);

    List<Saida> listarOrd(boolean asc);
}
