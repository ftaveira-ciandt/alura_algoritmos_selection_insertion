package br.com.alura.algoritmos;

public class TestaMenorMaiorSalario {

    public static void main(String[] args) {

        int salario[] = {3200, 5000, 6000, 2200};
        int menorS = 0;
        int maiorS = 0;

        for(int atual = 0; atual < 4; atual++ ) {
            if (salario[atual]<salario[menorS]) {
                menorS = atual;
            } else if (salario[atual]>salario[maiorS]) {
                maiorS = atual;
            }

            System.out.println("O menor salario é " + salario[menorS] + ", o maior salario é " + salario[maiorS]);

        }

    }



}
