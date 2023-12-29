package Entities;

public class Estudante {
    public String nome;
    public double nota_1ºTRI;
    public double nota_2ºTRI;
    public double nota_3ºTRI;
    public double notaCorte = 60.0;

    public double mediaAluno(){
        return (nota_1ºTRI+nota_2ºTRI+nota_3ºTRI)/3;
    }
    public double notaNecessaria(){
        return notaCorte-mediaAluno();
    }
    public String toString(){
      return ("Nota Final: " + String.format("%.2f", mediaAluno()));
    }
}
