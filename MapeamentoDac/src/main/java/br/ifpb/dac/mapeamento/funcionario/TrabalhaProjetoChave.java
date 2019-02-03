package com.jpa.cenario.um;

import java.io.Serializable;

/**
 *
 * @author Fernanda
 */
public class TrabalhaProjetoChave implements Serializable{
    
    private int func;
    private int proj;

    public TrabalhaProjetoChave() {
    }

    public int getFuncionario() {
        return func_id;
    }

    public void setFuncionario(int func_id) {
        this.func_id = func_id;
    }

    public int getProjeto() {
        return proj_id;
    }

    public void setProjeto(int proj_id) {
        this.proj_id = proj_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.func_id;
        hash = 11 * hash + this.proj_id;
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
        final TrabalhaProjetoChave other = (TrabalhaProjetoChave) obj;
        if (this.func_id != other.func_id) {
            return false;
        }
        if (this.proj_id != other.proj_id) {
            return false;
        }
        return true;
    }
       
}