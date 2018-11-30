/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author euler
 */
@Entity
@Table(name="pedidos")
public class Pedido implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(name="idCliente")
    private Long idCliente;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_produtos")
    private List<Produto> produtos = new ArrayList<Produto>();
    
    @Column(name="valorTotal")
    private double valorTotal;

   
    public void addProduto(Produto p){
        this.produtos.add(p);
        atualizaValorTotal();
    }
    public void removeProduto(Produto p){
        this.produtos.remove(p);
        atualizaValorTotal();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    public void  atualizaValorTotal(){
        double valor = 0.0;
        for(int i = 0; i < this.produtos.size(); i++ ){
           Produto p = produtos.get(i);
           valor = valor + p.getValor();
        }
        setValorTotal(valor);
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
