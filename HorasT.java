package sgpd;

import java.util.Date;

public class HorasT extends Projeto {
    private String id_horas;
    private String codempregado;
    private String codprojeto;
    private int horas;

    public HorasT(String id_horas, String codempregado, String codprojeto, int horas, 
    String nomeProjeto, String descricao, String gerente, Date dataInicio, Date dataFim){
        super(codprojeto, nomeProjeto, gerente, dataInicio, dataFim);
        this.id_horas = id_horas;
        this.codempregado = codempregado;
        this.codprojeto = codprojeto;
        this.horas = horas;
    }
        
    
    public String getId_horas() {
        return id_horas;
    }
    public void setId_horas(String id_horas) {
        this.id_horas = id_horas;
    }
    public String getCodempregado() {
        return codempregado;
    }
    public void setCodempregado(String codempregado) {
        this.codempregado = codempregado;
    }
}
