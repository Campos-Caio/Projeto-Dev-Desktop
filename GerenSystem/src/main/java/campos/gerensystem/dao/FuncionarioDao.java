/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.dao;

import campos.gerensystem.model.Funcionario;
import campos.gerensystem.persistence.InterfaceDao;
import java.util.List;

/**
 *
 * @author Campos
 */
public interface FuncionarioDao extends InterfaceDao<Long, Funcionario> {
    List<Funcionario> listarNome(String nome);

    List<Funcionario> listarOrd(boolean asc);
    
   Funcionario buscarPorEmailSenha(String email,String senha);
}
