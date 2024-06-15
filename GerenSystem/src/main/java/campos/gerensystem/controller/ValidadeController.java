/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.controller;
import campos.gerensystem.dao.ValidadeDao;
import campos.gerensystem.model.Validade;
import java.util.List;

/**
 *
 * @author Campos
 */
public class ValidadeController {

    public static final ValidadeController INSTANCE = new ValidadeController();

    private ValidadeController() {
    }

    ValidadeDao dao = new ValidadeImpl();

    public void salvar(ValidadeDto validadeDto) throws Exception {
        dao.salvar(validadeDto.builder());
    }

    public List<ValidadeDto> listar() throws Exception {
        return dao.listar().stream().map(ValidadeDto::new).toList();
    }

    public ValidadeDto buscar(long id) throws Exception {
        return new ValidadeDto(dao.listarId(id));
    }

    public void alterar(ValidadeDto validadeDto) throws Exception {
        dao.atualiza(validadeDto.builder());
    }

    public List<ValidadeDto> listarPorDataFabricacao(String dataFabricacao) throws Exception {
        return dao.listarPorDataFabricacao(dataFabricacao).stream().map(ValidadeDto::new).toList();
    }

    public List<ValidadeDto> listarOrdenado(boolean asc) {
        return dao.listarOrd(asc).stream().map(ValidadeDto::new).toList();
    }

    public void remover(ValidadeDto validadeDto) {
        dao.remove(validadeDto.builder());
    }
}
