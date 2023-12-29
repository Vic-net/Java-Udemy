package Application;

import Entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario_Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Dados do Colaborador");
        System.out.print("Informe seu nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Quanto você ganha? ");
        funcionario.salario = sc.nextDouble();

        System.out.println("");
        System.out.println(funcionario);
        System.out.println("");

        System.out.print("Qual o porcentual de aumento? ");
        double porcentual = sc.nextDouble();
        funcionario.aumentarSalario(porcentual);

        System.out.println("");
        System.out.println("Dados atualizados abaixo: \n" + funcionario);
        System.out.println("");

        System.out.print("Deseja continuar? ");
        String escolha = sc.nextLine();
    }
}
