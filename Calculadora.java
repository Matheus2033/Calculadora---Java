import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Calculadora");

    System.out.print("Digite o primeiro numero: ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo numero: ");
    double num2 = scanner.nextDouble();

    System.out.println("Escolhas as operações +-*/");
    char operador = scanner.next().charAt(0);

    double resultado;

    switch(operador){
        case '+':
        resultado = num1+num2; break;

        case '-':
        resultado = num1-num2; break;

        case '*':
        resultado = num1*num2; break;

        case '/':
        if (num2 != 0){
            resultado = num1/num2;
         } else { 
         System.out.println("Erro divisão por zero");
         return;

         }
         break;
         default:
            System.out.println("Operação Inválida");
            return;
       
         }
         System.out.println("Resultado:" + resultado);
         scanner.close();
    
    }
}