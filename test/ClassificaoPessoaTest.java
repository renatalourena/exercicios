import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassificaoPessoaTest {
    ClassificaoPessoa classificaoPessoa = new ClassificaoPessoa();

    @Test
    void deveRetornarCrianca() {
        assertTrue(classificaoPessoa.classifica(12).equals("crianca"));
    }

    @Test
    void deveRetornarIdoso() {
        assertTrue(classificaoPessoa.classifica(60).equals("idoso"));
    }

    @Test
    void deveRetornarAdolescente() {
        assertTrue(classificaoPessoa.classifica(13).equals("adolescente"));
    }

    @Test
    void deveRetornarAdulto() {
        assertTrue(classificaoPessoa.classifica(18).equals("adulto"));
    }
}