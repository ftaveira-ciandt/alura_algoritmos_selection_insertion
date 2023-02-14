package br.com.alura.algoritmos;

public class TestaMenorPreco {

    public static void main(String[] args) {
        double precos[] = {1000000, 46000, 16000, 46000, 17000};

        int maisBarato = 0;

        for (int atual = 0; atual <=4; atual++ ) {
            if (precos[atual] < precos[maisBarato]) {
                maisBarato = atual;
            }
            System.out.println("O mais barato esta na posicao " + maisBarato);
            System.out.println("O carro mais barato custa " + precos[maisBarato] + "\n");

        }





        }
    }

