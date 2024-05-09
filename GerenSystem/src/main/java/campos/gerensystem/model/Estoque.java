/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.model;

/**
 *
 * @author Campos
 */
public class Estoque {
    private long estoqueAtual; 
    private long estoqueAnterior; 

    public Estoque(long estoqueAtual, long estoqueAnterior) {
        this.estoqueAtual = estoqueAtual;
        this.estoqueAnterior = estoqueAnterior;
    }

    public Estoque() {
    }

    public long getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(long estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public long getEstoqueAnterior() {
        return estoqueAnterior;
    }

    public void setEstoqueAnterior(long estoqueAnterior) {
        this.estoqueAnterior = estoqueAnterior;
    }
    
    // Metodos da classe 
    public void Acessar(){
    }
    public void Entrada(){
    }
    public void Buscar(){
    }
    public void Saida(){
    }
}
