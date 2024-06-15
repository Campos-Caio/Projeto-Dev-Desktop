/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.controller;

import campos.gerensystem.dao.EstoqueDao;
import java.util.List;

/**
 *
 * @author Campos
 */
public class EstoqueController {
    public class EstoqueController {
    public static final EstoqueController INSTANCE = new EstoqueController();

    public EstoqueController(){

    }

    EstoqueDao dao = new EstoqueImpl();
    public void salvar(EstoqueDto estoque) throws Exception {
        dao.salvar(estoque.builder());
        //new EstoqueDao().setCargo("AAAAA").setNomeFuncionario("").builder();
    }
    public List<EstoqueDto> listar() throws Exception {
        return dao.listar().stream().map(EstoqueDto::new).toList();
    }
    public EstoqueDto buscar(long id) throws Exception {
        return new EstoqueDto(dao.listarId(id));
    }
    }
}
