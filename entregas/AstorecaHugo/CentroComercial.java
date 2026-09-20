
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
            fila.registrarEstado();
            this.asignarClienteACaja();
            this.procesarCajas();
            this.mostrarEstado();

        } while (!tiempo.haFinalizado());
        this.mostrarResumen();
        
    }

    private void procesarLlegadaCliente() {
        haLlegadoCliente = Math.random() <= PROBABILIDAD_LLEGADA_CLIENTE;
        if (haLlegadoCliente) {
            Cliente cliente = new Cliente();
            fila.añadirCliente(cliente);
        }
    }

    
    

    private void asignarClienteACaja() {
        for(int numeroCaja=0; numeroCaja<cajas.length; numeroCaja++){
            if (cajas[numeroCaja].estaLibre() 
                && fila.hayClientes()
                && cajas[numeroCaja].puedeAtender(fila.primero())){
                Cliente cliente = fila.quitarCliente();
                cajas[numeroCaja].asignar(cliente);
            }
        }
    }

    private void procesarCajas() {
        for(int numeroCaja=0; numeroCaja<cajas.length; numeroCaja++){
            cajas[numeroCaja].avanzarAtencion();
        }
    }

    private void mostrarEstado() {
        console.cleanScreen();
        tiempo.mostrar(haLlegadoCliente);
        fila.mostrar();
        this.mostrarCajas();
    }

    private void mostrarResumen() {
        int minutosSinClientes = fila.obtenerMinutosSinClientes();
        int personasEnCola = fila.obtenerCantidadPersonasEnCola();
        int personasAtendidas = this.obtenerPersonasAtendidas();
        int itemsVendidos = this.obtenerItemsVendidos();

        console.writeln("Personas atendidas: " + personasAtendidas);
        console.writeln("Personas en cola al cierre: " + personasEnCola);
        console.writeln("Items vendidos: " + itemsVendidos);
        console.writeln("Minutos sin clientes en cola: " + minutosSinClientes);
    }
}
