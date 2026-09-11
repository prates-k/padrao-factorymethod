package br.com.kauaprates.factorymethod;

public class ServicoMatricula implements IServico {

    public String executar() {
        return "Matrícula na academia efetivada";
    }

    public String cancelar() {
        return "Matrícula na academia cancelada";
    }
}
