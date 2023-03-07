public interface Transporte {
    /**
     * Interfaz que tiene los métodos que
     * son comunes a todos los transportes
     * Es necesaria para poder devolver los diferentes objetos/productos
     */


    Float costeTotal(Integer cp);
    Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);
}
