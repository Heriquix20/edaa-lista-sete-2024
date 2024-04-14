import java.util.Scanner;
import java.util.Stack;
public class Pilha {

  public String invertePalavras(String texto) {
    Stack<Character> pilha = new Stack<>();
    StringBuilder textoInvertido = new StringBuilder();

    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) != ' ' && texto.charAt(i) != '.') {
        pilha.push(texto.charAt(i));
      } else {
        while (!pilha.isEmpty()) {
          textoInvertido.append(pilha.pop());
        }
        textoInvertido.append(texto.charAt(i));
      }
    }
    return textoInvertido.toString();
  }

  public String verificarPalindromo(String palavra) {
    Stack<Character> pilha = new Stack<>();
    StringBuilder palavraInvertida = new StringBuilder();

    for (int i = 0; i < palavra.length(); i++) {
        pilha.push(palavra.charAt(i));
    }
    while (!pilha.isEmpty()) {
        palavraInvertida.append(pilha.pop());
    }
    
    if (palavra.equals(palavraInvertida.toString())) {
        return  palavra + " é um palíndromo";
    } else {
        return  palavra + " não é um palíndromo";
    }
  }

  public Stack<Integer> ordenarPilha(Stack<Integer> pilha) {
    Stack<Integer> pilhaAuxiliar = new Stack<>();

    while (!pilha.isEmpty()) {
        int temp = pilha.pop();

        while (!pilhaAuxiliar.isEmpty() && pilhaAuxiliar.peek() > temp) {
            pilha.push(pilhaAuxiliar.pop());
        }

        pilhaAuxiliar.push(temp);
    }

    while (!pilhaAuxiliar.isEmpty()) {
        pilha.push(pilhaAuxiliar.pop());
    }

    return pilha;
  }

  public String menorMaiorMedia(Stack<Integer> pilha) {
    int maior = pilha.peek();
    int menor = pilha.peek();
    int soma = 0;

    for (int num : pilha) {
      if (num > maior) {
        maior = num;
      }
      if (num < menor) {
        menor = num;
      }
      soma += num;
    }
    double media = (double) soma / pilha.size();
    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Média: " + media);
    return null;
  }

  public String conversaoNumerica() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número:");
    int num = scanner.nextInt();

    System.out.println("Escolha a base para conversão:");
    System.out.println("(a) Decimal para Binário");
    System.out.println("(b) Decimal para Octal");
    System.out.println("(c) Decimal para Hexadecimal");
    String opcao = scanner.next();
    int base;
    switch (opcao) {
        case "a":
            base = 2;
            break;
        case "b":
            base = 8;
            break;
        case "c":
            base = 16;
            break;
        default:
            System.out.println("Opção inválida!");
            scanner.close(); // Feche o scanner aqui
            return "Opção inválida!";
    }

    Stack<Integer> pilha = new Stack<>();
    while (num > 0) {
        pilha.push(num % base);
        num = num / base;
    }

    StringBuilder sb = new StringBuilder();
    while (!pilha.isEmpty()) {
        int digito = pilha.pop();
        if (base == 16 && digito >= 10) {
            sb.append((char) ('A' + (digito - 10)));
        } else {
            sb.append(digito);
        }
    }
    System.out.println("O número convertido é: " + sb.toString());

    scanner.close(); // Feche o scanner aqui também

    return sb.toString();
}
}