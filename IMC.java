import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        // variáveis
        double peso = 0;
        double altura = 1;
        double imc;

        //objetos
        Scanner informacao = new Scanner(System.in);
        //formatar números decimais
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.println("Cálculo do IMC");
        //entrada
        System.out.print("Digite o seu peso: ");
        peso = informacao.nextDouble();
        System.out.print("Digite a sua altura: ");
        peso = informacao.nextDouble();
        //processamento
        imc = peso / (altura * altura);
        //saída
        System.out.println("IMC: " + formatador.format(imc));
        informacao.close();
        //classificação
        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Peso levemente acima");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.00 && imc <= 39.9) {
            System.out.println("Obesidade grau II - Severa");
        } else {
            System.out.println("Obesidade grau III - Mórbida");
        }
    }
}
