import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CompraFactoryTest {

    @Test
    public void deveRetornarExcecaoParaCompraInexistente(){
        try {
            ICompra compra = CompraFactory.obterCompra("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Compra inexistente", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaCompraInvalida() {
        try {
            ICompra compra = CompraFactory.obterCompra("CompraPix");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Compra inválida", e.getMessage());
        }
    }
}
