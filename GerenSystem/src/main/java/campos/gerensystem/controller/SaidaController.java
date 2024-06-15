/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.controller;

import campos.gerensystem.dao.SaidaDao;
import java.util.List;

/**
 *
 * @author Campos
 */
public class SaidaController {

    public static final SaidaController INSTANCE = new SaidaController();

    private SaidaController() {
    }

    SaidaDao dao = new SaidaImpl();

    public void salvar(SaidaDto saidaDto) throws Exception {
        dao.salvar(saidaDto.builder());
    }

    public List<SaidaDto> listar() throws Exception {
        return dao.listar().stream().map(SaidaDto::new).toList();
    }

    public SaidaDto buscar(long id) throws Exception {
        return new SaidaDto(dao.listarId(id));
    }

    public void alterar(SaidaDto saidaDto) throws Exception {
        dao.atualiza(saidaDto.builder());
    }

    public List<SaidaDto> listarMotivo(String motivo) throws Exception {
        return dao.listarMotivo(motivo).stream().map(SaidaDto::new).toList();
    }

    public List<SaidaDto> listarOrdenado(boolean asc) {
        return dao.listarOrd(asc).stream().map(SaidaDto::new).toList();
    }

    public void remover(SaidaDto saidaDto) {
        dao.remove(saidaDto.builder());
    }
}
