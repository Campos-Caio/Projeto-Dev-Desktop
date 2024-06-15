/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.model;

/**
 *
 * @author Campos
 */

public class Entrada {
    private Integer Id; 
    private String dataEntrada;
    private String notaFiscal; 
    private String secao; 

    public Entrada(String dataEntrada, String notaFiscal, String secao) {
        this.dataEntrada = dataEntrada;
        this.notaFiscal = notaFiscal;
        this.secao = secao;
    }

    public Entrada() {
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }
    
    public void Login(){
    }
    public void efetuarEntrada(){
    }
    public void alterar(){}
}
