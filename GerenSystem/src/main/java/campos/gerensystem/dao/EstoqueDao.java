/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.dao;

import campos.gerensystem.model.Estoque;
import campos.gerensystem.persistence.InterfaceDao;
import java.util.List;
/**
 *
 * @author Campos
 */


public interface EstoqueDao extends InterfaceDao<Long, Estoque> {
    List<Estoque> listarNome(String nome);

    List<Estoque> listarOrd(boolean asc);
}