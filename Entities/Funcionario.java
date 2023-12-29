package Entities;

public class Funcionario {

    public String nome;
    public double salario;
    public double valorTaxa = 1000;


    public double Liquido(){
        return salario - valorTaxa;
    }
    public void aumentarSalario(double porcentual){
        salario *= (1+(porcentual/100));
    }
    public String toString(){
        return ("Funcionario " + nome + " ganha: R$ " + String.format("%.2f", salario));
    }
}
