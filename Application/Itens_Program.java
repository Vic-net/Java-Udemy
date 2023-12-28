package Application;

import Entities.Itens;

import java.util.Locale;
import java.util.Scanner;

public class Itens_Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Itens produtos = new Itens();
        System.out.println("Dados do Produto");

        System.out.print("Nome do Produto: ");
        produtos.nome = sc.nextLine();

        System.out.print("Valor do Produto (R$): ");
        produtos.valor = sc.nextDouble();

        System.out.print("Quantidade do Produto: ");
        produtos.quantidade = sc.nextInt();

        System.out.println("");
        System.out.println("Dados atualizados:" + produtos);

        System.out.println("");
        System.out.print("Digite a quantidade de Produtos que serão adicionados: ");
        int quantidade = sc.nextInt();
        produtos.addItens(quantidade);

        System.out.println("");
        System.out.println("Dados atualizados:" + produtos);

        System.out.println("");
        System.out.print("Digite a quantidade de Produtos que serão removidos: ");
        quantidade = sc.nextInt();
        produtos.removerItens(quantidade);

        System.out.println("");
        System.out.println("Dados atualizados:" + produtos);
        sc.close();
    }
}
