package Modelo;

import Modelo.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-30T18:15:26")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Long> idCliente;
    public static volatile ListAttribute<Pedido, Produto> produtos;
    public static volatile SingularAttribute<Pedido, Double> valorTotal;
    public static volatile SingularAttribute<Pedido, Long> id;

}