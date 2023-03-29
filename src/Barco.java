public class Barco implements Transporte{

    @Override
    public Float costeTotal(Integer cp) {
        if (cp >= 50000) {
            return 80.55f;
        } else
            return 60.95f;
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {

        Float volumen = x * y * y;
        if (volumen >= 2000000 || peso >= 500) {
            return 0;
        } else if (volumen >= 550000 || peso >= 50) {
            return 2;
        } else return 1;
    }
}
