package br.ifpb.dac.mapeamento.funcionario;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

/**
 *
 * @author Fernanda
 */
@Entity
public class Funcionario implements Serializable{

    @Id
    @GeneratedValue
    private String cpf;
    private String rg;
    private float salario;
    
    @OneToMany(mappedBy = "proj", targetEntity = TrabalhaProjeto.class)
    @Basic
    private List<Projeto> projetos;

    public Funcionario() {

    }

    public Funcionario(String cpf, String rg, float salario) {
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.cpf);
        hash = 13 * hash + Objects.hashCode(this.rg);
        hash = 13 * hash + Float.floatToIntBits(this.salario);
        hash = 83 * hash + Objects.hashCode(this.projetos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.projetos, other.projetos)) {
            return false;
        }
        return true;
    }
}
