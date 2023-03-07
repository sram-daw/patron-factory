import java.util.IllegalFormatCodePointException;

public class Bicicleta implements ITransporte {


   @Override
    public Float costeTotal(Integer cp) {

        if (cp >= 36330) {
            return 3.95f;
        } else
            return 5.00f;
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Float volumen = x * y * y;
        if (volumen >= 1000000 || peso >= 40) {
            return 0;
        } else if (volumen >= 500000 || peso >= 20) {
            return 2;
        } else return 1;

    }
}
