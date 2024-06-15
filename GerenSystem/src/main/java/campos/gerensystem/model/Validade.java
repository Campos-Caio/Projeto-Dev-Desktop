/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Campos
 */
@Entity
public class Validade{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30)
    private String data_fabricacao;

    @OneToMany(mappedBy = "produto")
    private Set<Produto> produtos = new HashSet<>();

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }
    
    public void CalcularDataFabric(){
    }
    public void exibirDataVenc(){
    }
    public void Alterar(){
    } 

    public String getData_fabricacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
