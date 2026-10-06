public class Main {
    public static void main(String[] args) {
        ListaLigadaADT<Videojuego> listaJuegos = new ListaLigadaADT<>();

        System.out.println("¿La lista está vacía?: " );
        System.out.println(listaJuegos.estaVacia());


        Videojuego v1 = new Videojuego("Hollow Knight", 149.99f, false, "PC / Xbox / Switch", 1);
        Videojuego v2 = new Videojuego("Minecraft", 350.00f, true, "Multiplataforma", 8);
        Videojuego v3 = new Videojuego("Super Mario Galaxy", 1200.00f, true, "Nintendo Switch", 2);
        Videojuego v4 = new Videojuego("Lethal Company", 110.00f, true, "PC", 4);
        Videojuego v5 = new Videojuego("Alice: Madness Returns", 299.00f, false, "PC / Xbox", 1);
        Videojuego v6 = new Videojuego("Fortnite", 0.0f, true, "Multiplataforma", 99);

        listaJuegos.agregar(v1);
        listaJuegos.agregar(v2);
        listaJuegos.agregar(v3);

        System.out.println("\nLista inicial de videojuegos");
        System.out.println("------------------------------------");
        listaJuegos.transversal();
        System.out.println("Tamaño actual:");
        System.out.println(listaJuegos.getTamanio());
        System.out.println("¿La lista está vacía?: " );
        System.out.println(listaJuegos.estaVacia());

        listaJuegos.agregarAlInicio(v4);
        System.out.println("------------------------------------");
        System.out.println("agregar Lethal Company al inicio");
        listaJuegos.transversal();
        System.out.println("Tamaño actual:");
        System.out.println(listaJuegos.getTamanio());

        listaJuegos.agregarDespuesDe(v2, v5);
        System.out.println("------------------------------------");
        System.out.println("Alice: Madness Returns después de Minecraft");
        listaJuegos.transversal();

        System.out.println("------------------------------------");
        System.out.println("Agregar Fortnite al final");
        listaJuegos.agregarAlFinal(v6);
        listaJuegos.transversal();
        System.out.println("Tamaño actual:");
        System.out.println(listaJuegos.getTamanio());

        System.out.println("------------------------------------");
        System.out.println("Buscar Mario Galaxy en la lista:");
        System.out.println("Posición de Super Mario Galaxy en la lista:");
        System.out.println(listaJuegos.buscar(v3));

        System.out.println("------------------------------------");
        System.out.println("Cambiar o actualizar Hollow Knight por Hollow Knight Silksong");
        Videojuego vNuevo = new Videojuego("Hollow Knight: Silksong", 299.00f, false, "PC / Xbox / Switch", 1);
        listaJuegos.actualizar(v1, vNuevo);
        listaJuegos.transversal();

        System.out.println("------------------------------------");
        System.out.println("Eliminar el 1ro de la lista:");
        listaJuegos.eliminarElPrimero();
        listaJuegos.transversal();

        System.out.println("------------------------------------");
        System.out.println("Eliminar el ultimo de la fila:");
        listaJuegos.eliminarElFinal();
        listaJuegos.transversal();


    }
}