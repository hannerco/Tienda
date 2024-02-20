public abstract class Producto {

    public String nombre;
    private int código;

    // Constructor
    public Producto(String nombre, int código) {
        this.nombre = nombre;
        this.código = código;
    }


    // Getters y Setters
    public int getCódigo() {
        return código;
    }
    public void setCódigo(int código) {
        this.código = código;
    }


    //
    public void mostrarProducto(){
        System.out.println("Nombre: " + this.nombre + "\tCódigo: " + getCódigo());
    }
}
