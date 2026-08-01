import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {

    @Test
    public void testCalculadoraInsumos() {
        int stockActual = 10;
        int insumoUtilizado = 4;
        int resultadoEsperado = 6;

        assertEquals(resultadoEsperado, (stockActual - insumoUtilizado), "El cálculo del descuento de insumos debe ser exacto");
    }
}
