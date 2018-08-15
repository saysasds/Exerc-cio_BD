/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javafx.scene.text.Text;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */

@Entity
@Table (name= "Funcao")

public class Funcao implements Serializable  {
    
 @Column (name = "cd_funcao")
 @Id
 private Integer cdFuncao;
 @Column (name = "tp_visivel")
 private boolean acessoRestrito; //tp_visivel
 @Column (name = "ds_funcao")
 private Text descricao; //Descricao funcao 
    /**
     * @return the cdFuncao
     */
    public Integer getCdFuncao() {
        return cdFuncao;
    }

    /**
     * @param cdFuncao the cdFuncao to set
     */
    public void setCdFuncao(Integer cdFuncao) {
        this.cdFuncao = cdFuncao;
    }
 
 
    /**
     * @return the acessoRestrito
     */
    public boolean isAcessoRestrito() {
        return acessoRestrito;
    }

    /**
     * @param acessoRestrito the acessoRestrito to set
     */
    public void setAcessoRestrito(boolean acessoRestrito) {
        this.acessoRestrito = acessoRestrito;
    }

    /**
     * @return the descricao
     */
    public Text getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao( Text descricao) {
        this.descricao = descricao;
    }
 
}
