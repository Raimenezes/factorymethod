import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompraCartaoTest {

    @Test
    public void deveConfirmarCompra() {
        ICompra compra = CompraFactory.obterCompra("CompraCartao");
        assertEquals("Compra efetivada", compra.confirmar());
    }

    @Test
    public void deveCancelarCompra() {
        ICompra compra = CompraFactory.obterCompra("CompraCartao");
        assertEquals("Compra cancelada", compra.cancelar());
    }
}
