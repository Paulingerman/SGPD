package sgpd;

public class Departamento extends Projeto {
    private String codDepartamento;
    private String departamento;


    public Departamento(String codDepartamento, String departamento, String codProjeto, String projeto, String codGerente, java.util.Date dataInicio, java.util.Date dataFim) {
        super(codProjeto, projeto, codGerente, dataInicio, dataFim);
        this.codDepartamento = codDepartamento;
        this.departamento = departamento;
    }
    public String getCodDepartamento() {
        return codDepartamento;
    }
    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
