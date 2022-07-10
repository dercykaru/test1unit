import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test1Energy {

    //тестирование на правильность расчета
    @Test
    public void testEnergy() {
        EnergyFull eee = new EnergyFull();
        Long m = 1L;
        Long expectResult = 90_000_000_000L;

        Long result = eee.energy(m);

        Assertions.assertEquals(expectResult, result);

    }

}
