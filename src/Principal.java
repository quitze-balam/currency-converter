import com.google.gson.Gson;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int salida = 0;
        System.out.println("¡BIENVENID@ AL CONVERTIDOR DE DIVISAS!");
        System.out.println("""
                ************************************************\
                
                Codigos de divisa:\
                
                → MXN = Peso mexicano\
                
                → USD = Dolar estadounidense\
                
                → EUR = Euro\
                
                → GBP = Libra esterlina\
                
                → COP = Peso colombiano\
                
                → BRL = Real brasileño\
                
                → JPY = Yen japones\
                
                → KRW = Won koreano\
                
                → (Si conoce el codigo ISO de la divisa, por favor escribalo)\
                
                ************************************************""");

        do {
            try {
                System.out.println("\nPor favor escriba la información necesaria: ");
                ConsultaTipoDeCambio consulta = new ConsultaTipoDeCambio();

                System.out.println("Indique el codigo de la moneda a cambiar: ");
                String monedaLocal = lectura.nextLine().toUpperCase();

                System.out.println("Indique el codigo de la moneda a la que desea hacer el cambio: ");
                String monedaForanea = lectura.nextLine().toUpperCase();

                System.out.println("Indique el monto a cambiar: ");
                double monto = lectura.nextDouble();
                lectura.nextLine();

               Cambio moneda = consulta.convertir(monedaLocal, monedaForanea, monto);
                System.out.println("\nResultado");
                System.out.println("De: " + moneda.base_code());
                System.out.println("A: " + moneda.target_code());
                System.out.println("Tasa de Conversión: " + moneda.conversion_rate() + " " + moneda.target_code());
                System.out.println("Resultado de Conversión: " + moneda.conversion_result() + " " + moneda.target_code());

            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor verifique la información ingresada.");
                lectura.nextLine();
            }

            System.out.println("\n¿Qué desea hacer?");
            System.out.println("Salir [1] | Continuar [0]");
            while (true) {
                try {
                    salida = lectura.nextInt();
                    lectura.nextLine();
                    if (salida == 0 || salida == 1) {
                        break;
                    } else {
                        System.out.println("Por favor, elija una opción válida: Salir [1] | Continuar [0]");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Intente nuevamente.");
                    lectura.nextLine();
                }
            }
        } while (salida != 1);

        System.out.println("¡Gracias por usar el convertidor de divisas!");
        lectura.close();
    }
}