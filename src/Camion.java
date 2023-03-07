public class Camion implements Transporte {


    @Override
    public Float costeTotal(Integer cp) {
        if (cp >= 36330) {
            return 5.50f;
        } else
            return 8.95f;
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Float volumen = x * y * y;
        if (volumen >= 1100000 || peso >= 50) {
            return 0;
        } else if (volumen >= 400000 || peso >= 30) {
            return 2;
        } else return 1;
    }
}
