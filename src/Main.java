import java.util.Scanner;

public class Main {

    static Transporte transporte; //implementación de la interfaz. Funciona como un contenedor genérico para el objeto que se instancie posteriormente. No es una instancia, es una declaración de "Transporte".

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int medio = 0;
        Float x = 0f;
        Float y = 0f;
        Float z = 0f;
        Float peso = 0f;
        Integer embalaje = 0;
        Integer cp = 0;
        Float coste = 0f;
        System.out.println("Escoja el tipo de transporte que desea utilizar: \n1.Bicicleta \n2.Camión");
        medio = input.nextInt();
        System.out.println("Introduzca su CP: ");
        cp = input.nextInt();
        System.out.println("Introduzca el peso: ");
        peso = input.nextFloat();
        System.out.println("Introduzca la altura del paquete: ");
        y = input.nextFloat();
        System.out.println("Introduzca el ancho del paquete: ");
        x = input.nextFloat();
        System.out.println("Introduzca la profundidad del paquete: ");
        z = input.nextFloat();

        switch (medio) {
            case 1:
                transporte = FactoriaTransporte.getProducto(FactoriaTransporte.BICI);
                System.out.println("El medio de transporte elegido es bicicleta.");
                embalaje = transporte.tipoEmbalaje(x, y, z, peso);
                if (embalaje == 0) {
                    System.out.println("El paquete se enviará en un palet.");
                } else if (embalaje == 1) {
                    System.out.println("El paquete se enviará en una caja.");
                } else if (embalaje == 2) {
                    System.out.println("El paquete se enviará en una caja de madera.");
                }
                coste = transporte.costeTotal(cp);
                System.out.println("El coste del envío es de " + coste + "€");
            case 2:
                transporte = FactoriaTransporte.getProducto(FactoriaTransporte.CAMION);
                System.out.println("El medio de transporte elegido es camión.");
                embalaje = transporte.tipoEmbalaje(x, y, z, peso);
                if (embalaje == 0) {
                    System.out.println("El paquete se enviará en un palet.");
                } else if (embalaje == 1) {
                    System.out.println("El paquete se enviará en una caja.");
                } else if (embalaje == 2) {
                    System.out.println("El paquete se enviará en una caja de madera.");
                }
                coste = transporte.costeTotal(cp);
                System.out.println("El coste del envío es de " + coste + "€");
        }


    }
}