/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.model;

/**
 *
 * @author Campos
 */
public class Produto {
    private Long codProd; 
    private String marca; 
    private String categoria; 
    private String fornecedor; 
    private float valorProd;
    private float valorVenda; 
    private int qtdeRecebida; 
    private int qtdMinEstoque; 

    public Produto(Long codProd, String marca, String categoria, String fornecedor, float valorProd, float valorVenda, int qtdeRecebida, int qtdMinEstoque) {
        this.codProd = codProd;
        this.marca = marca;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.valorProd = valorProd;
        this.valorVenda = valorVenda;
        this.qtdeRecebida = qtdeRecebida;
        this.qtdMinEstoque = qtdMinEstoque;
    }
    
    public Produto() {
    }
    
    public Long getCodProd() {
        return codProd;
    }

    public void setCodProd(Long codProd) {
        this.codProd = codProd;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getValorProd() {
        return valorProd;
    }

    public void setValorProd(float valorProd) {
        this.valorProd = valorProd;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQtdeRecebida() {
        return qtdeRecebida;
    }

    public void setQtdeRecebida(int qtdeRecebida) {
        this.qtdeRecebida = qtdeRecebida;
    }

    public int getQtdMinEstoque() {
        return qtdMinEstoque;
    }

    public void setQtdMinEstoque(int qtdMinEstoque) {
        this.qtdMinEstoque = qtdMinEstoque;
    }
    
    // Metodos da classe
    public void cadastrar(){
    
    }
    public void alterar(){
    
    }
    public void buscar(){
    
    }
}
