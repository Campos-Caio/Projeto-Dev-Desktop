/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.dao;

import campos.gerensystem.model.Produto;
import campos.gerensystem.persistence.InterfaceDao;
import java.util.List;

/**
 *
 * @author Campos
 */
public interface ProdutoDao extends InterfaceDao<Long, Produto> {
    List<Produto> listarNome(String nome);

    List<Produto> listarOrd(boolean asc);
}
