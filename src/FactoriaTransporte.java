public class FactoriaTransporte {
    /**
     * Fabrica encargada de devolver el producto
     * que elegimos según el tipo
     */

    public static final int BICI = 0;
    public static final int CAMION = 1;

    /**
     * Devuelve producto del tipo de la interfaz
     * @param tipoVehiculo 0: bicicleta, 1:camion
     * @return producto segun el tipo
     */

    public static ITransporte getProducto(int tipoVehiculo) {
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
