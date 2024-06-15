/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.controller;

import campos.gerensystem.model.Validade;

/**
 *
 * @author Campos
 */
public class ValidadeDto {
     public String data_fabricacao;

    public Validade builder(){
        Validade validade = new Validade();

        validade.setData_fabricacao(data_fabricacao);

        return validade;
    }
}
