package restaurante.logic;

import java.util.Scanner;
import restaurante.logic.menus.AbsFabricaMenu;
import restaurante.logic.menus.MenuColombiano;
import restaurante.logic.menus.MenuItaliano;
import restaurante.logic.menus.MenuVegetariano;
import restaurante.logic.comidas.bebidas.Bebida;
import restaurante.logic.comidas.entradas.Entrada;
import restaurante.logic.comidas.platoprincipal.PlatoPrincipal;
import restaurante.logic.comidas.postre.Postre;

/**
 *
 * @author laver
 */
public class Restaurante {

    protected static boolean pedirComida(Scanner scanner, String tipo){
        System.out.println("Quieres " + tipo + "?\ns para aceptar y n para denegar");
        String decision = scanner.next();
        return decision.equalsIgnoreCase("s");
    }

    public static void main(String[] args) {

        AbsFabricaMenu menu = null;
        int num;
        boolean opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al restaurante del mundo");

        System.out.println("===== 1. Menu Colombiano =====");
        System.out.println("Bebida: Aguapanela");
        System.out.println("Entrada: Empanadas de papa con aji casero");
        System.out.println("Plato principal: Bandeja paisa");
        System.out.println("Postre: Arroz con leche");

        System.out.println("\n===== 2. Menu Italiano =====");
        System.out.println("Bebida: Vino tinto");
        System.out.println("Entrada: Bruschetta");
        System.out.println("Plato principal: Pasta carbonara");
        System.out.println("Postre: Tiramisu");

        System.out.println("\n===== 3. Menu Vegetariano =====");
        System.out.println("Bebida: Jugo natural");
        System.out.println("Entrada: Ensalada fresca");
        System.out.println("Plato principal: Curry de garbanzos con arroz basmati");
        System.out.println("Postre: Tarta de frutas con base integral");

        // Selección del menú
        do {
            opcion = false;
            System.out.println("\nEscoge el menu que desees segun su numero:");
            num = sc.nextInt();
            switch(num){
                case 1 -> menu = new MenuColombiano();
                case 2 -> menu = new MenuItaliano();
                case 3 -> menu = new MenuVegetariano();
                default -> {
                    System.out.println("Opcion no valida");
                    opcion = true;
                }
            }
        } while (opcion);

        // Pedir productos del menú seleccionado
        if (pedirComida(sc, "la bebida")) {
            Bebida bebida = menu.traerBebida();
            System.out.println(bebida.prepararBebida());
        }

        if (pedirComida(sc, "la entrada")) {
            Entrada entrada = menu.traerEntrada();
            System.out.println(entrada.prepararEntrada());
        }

        if (pedirComida(sc, "el plato principal")) {
            PlatoPrincipal plato = menu.traerPlatoPrincipal();
            System.out.println(plato.prepararPlatoPrincipal());
        }

        if (pedirComida(sc, "el postre")) {
            Postre postre = menu.traerPostre();
            System.out.println(postre.prepararPostre());
        }

        System.out.println("Gracias por visitarnos, la propina es voluntaria.");
    }
}
