public class ListaLigadaADT<T> {
    private Nodo<T> head;

    public ListaLigadaADT(){
        this.head = null;
    }

    public boolean estaVacia(){
        return this.head == null;
    }

    public int getTamanio(){
        int contador = 0;
        if(head == null){
            return contador;
        }else {
            Nodo<T> actual = head;
            do{
                contador++;
                actual = actual.getSiguiente();
            }while(actual != null);
            return contador;
        }
    }

    public void agregar(T dato){
        if(head == null){
            this.head = new Nodo<>(dato);
        }else{
            Nodo<T> actual = head;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo<>(dato));
        }
    }

    public void agregarAlFinal(T valor){
        agregar(valor);
    }

    public void agregarAlInicio(T valor){
        Nodo<T> nuevoNodo = new Nodo<>(valor, this.head);
        this.head = nuevoNodo;
    }

    public void agregarDespuesDe(T referencia, T valor){
        if(head == null){
            System.out.println("Vacia");
        }else{
            Nodo<T> actual = this.head;
            while(actual != null && !actual.getDato().equals(referencia)){
                actual = actual.getSiguiente();
            }
            if(actual != null){
                Nodo<T> nuevoNodo = new Nodo<>(valor, actual.getSiguiente());
                actual.setSiguiente(nuevoNodo);
            }
        }
    }

    public void eliminarElPrimero(){
        if(head == null){
            System.out.println("Vacia");
        }else{
            this.head = this.head.getSiguiente();
        }
    }

    public void eliminarElFinal(){
        if(head == null){
            System.out.println("Vacia");
        }else if(this.head.getSiguiente() == null){
            this.head = null;
        }else{
            Nodo<T> actual = this.head;
            while(actual.getSiguiente().getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
        }
    }

    public int buscar(T valor){
        if(head == null){
            return -1;
        }
        Nodo<T> actual = this.head;
        int posicion = 0;
        while(actual != null){
            if(actual.getDato().equals(valor)){
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }
        return -1;
    }

    public void actualizar(T aBuscar, T nuevoValor){
        if(head == null){
            System.out.println("Vacia");
        }else{
            Nodo<T> actual = this.head;
            while(actual != null && !actual.getDato().equals(aBuscar)){
                actual = actual.getSiguiente();
            }
            if(actual != null){
                actual.setDato(nuevoValor);
            }
        }
    }

    public void transversal(){
        if(head == null){
            System.out.println("Vacia");
        }else {
            Nodo<T> actual = head;
            do{
                System.out.print("|" + actual.getDato());
                actual = actual.getSiguiente();
            }while(actual != null);
            System.out.println("|");
        }
    }
}