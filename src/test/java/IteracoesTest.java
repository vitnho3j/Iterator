import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteracoesTest {

    @Test
    void deveContarIngressosPista(){
        Evento evento = new Evento(
                new Ingresso("Pista"),
                new Ingresso("Camarote"),
                new Ingresso("Pista"),
                new Ingresso("Pista")
        );
        assertEquals(3, Iteracoes.contarIngressosPista(evento));
    }

    @Test
    void deveContarIngressosCamarote(){
        Evento evento = new Evento(
                new Ingresso("Pista"),
                new Ingresso("Camarote"),
                new Ingresso("Pista"),
                new Ingresso("Pista")
        );
        assertEquals(1, Iteracoes.contarIngressosCamarote(evento));
    }

    @Test
    void deveContarTotalIngressos(){
        Evento evento = new Evento(
                new Ingresso("Pista"),
                new Ingresso("Camarote"),
                new Ingresso("Pista"),
                new Ingresso("Pista")
        );
        assertEquals(4, Iteracoes.contarQuantidadeTotalIngressos(evento));
    }


}
