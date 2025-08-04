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
                        System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
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


            }
        }}}