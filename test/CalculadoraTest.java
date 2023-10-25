import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void soma() {
        Calculadora somando = new Calculadora();
        int calculo = somando.soma(100,900 );
        assertEquals(1000,calculo);
    }

    @org.junit.jupiter.api.Test
    void diferenca() {
        Calculadora diferenca = new Calculadora();
        assertEquals(10,diferenca.diferenca(15,5));
    }

    @org.junit.jupiter.api.Test
    void produto() {

        Calculadora vezes = new Calculadora();
        int calculo = vezes.produto(20 ,20 );
        assertEquals(400,calculo);
    }

    @org.junit.jupiter.api.Test
    void divisao() {

        Calculadora divisao = new Calculadora();
        assertEquals(4,divisao.divisao(20,5));
    }
}