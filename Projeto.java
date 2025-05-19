package sgpd;

import java.util.Date;

public class Projeto {
    private String codProjeto;
    private String projeto;
    private String codGerente;
    private Date dataInicio;
    private Date dataFim;

    public Projeto(String codProjeto, String projeto, String codGerente, Date dataInicio, Date dataFim) {
        this.codProjeto = codProjeto;
        this.projeto = projeto;
        this.codGerente = codGerente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(String codProjeto) {
        this.codProjeto = codProjeto;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getCodGerente() {
        return codGerente;
    }

    public void setCodGerente(String codGerente) {
        this.codGerente = codGerente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

   
}