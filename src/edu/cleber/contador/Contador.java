package edu.cleber.contador;

import java.util.Locale;
import java.util.Scanner;

import edu.cleber.contador.exceptions.ParametrosInvalidosException;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o primeiro número:");
    int parametroUm = terminal.nextInt();

    System.out.println("Digite o segundo número:");
    int parametroDois = terminal.nextInt();

    terminal.close();

    try {
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException _exception) {
      System.err.println("\nO segundo parâmetro deve ser maior que o primeiro!");
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;

    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
