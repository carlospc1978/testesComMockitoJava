package main;

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

    public String nome(String nome){
        return nome;
    }
}
