import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC_Terminal {

    public static void main(String[] args) {

        //objetos
        Scanner leitor = new Scanner(System.in);

        //formatar números decimais
        DecimalFormat formatador = new DecimalFormat("##0.00");
        System.out.println("Cálculo do IMC");

        //peso
        System.out.println("Digite o seu peso em Kgs: ");
        double peso = leitor.nextDouble();

        //altura
        System.out.print("Digite a sua altura em metros: ");
        double altura = leitor.nextDouble();

        //imc
        double imc = peso / (Math.pow(altura, 2));

        //saída
        System.out.println("O seu IMC é: " + formatador.format(imc));
        leitor.close();
        //classificação
        if(imc < 18.5) {
            System.out.println("\n Você está abaixo do peso ideal.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está no peso ideal.");
        } else if (imc >= 24.9 && imc < 29.9) {
            System.out.println("Peso levemente acima");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.00 && imc < 39.9) {
            System.out.println("Você está com obesidade grau II (Severa).");
        } else {
            System.out.println("Você está com obesidade grau III (Mórbida).");
        }
    }
}