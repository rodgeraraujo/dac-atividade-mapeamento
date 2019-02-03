package br.ifpb.dac.mapeamento.oficina;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

/**
 *
 * @author Fernanda
 */
@Entity
public class Oficina implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    
    private String rua;
    private String bairro;
    private String cidade;
    private double saldo;

    public Oficina(String rua, String bairro, String cidade, double saldo) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.saldo = saldo;
    }

    public Oficina() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}