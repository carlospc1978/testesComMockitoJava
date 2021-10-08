package main;

public class Calculadora2 {

    public double soma (double... numeros){
        double soma=0;

        if(numeros.length>0) {
            for (double num : numeros){
                soma += num;
            }
        }
        return soma;
    }

}
