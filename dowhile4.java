package somar;

import java.util.*;

public class dowhile4 {
    public static void main(String[] args) {
        try {
            Scanner scnProduto = new Scanner(System.in);
            Scanner scnQtd = new Scanner(System.in);
            Scanner scnContinuar = new Scanner(System.in);

            String[] nomesProdutos = {
                "Maçã (Kg)",
                "Pão (Un)",
                "Sabão 2Kg (Un)",
                "Coca-Cola (2L)",
                "Chocolate (Barra)"
            };

            double[] precosProdutos = {
                7.59,
                0.51,
                27.86,
                8.99,
                3.89
            };

            short codProduto;
            List<Short> codigosProdutosCarrinho = new ArrayList<>();
            List<String> nomesProdutosCarrinho = new ArrayList<>();
            List<Double> precosProdutosCarrinho = new ArrayList<>();

            double qtdProduto;
            List<Double> qtdsProdutosCarrinho = new ArrayList<>();
            List<Double> subtotalProdutosCarrinho = new ArrayList<>();

            short qtdProdutosCarrinho = 0;

            boolean carrinhoCheio = false;

            short idProdTemp;
            while (carrinhoCheio == false) {
                idProdTemp = 0;
                while (idProdTemp < nomesProdutos.length) {
                    System.out.println(
                        "Cód [" +
                        idProdTemp +
                        "] - Produto: " +
                        nomesProdutos[idProdTemp]
                    );
                    idProdTemp++;
                }

                System.out.println("Digite o código do produto que deseja adicionar ao carrinho");
                codProduto = scnProduto.nextShort();

                codigosProdutosCarrinho.add(codProduto);
                nomesProdutosCarrinho.add(nomesProdutos[codProduto]);
                precosProdutosCarrinho.add(precosProdutos[codProduto]);

                System.out.println("Digite a quantidade do produto que deseja adicionar ao carrinho");
                qtdProduto = scnQtd.nextDouble();

                qtdsProdutosCarrinho.add(qtdProduto);
                subtotalProdutosCarrinho.add(precosProdutos[codProduto] * qtdProduto);

                qtdProdutosCarrinho++;
                if (qtdProdutosCarrinho == nomesProdutos.length) {
                    carrinhoCheio = true;
                }

                System.out.println("Deseja adicionar mais algum produto no carrinho?");
                if (
                    scnContinuar.nextLine().toUpperCase().equals("NAO") ||
                    scnContinuar.nextLine().toUpperCase().equals("N")
                ) {
                    break;
                }
            }

            scnProduto.close();
            scnQtd.close();
            scnContinuar.close();

            short idProdCarrinhoTmp = 0;
            double precoTotal = 0.0;
            System.out.println("Os produtos do carrinho são:");

            while (idProdCarrinhoTmp < nomesProdutosCarrinho.size()) {
                System.out.println(
                    "Código: " +
                    codigosProdutosCarrinho.get(idProdCarrinhoTmp) +
                    " | Produto: " +
                    nomesProdutosCarrinho.get(idProdCarrinhoTmp) +
                    " | Preço unitário: R$ " +
                    precosProdutosCarrinho.get(idProdCarrinhoTmp) +
                    " | Quantidade: " +
                    qtdsProdutosCarrinho.get(idProdCarrinhoTmp) +
                    " | Subtotal: R$ " +
                    subtotalProdutosCarrinho.get(idProdCarrinhoTmp)
                );
                precoTotal += subtotalProdutosCarrinho.get(idProdCarrinhoTmp);
                idProdCarrinhoTmp++;
            }

            System.out.println("Total da compra: R$ " + precoTotal);
        } catch (InputMismatchException e) {
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
    }

    @Override
    public String toString() {
        return "dowhile4 []";
    }

}