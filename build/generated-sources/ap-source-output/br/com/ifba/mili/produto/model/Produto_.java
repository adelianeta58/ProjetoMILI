package br.com.ifba.mili.produto.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produto.class)
public abstract class Produto_ extends br.com.ifba.mili.infraestrutura.model.AbstractEntity_ {

	public static volatile SingularAttribute<Produto, Double> preco;
	public static volatile SingularAttribute<Produto, Integer> estoque;
	public static volatile SingularAttribute<Produto, String> dataValidade;
	public static volatile SingularAttribute<Produto, String> lote;
	public static volatile SingularAttribute<Produto, String> genero;
	public static volatile SingularAttribute<Produto, String> nome;
	public static volatile SingularAttribute<Produto, String> secao;
	public static volatile SingularAttribute<Produto, String> codigoBarras;

}

