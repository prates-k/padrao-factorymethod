package br.com.kauaprates.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTrancamentoTest {

    @Test
    void deveExecutarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento do plano efetivado", servico.executar());
    }

    @Test
    void deveCancelarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento do plano cancelado", servico.cancelar());
    }
}