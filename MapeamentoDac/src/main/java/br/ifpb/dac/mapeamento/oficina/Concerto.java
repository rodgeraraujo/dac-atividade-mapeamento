package br.ifpb.dac.mapeamento.oficina;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/**
 *
 * @author Fernanda
 */
@Entity
public class Concerto implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private double valor;

    @Temporal(TemporalType.DATE)
    private Date realizadoEm;
    
    @OneToOne
    private Funcionario funcionario;

    @ManyToOne
    private Oficina oficina;
    
    public Concerto(double valor, Funcionario funcionario, Oficina oficina) {
        this();
        this.valor = valor;
        this.funcionario = funcionario;
        this.oficina = oficina;
    }

    public Concerto() {
        this.realizadoEm = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getrealizadoEm() {
        return realizadoEm;
    }

    public void setrealizadoEm(Date realizadoEm) {
        this.realizadoEm = realizadoEm;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
            
}