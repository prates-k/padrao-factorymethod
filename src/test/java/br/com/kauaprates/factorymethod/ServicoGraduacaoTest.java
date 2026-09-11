package br.com.kauaprates.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoGraduacaoTest {

    @Test
    void deveExecutarGraduacao() {
        IServico servico = ServicoFactory.obterServico("Graduacao");
        assertEquals("Graduação de faixa efetivada", servico.executar());
    }

    @Test
    void deveCancelarGraduacao() {
        IServico servico = ServicoFactory.obterServico("Graduacao");
        assertEquals("Graduação de faixa cancelada", servico.cancelar());
    }
}