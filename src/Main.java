import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductosNacionales = new ArrayList<>();
        ArrayList<Producto> listaProductosImportados = new ArrayList<>();

        boolean continuarEnMenu = true;
        Scanner input = new Scanner(System.in);

        while(continuarEnMenu){
            System.out.print(
                    "\n\nPresione el número de la opción que desea hacer\n" +
                            "1 - Registrar productos nacionales\n" +
                            "2 - Registrar productos importados\n" +
                            "3 - Listar productos nacionales\n" +
                            "4 - Listar productos importados\n" +
                            "5 - Buscar producto nacional\n" +
                            "6 - Buscar producto importado" +
                            "\nIndique su opción:\t"
            );
            int option = input.nextInt();
            input.nextLine();

            if (option == 1){
                System.out.println("Indique el STRING nombre del producto:\t");
                String nombre = input.nextLine();

                System.out.println("Indique el INT número de su código:\t");
                int codigo = input.nextInt();
                input.nextLine();

                System.out.println("Indique el STRING del registro DIAN:\t");
                String registroDIAN = input.nextLine();
                listaProductosNacionales.add(new Nacional(nombre, codigo, registroDIAN));
            }


            else if (option == 2) {
                System.out.println("Indique el STRING nombre del producto:\t");
                String nombre = input.nextLine();

                System.out.println("Indique el INT número de su código:\t");
                int codigo = input.nextInt();
                input.nextLine();

                System.out.println("Indique el STRING de la licencia:\t");
                String licencia = input.nextLine();
                listaProductosNacionales.add(new Nacional(nombre, codigo, licencia));

            }


            else if (option == 3) {
                ImpresoraArray.mostrarArray(listaProductosNacionales);
                if(listaProductosImportados.size() == 0){
                    System.out.println("No hay productos en la lista de nacionales");
                }
            }

            else if (option == 4) {
                ImpresoraArray.mostrarArray((listaProductosImportados));
                if(listaProductosImportados.size() == 0){
                    System.out.println("No hay productos en esta lista de importados");
                }
            }



            else if (option == 5){
                System.out.println("Ingresa el STRING nombre del producto nacional que puedes buscar:\t");
                String nombreABuscar = input.nextLine();
                boolean flag = false;
                for (Producto producto: listaProductosNacionales){
                    if (Objects.equals(producto.nombre, nombreABuscar)){
                        System.out.printf("Sí, el producto %s está en la lista.", nombreABuscar);
                        flag = true;
                        break;
                    }
                }
                if (flag == false){
                    System.out.printf("No, el producto %s no está en la lista.", nombreABuscar);
                }
            }

            else if (option == 6){
                System.out.println("Ingresa el STRING nombre del producto nacional que puedes buscar:\t");
                String nombreABuscar = input.nextLine();
                boolean flag = false;
                for (Producto producto: listaProductosImportados){
                    if (Objects.equals(producto.nombre, nombreABuscar)){
                        System.out.printf("Sí, el producto %s está en la lista.", nombreABuscar);
                        flag = true;
                        break;
                    }
                }
                if (flag == false){
                    System.out.printf("No, el producto %s no está en la lista.", nombreABuscar);
                }
            }



            // Validar
            validarChao(continuarEnMenu);
        }
    }


    public static void validarChao(boolean continuarEnMenu){
        Scanner inpuuut = new Scanner(System.in);
        System.out.print("\nProceso terminado. Presione 0 si desea finalizar o enter si quiere seguir\t");
        String salgo = inpuuut.nextLine();
        if (Objects.equals(salgo, "0")){
            continuarEnMenu = false;
        }
    }
}