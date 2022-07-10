import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test2Mayatnik {

    //тестирование деления на ноль в формуле
    @Test
    public void testMayatnik() {
        Mayatnik MM = new Mayatnik();
        int l = 5;
        int g = 0;

        Assertions.assertThrowsExactly(ArithmeticException.class,
                () -> MM.period(l, g));
    }
}