/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author euler
 */
@Entity
@Table(name="clientes")  
public class Cliente implements Serializable {

   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="cfp")
    private String CPF;
    @Column(name="logradouro")
    private String logradouro;
    @Column(name="numero")
    private String numero;
    @Column(name="bairro")
    private String bairro;
    @Column(name="cidade")
    private String cidade;
    @Column(name="cep")
    private String CEP;
    @Column(name="estado")
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String número) {
        this.numero = número;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente"
                + "\nId = " + id
                + "\nNome = " + nome
                + "\nCPF = " + CPF
                + "\nLogradouro = " + logradouro
                + "\nNúmero = " + numero
                + "\nBairro = " + bairro
                + "\nCidade = " + cidade
                + "\nEstado = " + estado
                + "\nCEP = " + CEP;
    }

}
