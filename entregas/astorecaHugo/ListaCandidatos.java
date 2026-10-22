import java.io.Console;

public class ListaCandidatos {
    private Node primero;
    private Console console;

    public ListaCandidatos() {
        primero = null;
        console = new Console();
    }

    public void insertarInicio(String value) {
        Node nuevo = new Node(value);
        nuevo.setNext(primero);
        primero = nuevo;

    }

    public boolean eliminar(String value) {
        if (primero == null) {
            return false;
        }

        if (primero.getValue().equals(value)) {
            primero = primero.getNext();
            return true;
        }

        Node anterior = primero;
        Node actual = primero.getNext();

        while (actual != null) {
            if (actual.getValue().equals(value)) {
                anterior.setNext(actual.getNext());
                return true;
            }

            anterior = actual;
            actual = actual.getNext();
        }

        return false;
    }

    public boolean contiene(String value) {
        Node actual = primero;

        while (actual != null) {
            if (actual.getValue().equals(value)) {
                return true;
            }

            actual = actual.getNext();
        }

        return false;
    }

    public void mostrar() {
        Node actual = primero;
        while (actual != null) {
            actual.getValue();
            console.writeln(actual.getValue());
            actual = actual.getNext();

        }
    }
}
