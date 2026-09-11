package br.com.kauaprates.factorymethod;

public class ServicoTrancamento implements IServico {

    public String executar() {
        return "Trancamento do plano efetivado";
    }

    public String cancelar() {
        return "Trancamento do plano cancelado";
    }
}
