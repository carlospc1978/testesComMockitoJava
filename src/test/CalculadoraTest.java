package test;

import main.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculadoraTest {
    @Test
    void seNaoInformarNumeroDeveRetornarZero() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.soma();
        Assertions.assertEquals(0,soma);
    }

    @Test
    void devesomar() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.soma(5, 5);
        Assertions.assertEquals(10,soma);
    }



}