package br.ifpb.dac.mapeamento.materialdidatico;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Rodger
 */
@Entity
@IdClass(MaterialDidaticoChave.class)
public class MaterialDidatico implements Serializable {

    @Id
    @Column(length = 45, nullable = false)
    private String origem;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long codigo;

    @Column(length = 155, nullable = false)
    private String titulo;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String descricao;

    @Column(length = 55)
    private String autor;

    @Enumerated(EnumType.STRING)
    private TipoMaterialDidatico tipo;

    @Column(name = "tamanho", columnDefinition = "Decimal(6,2)")
    private double tamanho;
    private boolean publico;

    public MaterialDidatico() {
    }

    public MaterialDidatico(String origem, String titulo, String descricao,
            String autor, TipoMaterialDidatico tipo, boolean publico, double tamanho) {

        this.origem = origem;
        this.titulo = titulo;
        this.dataCadastro = new Date();
        this.descricao = descricao;
        this.autor = autor;
        this.tipo = tipo;
        this.publico = publico;
        this.tamanho = tamanho;   
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public TipoMaterialDidatico getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterialDidatico tipo) {
        this.tipo = tipo;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}