import java.util.Scanner;
import calculadora.Calculadora;

public class Main {
    private static boolean _finish = false;
    private static long _result = 0;

    public static void main(String[] args){

        System.out.println("---------- CALCULADORA ----------");
        Scanner scanner = new Scanner(System.in);

        while(!_finish){

            System.out.println("Insira a operação:\n1. SOMA\n2. SUBTRAÇÃO\n3. MULTIPLICAÇÃO\n4. DIVISÃO\n5. SAIR");
            int operation = scanner.nextInt();

            System.out.print("Insira o primeiro valor:");
            long value1 = scanner.nextLong();
            System.out.print("Insira o segundo valor:");
            long value2 = scanner.nextLong();

            boolean _valid = false;
            switch (operation){
                case 1:
                    _result = Calculadora.soma(value1, value2);
                    _valid = true;
                    break;
                case 2:
                    _result = Calculadora.subtracao(value1, value2);
                    _valid = true;
                    break;
                case 3:
                    _result = Calculadora.multiplicacao(value1, value2);
                    _valid = true;
                    break;
                case 4:
                    _result = Calculadora.divisao(value1, value2);
                    _valid = true;
                    break;
                case 5:
                    _finish = true;
                default:
                    System.out.println("Opção Inválida!");
            }


            if(_valid){
                System.out.printf("O resultado da operação é %d\n", _result);
            }

        }
    }
}