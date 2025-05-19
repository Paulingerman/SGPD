package sgpd;

import java.util.Date;

class Gerente {
    private String id;
    private String nome;
    private String projetoId;
    private String projetoNome;
    private String gerenteId;
    private Date inicio;
    private Date fim;
    
    public Gerente(String id, String nome, String projetoId, String projetoNome, String gerenteId, Date inicio, Date fim) {
        this.id = id;
        this.nome = nome;
        this.projetoId = projetoId;
        this.projetoNome = projetoNome;
        this.gerenteId = gerenteId;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProjetoId() {
        return projetoId;
    }
    public void setProjetoId(String projetoId) {
        this.projetoId = projetoId;
    }
    public String getProjetoNome() {
        return projetoNome;
    }
    public void setProjetoNome(String projetoNome) {
        this.projetoNome = projetoNome;
    }
    public String getGerenteId() {
        return gerenteId;
    }
    public void setGerenteId(String gerenteId) {
        this.gerenteId = gerenteId;
    }
    public Date getInicio() {
        return inicio;
    }
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    public Date getFim() {
        return fim;
    }
    public void setFim(Date fim) {
        this.fim = fim;
    }
}