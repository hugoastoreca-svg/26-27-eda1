
public class CentroComercial {

    private final double PROBABILIDAD_LLEGADA_CLIENTE = 0.6;
    private final double PROBABILIDAD_DE_CAJA_VACIA = 0.4;
    private final int NUMERO_CAJAS = 4;
    private Fila filas;
    private Tiempo tiempo;
    private Caja[] cajas;
    private boolean haLlegadoCliente;
    private Console console;

    public CentroComercial() {
        console = new Console();
        filas = new Fila();
        tiempo = new Tiempo();
        cajas = new Caja[NUMERO_CAJAS];
        for (int i = 0; i < NUMERO_CAJAS; i++) {
            cajas[i] = new Caja();
        }
    }

    public void simular() {
        do {

            tiempo.avanzarTiempo();
            this.procesarLlegadaCliente();
            this.registrarEstado();
            this.asignarClienteACaja();
            this.procesarCajas();
            this.mostrarEstado();

        } while (!tiempo.haFinalizado());

    }

    private void procesarLlegadaCliente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void registrarEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void asignarClienteACaja() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void procesarCajas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void mostrarEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
