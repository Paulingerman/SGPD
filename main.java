package sgpd;

public class main {
   
    public static void main(String[] args) {
        // Criação de um projeto
        Projeto projeto = new Projeto("P001", "Desenvolvimento de Software", "G001", new java.util.Date(), new java.util.Date());
        
        // Criação de um departamento
        Departamento departamento = new Departamento("D001", "Desenvolvimento", "P001", "Desenvolvimento de Software", "G001", new java.util.Date(), new java.util.Date());
        
        // Criação de um gerente
        Gerente gerente = new Gerente("G001", "João Silva", "P001", "Desenvolvimento de Software", "G001", new java.util.Date(), new java.util.Date());
        
        // Criação de horas trabalhadas
        HorasT horasTrabalhadas = new HorasT("H001", "E001", "P001", 8, "Desenvolvimento de Software", "Descrição do projeto", "G001", new java.util.Date(), new java.util.Date());
        
        Empregado empregado = new Empregado("E001", "Maria Oliveira", "H001", "E001", "P001", 8, "Desenvolvimento de Software", "Descrição do projeto", "G001", new java.util.Date(), new java.util.Date());
        // Exibir informações do projeto
        System.out.println("Código do Projeto: " + projeto.getCodProjeto());
        System.out.println("Nome do Projeto: " + projeto.getProjeto());
        System.out.println("Gerente do Projeto: " + projeto.getCodGerente());
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Data de Início: " + projeto.getDataInicio());
        System.out.println("Data de Fim: " + projeto.getDataFim());
        System.out.println("Código do Departamento: " + departamento.getCodDepartamento());
        System.out.println("Nome do Departamento: " + departamento.getDepartamento());
        System.out.println("Código do Empregado: " + empregado.getCodEmpregado());
        System.out.println("Nome do Empregado: " + empregado.getEmpregado());

    }
}
