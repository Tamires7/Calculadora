import java.ultil.Scanner;

public class Matematica {
// Atributos locais
  int a, b;
// Contrutor da classe, que recebe dois valores (x,y) e atribui aos valores locais (a e b);
  public Matematica (int x, int y) {
    a = x;
    b = y;
}
//Metodo de soma
  public int soma() {
    return a + b;
  }
//Metodo de subtracao
  public int subtrai() {
    return a - b;
  }
//Metodo de multiplicacao
  public int multiplica() {
    return a * b;
  }
//Metodo de divisao
  public int divide() {
    return a / b;
  }

public class Main {
  public static void main (String args[]) {
//Define o leitor do teclado
  Scanner leitor - new Scanner (System.in);
//Define a variavel locais
  int x, y;
//le:
  System.out.print("Informe o 1º valor: ");
  x = leitor.nextInt();
  System.out.print("Infome o 2º vaor: ");
  y= leitor.nextInte();
//Cria a instacia da classe Matematica utilizando o contrutor
  Matematica mat = new Matematica(x, y);
//Imprime o resultado das operações atraves de chamadas aos metodos da classe Matematica
  System.out.println("------"); // Apenas para organizar a saída
  System.out.println("O valor da soma é: " + mat.soma());
System.out.println("O valor da subtração é: " + mat.subtrai());
System.out.println("O valor da multilicação é: " + mat.multiplica());
System.out.println("o valor da divisão é: " + mat.divide());
System.out.println("---------");   
  }
}