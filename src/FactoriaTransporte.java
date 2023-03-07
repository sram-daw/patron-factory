public class FactoriaTransporte {
    /**
     * Fabrica encargada de devolver el producto
     * que elegimos según el tipo: bicicleta o camión
     */

    /**
     * opción de uso para seleccionar el objeto de tipo Bicicleta
     */
    public static final int BICI = 0;

    /**
     * opción de uso para seleccionar el objeto de tipo Camion
     */
    public static final int CAMION = 1;

    /**
     * Devuelve la instancia del tipo de objeto concreto que hereda de la interfaz Transporte
     * @param tipoVehiculo 0: bicicleta, 1:camion
     * @return producto segun el tipo
     */
    public static Transporte getProducto(int tipoVehiculo) {
        switch (tipoVehiculo) {
            case BICI:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            default:
                return null;
        }
    }
}
