package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CalculadoraTest {

    @Test
    @DisplayName("Somar dois números")
    void soma() {
        assertEquals(0, Calculadora.soma(0L, 0L));
        assertEquals(4, Calculadora.soma(2L, 2L));
    }

    @Test
    @DisplayName("Subtrair dois números")
    void subtracao() {
        assertEquals(0, Calculadora.subtracao(0L, 0L));
        assertEquals(2, Calculadora.subtracao(4L, 2L));
    }

    @Test
    @DisplayName("Multiplicar dois números")
    void multiplicacao() {
        assertEquals(0, Calculadora.multiplicacao(0L, 0L));
        assertEquals(10, Calculadora.multiplicacao(2L, 5L));
    }

    @Test
    @DisplayName("Dividir dois números")
    void divisao() {
        assertEquals(2, Calculadora.divisao(10L, 5L));
    }
}