package br.com.ifba.mili.cliente.model;

import br.com.ifba.mili.infraestrutura.model.Pessoa;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Icaro
 */

@Entity
@Table(name = "Cliente")
public class Cliente extends Pessoa implements Serializable {}