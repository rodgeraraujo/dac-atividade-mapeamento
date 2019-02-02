package br.ifpb.dac.mapeamento.funcionario;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author IFPB
 */
public class TrabalhaProjeto {
    private Date horasTrabalhadas;
    private Date dataIngresso;

    public TrabalhaProjeto() {
    }

    public TrabalhaProjeto(Date horasTrabalhadas, Date dataIngresso) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataIngresso = dataIngresso;
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
