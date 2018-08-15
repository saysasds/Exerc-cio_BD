/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javafx.scene.text.Text;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity 
@Table(name = "Endereco")
public class Endereco implements Serializable {
    
    @Column (name = "cd_endereco")
    @Id
    private Integer endereco; 
    @Column (name = "nm_bairro" )
    private String bairro;
    @Column (name = "ds_cep")
    private String cep;
    @Column (name = "nm_cidade")
    private String cidade;
    @Column (name = "ds_complemento")
    private Text complemento;
    @Column (name = "nr_casa")
    private String numero;
    @Column (name = "nm_rua")
    private String rua;
    @Column (name = "telefone1")
    private String telefone1;
    @Column (name = "telefone2")
    private String telefone2;


    /**
     * @return the endereco
     */
    public Integer getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Integer endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the complemento
     */
    public Text getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(Text complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the telefone1
     */
    public String getTelefone1() {
        return telefone1;
    }

    /**
     * @param telefone1 the telefone1 to set
     */
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    /**
     * @return the telefone2
     */
    public String getTelefone2() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    
}
    
    


    