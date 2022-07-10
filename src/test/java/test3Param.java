import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class test3Param {

    @ParameterizedTest
    @MethodSource("metod")
    public void testParam(int l, int expectResult) {

        Mayatnik M = new Mayatnik();
        int g = 10;

        int result = M.period(l, g);

        Assertions.assertEquals(expectResult, result);
    }

    //метод для проверки ряда значений
    public Stream<Arguments> metod() {
        return Stream.of(
                Arguments.of(50, 13),
                Arguments.of(250, 30)
        );
    }
}
