// 1 - Pacote
package intro;

// 2 - Referencia as bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Estrutura Condicional

        // Utilizar a classe Scanner do Java para ler a escolha do usuario  no console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" MENU DE OPÇÕES: ");
        System.out.println("C - Calcular Area Modo Curto");
        System.out.println("D - Contar até Dez");
        System.out.println("E - Calcular Area Modo Extenso");
        System.out.println("I - If Simples");
        System.out.println("R - Contagem regressiva de 10 a 0");
        System.out.println("Digite a opção desejada:");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa

        //String opcao = "ifSimples";

        switch (opcao) {
            case "C":
            case "c":
                System.out.println("Você escolheu executar o metodo calcularAreaModoCurto.");
                calcularAreaModoCurto();
                break;
            case "D":
            case "d":
                System.out.println("Você escolheu executar o metodo contarAteDez.");
                contarAteDez();
                break;
            case "E":
            case "e":
                System.out.println("Você escolheu executar o metodo calcularAreaModoExtenso.");
                calcularAreaModoExtenso();
                break;
            case "I":
            case "i":
                System.out.println("Você escolheu executar o método ifSimples.");
                ifSimples();
                break;
            case "R":
            case "r":
                System.out.println("Você escolheu executar o método contegemRegressiva.");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada.");
                break;
        }
    }

    public static void ifSimples() {
        // Estrutura Condicional

        // if
        // else

        String modo = "curto";
        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto() {
        System.out.println("Cálculo de Áreas Modo Curto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m, a área é de " + largura * comprimento + "m2.");
    }

    public static void calcularAreaModoExtenso() {

        System.out.println("Cálculo de Áreas Modo Extenso");

        // Calculo de área - Exemplo o tamaho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m, a área é de " + resultado + "m2.");
    }

    public static void contarAteDez() {

        // Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem Crescente");
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva() {

        System.out.println("Contagem Regressiva");
        for (int numero = 10; numero >-1; numero--) {
            System.out.println(numero);
        }
    }
}