import java.util.ArrayList;

public class ImpresoraArray {
    public ImpresoraArray() {
    }

    public static void mostrarArray(ArrayList<Producto> miArray){
        for (Producto producto: miArray){
            producto.mostrarProducto();
        }
    }
}
