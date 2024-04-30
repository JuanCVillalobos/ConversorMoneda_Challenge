import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                --*-*-*-* Bienvenido Al Conversor De Moneda! -*-*-*-*-
                -*-*-*--*-*-*-Selecciona la opción deseada -*-*-*-*-*-
                -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-
                1-Convertir de USD (Dolares) ----> a EUR (EUROS).
                2-Convertir de EUR (EUROS) ------> a USD (Dolares).
                3-Convertir de USD (Dolares) -----> a ARS (Peso Argentino).
                4-Convertir de ARS (Peso Argentino) -----> a USD (Dolares).
                5-Convertir de USD (Dolares) -----> a MXN (Peso Mexicano).
                6-Convertir de MXN (Peso Mexicano) -----> a USD (Dolares).
                7-Convertir de USD (Dolares) -----> a COP (Peso Colombiano).
                8-Convertir de COP (Peso Colombiano) -----> a USD (Dolares).
                9-Convertir de USD (Dolares) ------> a DOP (Peso Dominicano).
                10-Convertir de DOP (Peso Dominicano) -----> a USD (Dolares).
                11-Salir
                """;

        int seleccionUsuario;
        int seguir;
        do {
            System.out.println(menu);
            System.out.println("Elija la opción deseada: ");
            seleccionUsuario = scanner.nextInt();

            switch (seleccionUsuario) {
                case 1:
                    convertirMoneda("USD", "EUR", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 2:
                    convertirMoneda("EUR", "USD", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 3:
                    convertirMoneda("USD", "ARS", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 4:
                    convertirMoneda("ARS", "USD", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 5:
                    convertirMoneda("USD", "MXN", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 6:
                    convertirMoneda("MXN", "USD", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 7:
                    convertirMoneda("USD", "COP", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 8:
                    convertirMoneda("COP", "USD", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 9:
                    convertirMoneda("USD", "DOP", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 10:
                    convertirMoneda("DOP", "USD", scanner);
                    System.out.println("Deseas continuar usando al app? ");
                    System.out.println("1-si");
                    System.out.println("2-no");
                    seguir = scanner.nextInt();
                    if (seguir == 1) {
                        break;
                    } else {
                        seleccionUsuario = 11;
                        break;
                    }
                case 11:
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-");
                    System.out.println(" ");
                    System.out.println("Gracias por usar el conversor de monedas......");
                    System.out.println(" ");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-");
                    break;
                default:
                    System.out.println("Opción no válida, elija una opción del menú.");
            }
        } while (seleccionUsuario != 11);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-");
        System.out.println(" ");
        System.out.println("Gracias por usar el conversor de moneda.......");
        System.out.println(" ");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-");

        scanner.close();
    }

    private static void convertirMoneda(String baseCode, String targetCode, Scanner scanner) {
        System.out.println("Ingrese el monto que deasea convertir: ");
        double amount = scanner.nextDouble();
        Conversion conversion = new Conversion(baseCode, targetCode, amount);
        try {
            double result = conversion.convert();
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-");
            System.out.println(amount + " " + baseCode + " equivalen a: " + result + " " + targetCode);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-");


        } catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}
