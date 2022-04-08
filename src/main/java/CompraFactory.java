public class CompraFactory {

    public static ICompra obterCompra(String compra) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName(compra);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Compra inexistente");
        }
        if (!(objeto instanceof ICompra)) {
            throw new IllegalArgumentException("Compra inválida");
        }
        return (ICompra) objeto;
    }
}
