/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import java.util.Date;
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
@Table ( name = "ordem_servico")
public class OrdemServico implements Serializable {
    
    @Column (name = "cd_ordem_servico")
    @Id
    private Integer cd_ordem_servico;
    @Column (name = "bool_fechado")
    private Date data; //dt_ordem_servico
    @Column (name = "dt_ordem_servico")
    private boolean bool_fechado;
    @Column (name = "vl_total")
    private double valorTotal; //vl_total
    @Column (name = "funcionario_cd_funcionario" )
    private Funcionario funcionario; //funcionario_cd_funcionario 
    @Column (name = "cliente_cd_cliente")
    @OneToMany  (targetEntity = Cliente.class, fetch = FetchType.EAGER )
    private Cliente cliente; //cliente_cd_cliente


    /**
     * @return the cd_ordem_servico
     */
    public Integer getCd_ordem_servico() {
        return cd_ordem_servico;
    }

    /**
     * @param cd_ordem_servico the cd_ordem_servico to set
     */
    public void setCd_ordem_servico(Integer cd_ordem_servico) {
        this.cd_ordem_servico = cd_ordem_servico;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the bool_fechado
     */
    public boolean isBool_fechado() {
        return bool_fechado;
    }

    /**
     * @param bool_fechado the bool_fechado to set
     */
    public void setBool_fechado(boolean bool_fechado) {
        this.bool_fechado = bool_fechado;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}