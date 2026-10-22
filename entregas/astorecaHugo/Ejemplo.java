public class Ejemplo {
    public static void main(String[] args) {
        Queue cola = new Queue();
        List presentes = new List();
        List candidaturas = new List();

        System.out.println(cola.estaVacia());

       System.out.println(cola.sacarPrimero());
        System.out.println(cola.sacarPrimero());
        System.out.println(cola.sacarPrimero());
        System.out.println(cola.estaVacia());

        ListaAlumnosPresentes lista = new ListaAlumnosPresentes();
        System.out.println("----------------");
        lista.insertarInicio("jacobo");
        lista.insertarInicio("hugo");
        lista.insertarInicio("kiko");
        lista.mostrar();
        lista.eliminar("jacobo");
        System.out.println("----------------");
        lista.mostrar();
        lista.eliminar("kiko");

        System.out.println("----------------");
        lista.mostrar();

        ListaCandidatos candidatos = new ListaCandidatos();

        candidatos.insertarInicio("Ana");
        candidatos.insertarInicio("Luis");
        candidatos.insertarInicio("Carlos");

        console.writeln("Candidatos:");
        candidatos.mostrar();

        console.writeln("¿Ana es candidata?");
        console.writeln(candidatos.contiene("Ana"));

        console.writeln("Eliminamos a Luis:");
        candidatos.eliminar("Luis");

        console.writeln("Candidatos después de eliminar:");
        candidatos.mostrar();
    }

    }

