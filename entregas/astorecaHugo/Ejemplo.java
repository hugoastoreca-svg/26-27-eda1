public class Ejemplo {
    public static void main(String[] args) {
        Queue cola = new Queue();

        System.out.println(cola.estaVacia());

        cola.insertarAlFinal("a");
        cola.insertarAlFinal("b");
        cola.insertarAlFinal("c");


        System.out.println(cola.sacarPrimero());
        System.out.println(cola.sacarPrimero());
        System.out.println(cola.sacarPrimero());
    

    }
}
