/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.model;

/**
 *
 * @author Campos
 */
public class Saida {
    private String motivoSaida; 
    private String dataSaida; 

    public Saida(String motivoSaida, String dataSaida) {
        this.motivoSaida = motivoSaida;
        this.dataSaida = dataSaida;
    }

    public Saida() {
    }

    public String getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(String motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    public void Login(){
    }
    public void efetuarEntrada(){
    }
    public void alterar(){}
}
