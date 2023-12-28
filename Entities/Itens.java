package Entities;

public class Itens {
    public String nome;
    public double valor;
    public int quantidade;

    public double valorTotalItens(){
         return valor * quantidade;
    }

    public void addItens(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerItens(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return (nome + ", R$ " + String.format("%.2f", valor) + ", quantidade:" + quantidade + ", Valor Total R$: " + String.format("%.2f", valorTotalItens()));
    }
}
