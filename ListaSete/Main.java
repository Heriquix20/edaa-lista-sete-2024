import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    System.out.println("EXERCÍCIO 1 ----------------");

    System.out.println("\nA) ");
    String texto = "ESTE EXERCÍCIO É MUITO FÁCIL.";
    String palavra = "osso";

    Pilha conversor = new Pilha();
  
    System.out.println(conversor.invertePalavras(texto) + "\n");

    System.out.println("B)");

    System.out.println(conversor.verificarPalindromo(palavra) + "\n");

    Stack<Integer> pilha = new Stack<>();
    pilha.push(5);
    pilha.push(2);
    pilha.push(8);
    pilha.push(1);
    pilha.push(3);
    pilha.push(1);
    pilha.push(4);
    pilha.push(1);
    pilha.push(5);
    pilha.push(9);
    pilha.push(2);
    pilha.push(6);
    pilha.push(5);
    pilha.push(3);
    pilha.push(5);


    System.out.println("C)");

    System.out.println("Pilha antes da ordenação: " + pilha);

    conversor.ordenarPilha(pilha);

    System.out.println("Pilha após a ordenação: " + pilha + "\n");

    System.out.println("D) ");


    conversor.menorMaiorMedia(pilha);

    System.out.println("\nEXERCÍCIO 2 ----------------");
  

    conversor.conversaoNumerica();
  }



}