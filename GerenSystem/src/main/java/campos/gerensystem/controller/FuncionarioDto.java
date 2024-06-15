/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campos.gerensystem.controller;
import campos.gerensystem.model.Funcionario; 
import javax.swing.JTextField;


/**
 *
 * @author Campos
 */
public class FuncionarioDto {

    private Long id;
    private String nomeFuncionario;
    private String cpf;
    private String dataNasc;
    private String endereco;
    private String sexo;
    private String telefone;
    private String email;
    private String dataAdmissao;
    private Float salario;
    private String login;
    private String senha;

    public Funcionario builder() {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(id);
        funcionario.setNome(nomeFuncionario);
        funcionario.setCpf(cpf);
        funcionario.setDataNasc(dataNasc);
        funcionario.setEndereco(endereco);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setDataAdmissao(dataAdmissao);
        funcionario.setSalario(salario);
        funcionario.setLogin(login);
        funcionario.setSenha(senha);
        return funcionario;
    }

    public FuncionarioDto (Funcionario funcionario){
        this.id = funcionario.getId();
        this.nomeFuncionario = funcionario.getNome();
        this.cpf = funcionario.getCpf();
        this.dataNasc = funcionario.getDataNasc();
        this.endereco = funcionario.getEndereco();
        this.sexo = funcionario.getSexo();
        this.telefone = funcionario.getTelefone();
        this.email = funcionario.getEmail();
        this.dataAdmissao = funcionario.getDataAdmissao();
        this.salario = funcionario.getSalario();
        this.login = funcionario.getLogin();
        this.senha = funcionario.getSenha();
    }

    public FuncionarioDto() {
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public FuncionarioDto setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public FuncionarioDto setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public FuncionarioDto setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public FuncionarioDto setSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public FuncionarioDto setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public FuncionarioDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public FuncionarioDto setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
    }

    public float getSalario() {
        return salario;
    }

    public FuncionarioDto setSalario(float salario) {
        this.salario = salario;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public FuncionarioDto setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public FuncionarioDto setSenha(String senha) {
        this.senha = senha;
        return this;
    }
}