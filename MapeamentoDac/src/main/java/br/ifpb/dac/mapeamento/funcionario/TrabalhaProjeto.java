package br.ifpb.dac.mapeamento.funcionario;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author IFPB
 */
@Entity
@IdClass(TrabalhaProjetoChave.class)
public class TrabalhaProjeto {

    @Id
    @Column(insertable = false, updatable = false)
    private int func_id;
    @Id
    @Column(insertable = false, updatable = false)
    private int proj_id;
    private Date horasTrabalhadas;
    private Date dataIngresso;

    @ManyToOne
    @JoinColumn(name = "func_id")
    private Funcionario func;
    @ManyToOne 
    @JoinColumn(name = "proj_id")
    private Projeto proj;

    public TrabalhaProjeto() {
    }

    public TrabalhaProjeto(Date horasTrabalhadas, Date dataIngresso, Funcionario func, Projeto proj) {
        this();
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataIngresso = dataIngresso;
        this.projeto = proj;
        this.funcionario = func;
    }

    public int getFuncionarioID() {
        return func_id;
    }

    public void setFuncionarioID(int func_id) {
        this.func_id = func_id;
    }

    public int getProjetoID() {
        return proj_id;
    }

    public void setProjetoID(int proj_id) {
        this.proj_id = proj_id;
    }

    public Date getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Date horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public Projeto getProjeto() {
        return proj;
    }

    public void setProjeto(Projeto proj) {
        this.proj = proj;
    }

    public Funcionario getFuncionario() {
        return funci;
    }

    public void setFuncionario(Funcionario func) {
        this.func = func;
    }  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.horasTrabalhadas);
        hash = 71 * hash + Objects.hashCode(this.dataIngresso);
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
        final TrabalhaProjeto other = (TrabalhaProjeto) obj;
        if (!Objects.equals(this.horasTrabalhadas, other.horasTrabalhadas)) {
            return false;
        }
        if (!Objects.equals(this.dataIngresso, other.dataIngresso)) {
            return false;
        }
        return true;
    }    
}
