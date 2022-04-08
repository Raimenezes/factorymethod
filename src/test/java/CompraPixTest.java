import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompraPixTest {

    @Test
    public void deveConfirmarCompra() {
        ICompra compra = CompraFactory.obterCompra("CompraPix");
        assertEquals("Compra efetivada", compra.confirmar());
    }

    @Test
    public void deveCancelarCompra() {
        ICompra compra = CompraFactory.obterCompra("CompraPix");
        assertEquals("Compra cancelada", compra.cancelar());
    }
}
