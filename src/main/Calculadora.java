package main;

import java.util.Arrays;

public class Calculadora {
    public double soma (double... numeros){
        double soma=0;

        if(numeros.length>0) {
            for (double num : numeros){
                soma += num;
            }
        }

        return soma;
    }

    public double subtrair (int a, int b){

        int resultado=0;

        if(a<0){
            return 0;
        }

        if(b<0){
            return 0;
        }

         return a-b;
    }

    public String nomes (String nomes){
        return nomes;
    }


}
