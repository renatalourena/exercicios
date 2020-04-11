import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaiorNumeroDaListaTest {
    MaiorNumeroDaLista maiorNumeroDaLista = new MaiorNumeroDaLista();

    @Test
    void maiorNumeroEhOPrimeiro() {
        int[] lista = new int[]{ 12,3,8,9,10};
        assertTrue(maiorNumeroDaLista.maiorNumero(lista).equals(12));
    }

    @Test
    void maiorNumeroEhODoMeio() {
        int[] lista = new int[]{ 1,2,4,4,1,0};
        assertTrue(maiorNumeroDaLista.maiorNumero(lista).equals(4));
    }

    @Test
    void maiorNumeroEhOUltimo() {
        int[] lista = new int[]{ 1,2,3,4,5,6,7,8,9,10};
        assertTrue(maiorNumeroDaLista.maiorNumero(lista).equals(10));
    }
}