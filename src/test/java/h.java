import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Проверка корректности сложения")
    void plus() {
        //given
        final int x = 5;
        final int y = 7;
        final int expected = 12;
        //when
        final int result = calc.plus.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Проверка корректности вычитания")
    void minus() {
        //given
        final int x = 10;
        final int y = 7;
        final int expected = 3;
        //when
        final int result = calc.minus.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Проверка корректности умножения")
    void multipy() {
        //given
        final int x = 5;
        final int y = 7;
        final int expected = 35;
        //when
        final int result = calc.multiply.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Проверка корректности деления")
    void devide() {
        //given
        final int x = 35;
        final int y = 7;
        final int expected = 5;
        //when
        final int result = calc.devide.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }
}
