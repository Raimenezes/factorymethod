import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompraBoletoTest {

    @Test
    public void deveConfirmarCompra() {
        ICompra compra = CompraFactory.obterCompra("CompraBoleto");
        assertEquals("Compra efetivada", compra.confirmar());
    }

    @Test
    public void deveCancelarCompra() {
        ICompra compra = CompraFactory.obterCompra("CompraBoleto");
        assertEquals("Compra cancelada", compra.cancelar());
    }
}
