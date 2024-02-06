package desafio_produto.programa;

import desafio_produto.entidades.Produto;

import java.util.Scanner;

public class ProdutoDescontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeProduto;
        Double precoUnitario;
        Integer quantidadeProduto;
        System.out.println("Venda de Produto");

        System.out.print("Digite o nome do produto: ");
        nomeProduto = input.nextLine();
        System.out.print("Digite o preço do produto: ");
        precoUnitario = input.nextDouble();
        System.out.print("Digite a quantidade de produtod: ");
        quantidadeProduto= input.nextInt();
        Produto produto = new Produto(nomeProduto,precoUnitario,quantidadeProduto);

        System.out.println(produto);

        input.close();
    }
}