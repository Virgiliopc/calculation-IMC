import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        // variáveis
        float peso;
        float altura = 0;
        float imc;

        //objetos
        Scanner informacao = new Scanner(System.in);
        //formatar números decimais
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.println("Cálculo do IMC");
        //entrada
        System.out.print("Digite o seu peso: ");
        peso = informacao.nextFloat();
        System.out.print("Digite a sua altura: ");
        peso = informacao.nextFloat();
        //processamento
        imc = peso / (altura * altura);
        //saída
        System.out.println("IMC: " + formatador.format(imc));
        informacao.close();
    }
}
