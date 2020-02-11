package br.com.ifba.mili.funcionario.model;

import br.com.ifba.mili.infraestrutura.model.Pessoa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Icaro
 */

@Entity
@Table(name = "Funcionario")
public class Funcionario extends Pessoa implements Serializable {
    
    @Column(nullable = false)
    private String senha;
    
    private String email;
    private String especializacao;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}