package test;

import main.Calculadora2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculadora2Test {

    Calculadora2 calculadora2 = new Calculadora2();

    @BeforeEach
    public void before(){
        calculadora2 = new Calculadora2();
    }

    @Test
    public void EssaCalculadoraTambemSoma(){

        double soma = calculadora2.soma(2, 2, 2);

        Assertions.assertEquals(6,soma);


    }

}
