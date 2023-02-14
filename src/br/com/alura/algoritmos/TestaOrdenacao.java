package br.com.alura.algoritmos;

public class TestaOrdenacao {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000),
        };
        int quantidadeDeElementos = produtos.length;

        for(int atual = 0; atual <= quantidadeDeElementos - 1; atual++) {

            int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);

            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];

            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;

            System.out.println(produtos[atual].toString());
        }


    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }

        return maisBarato;
    }
}