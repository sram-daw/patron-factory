public interface Transporte {

    /**
     * Interfaz que tiene los métodos que
     * son comunes a todos los transportes
     * Es necesaria para poder devolver los diferentes objetos/productos
     */

    /**
     * Calcula el coste del envío
     *
     * @param cp: código postal
     * @return total coste envío
     */
    public Float costeTotal(Integer cp);

    /**
     * Determina el tipo de embalaje en función de las medidas y el peso del bulto
     *
     * @param x: medidas ancho
     * @param y: medidas alto
     * @param z: medidas profundidad
     * @param peso: peso en kg
     * @return embalaje: 0 palet, 1 envoltorio cartón, 2 caja de madera
     */
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);
}
