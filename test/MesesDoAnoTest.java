
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MesesDoAnoTest {
    MesesDoAno mesesDoAno = new MesesDoAno();

    @Test
    public void deveRetornarJaneiroQuando1(){
        assertTrue(mesesDoAno.mesDoAno(1).equals("janeiro"));
    }

    @Test
    public void deveRetornarJaneiroQuando2(){
        assertTrue(mesesDoAno.mesDoAno(2).equals("fevereiro"));
    }

    @Test
    public void deveRetornarJaneiroQuando3(){
        assertTrue(mesesDoAno.mesDoAno(3).equals("marco"));
    }

    @Test
    public void deveRetornarJaneiroQuando4(){
        assertTrue(mesesDoAno.mesDoAno(4).equals("abril"));
    }

    @Test
    public void deveRetornarJaneiroQuando5(){
        assertTrue(mesesDoAno.mesDoAno(5).equals("maio"));
    }

    @Test
    public void deveRetornarJaneiroQuando6(){
        assertTrue(mesesDoAno.mesDoAno(6).equals("junho"));
    }
}