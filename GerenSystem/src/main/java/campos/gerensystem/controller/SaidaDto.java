/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.controller;

import campos.gerensystem.model.Saida;

/**
 *
 * @author Campos
 */
public class SaidaDto {
    public Long id;
    public String motivoSaida;
    public String dataSaida;

    public Saida builder(){
        Saida saida = new Saida();

        saida.setMotivo(motivoSaida);
        saida.setDtSaida(dataSaida);

        return saida;
    }
}
