package Application;

import Entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Estudante_Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Notas e situação do Aluno");
        System.out.print("Informe seu Nome: ");
        estudante.nome = sc.nextLine();
        System.out.print("Nota do 1º Trimestre: ");
        estudante.nota_1ºTRI = sc.nextDouble();
        System.out.print("Nota do 2º Trimestre: ");
        estudante.nota_2ºTRI = sc.nextDouble();
        System.out.print("Nota do 3º Trimestre: ");
        estudante.nota_3ºTRI = sc.nextDouble();

        System.out.println("");
        System.out.print(estudante);
        System.out.println("");

        if(estudante.mediaAluno()<estudante.notaCorte){
            System.out.println("Reprovado");
            System.out.println("Você precisa de mais " + estudante.notaNecessaria() + " pontos para massar");
        }
        else if (estudante.mediaAluno()>= estudante.mediaAluno()){
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
