import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ESTRUCTURA BASE DEL PROGRAMA
        Scanner lc = new Scanner(System.in);
        //ARREGLOS DE LOS PRODUCTOS Y PRECIOS
        String[] productos = {"Camisa", "Pantalón", "Zapatos", "pulseras", "Mochila"};
        double[] precios = {20.0, 25.0, 40.0, 15.0, 30.0};

        int[] carrito = new int[20]; //MAXIMA CAPACIDAD DE ALMACENAMIENTO DE PRODUCTOS
        int total_prod = 0;
        int opcion;

        //LOGICA DE MENU INTERACTIVO
        do {
            System.out.println("\n===== MENÚ DE LA TIENDA =====");
            System.out.println("1. Ver lista de productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver total a pagar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("--- Productos disponibles ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i] + " - L" + precios[i]);
                    }
                    break;
                case 2:
                    System.out.println("--- Agregar producto al carrito ---");
                    System.out.print("Ingrese el número del producto que desea agregar: ");
                    int seleccion = lc.nextInt();

                    if (seleccion >= 1 && seleccion <= productos.length) {
                        carrito[total_prod] = seleccion - 1; // se guarda el índice del producto
                        total_prod++;
                        System.out.println("Producto agregado al carrito.");
                    } else {
                        System.out.println("Selección inválida. Intente nuevamente.");
                    }
                    break;
                case 3:
                    // LÓGICA DE COMPRA Y TOTAL
                    double total = 0.0;
                    System.out.println("--- Carrito de compras ---");
                    if (total_prod == 0) {
                        System.out.println("Tu carrito está vacío.");
                    } else {
                        for (int i = 0; i < total_prod; i++) {
                            int indice = carrito[i];
                            System.out.println("- " + productos[indice] + " - $" + precios[indice]);
                            total += precios[indice];
                        }
                        System.out.printf("Total a pagar: $%.2f\n", total);
                    }
                    break;

                case 4:
                    System.out.println("Gracias por visitar la tienda. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elija entre 1 y 4.");

            }
        }while (opcion != 4); //salir del menu de la tienda basica.
        lc.close();
    }}