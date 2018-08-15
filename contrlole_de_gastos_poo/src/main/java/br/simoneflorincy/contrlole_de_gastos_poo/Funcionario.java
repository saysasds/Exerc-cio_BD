/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity 
@Table (name = "funcionario")

public class Funcionario implements Serializable {
 
    @Column (name= "cd_funcionario") 
    @Id
    private Integer cd_funcionario;
    @Column (name= "funcao_cd_funcao")
    @OneToMany (targetEntity = Funcao.class, fetch = FetchType.EAGER) 
    private String nick;
    @Column (name= "tp_invisivel") 
    private String nome;
    @Column (name= "ds_senha") 
    private String senha;
    @Column (name= "nick") 
    private Funcao funcao_do_funcionario;
    @Column (name= "endereco_cd_endereco") 
    @OneToOne (targetEntity = Endereco.class,cascade = CascadeType.REMOVE, 
           fetch = FetchType.EAGER) 
    private Endereco endereco_do_funcionario;
    @Column (name= "nm_funcionario") 
    private Character tp_invisivel;
    
    /**
     * @return the cd_funcionario
     */
    public Integer getCd_funcionario() {
        return cd_funcionario;
    }

    /**
     * @param cd_funcionario the cd_funcionario to set
     */
    public void setCd_funcionario(Integer cd_funcionario) {
        this.cd_funcionario = cd_funcionario;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the funcao_do_funcionario
     */
    public Funcao getFuncao_do_funcionario() {
        return funcao_do_funcionario;
    }

    /**
     * @param funcao_do_funcionario the funcao_do_funcionario to set
     */
    public void setFuncao_do_funcionario(Funcao funcao_do_funcionario) {
        this.funcao_do_funcionario = funcao_do_funcionario;
    }

    /**
     * @return the endereco_do_funcionario
     */
    public Endereco getEndereco_do_funcionario() {
        return endereco_do_funcionario;
    }

    /**
     * @param endereco_do_funcionario the endereco_do_funcionario to set
     */
    public void setEndereco_do_funcionario(Endereco endereco_do_funcionario) {
        this.endereco_do_funcionario = endereco_do_funcionario;
    }

    /**
     * @return the tp_invisivel
     */
    public Character getTp_invisivel() {
        return tp_invisivel;
    }

    /**
     * @param tp_invisivel the tp_invisivel to set
     */
    public void setTp_invisivel(Character tp_invisivel) {
        this.tp_invisivel = tp_invisivel;
    }

}
    