package br.ifpb.dac.mapeamento.funcionario;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author IFPB
 */
@Entity
public class Funcionario implements Serializable{
    @Id
    private String cpf;
    private String rg;
    private float salario;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.cpf);
        hash = 13 * hash + Objects.hashCode(this.rg);
        hash = 13 * hash + Float.floatToIntBits(this.salario);
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
        return true;
    }
}
