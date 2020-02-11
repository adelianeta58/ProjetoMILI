package br.com.ifba.mili.funcionario.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ extends br.com.ifba.mili.infraestrutura.model.Pessoa_ {

	public static volatile SingularAttribute<Funcionario, String> senha;
	public static volatile SingularAttribute<Funcionario, String> especializacao;
	public static volatile SingularAttribute<Funcionario, String> email;

}

