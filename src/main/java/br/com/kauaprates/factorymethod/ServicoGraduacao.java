package br.com.kauaprates.factorymethod;

public class ServicoGraduacao implements IServico {

    public String executar() {
        return "Graduação de faixa efetivada";
    }

    public String cancelar() {
        return "Graduação de faixa cancelada";
    }
}
