package campos.gerensystem.model;

import java.util.ArrayList;

/**
 *
 * @author Campos
 */
public class Funcionario {
    private String nomeCompleto; 
    private String CPF; 
    private String dataNasc; 
    private String endereco; 
    private String sexo; 
    private String telefone; 
    private String email; 
    private String dataAdmissao; 
    private Float salario; 
    private String cargo; 
    private String funcao; 
    private String login; 
    private String senha; 
    
    public Funcionario(String nomeCompleto, String CPF, String dataNasc, String endereco, String sexo, String telefone, String email, String dataAdmissao, Float salario, String cargo, String funcao, String login, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.cargo = cargo;
        this.funcao = funcao;
        this.login = login;
        this.senha = senha;
    }

    public Funcionario() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    // Metodos da classe
    public void Cadastrar(){
        
    }
    public void Alterar(){
        
    }
    public void efetuaLogin(){
        
    }
    public void Permissao(){
        
    }
}
