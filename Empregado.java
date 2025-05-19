package sgpd;

public class Empregado extends HorasT {
    private String codEmpregado;
    private String empregado;
    
    public Empregado(String codEmpregado, String empregado, String id_horas, String codempregado, String codprojeto, int horas, String nomeProjeto, String descricao, String gerente, java.util.Date dataInicio, java.util.Date dataFim) {
        super(id_horas, codempregado, codprojeto, horas, nomeProjeto, descricao, gerente, dataInicio, dataFim);
        this.codEmpregado = codEmpregado;
        this.empregado = empregado;
    }
    public String getCodEmpregado() {
        return codEmpregado;
    }
    public void setCodEmpregado(String codEmpregado) {
        this.codEmpregado = codEmpregado;
    }
    public String getEmpregado() {
        return empregado;
    }
    public void setEmpregado(String empregado) {
        this.empregado = empregado;
    }
}
