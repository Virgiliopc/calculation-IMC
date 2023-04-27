import javax.swing.*;
import java.text.DecimalFormat;

public class IMC_B {

    public static void main(String[] args) {

        Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso em Kgs: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura em metros: "));

        double imc = peso / (Math.pow(altura, 2));
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("##.00");

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(imc) + "\n Você está abaixo do peso ideal.");
        } else if (imc >= 18.5 && imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(imc) + "\n  Você está no peso ideal.");
        } else if (imc >= 24.9 && imc < 29.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(imc) + "\n Você está levemente acima do peso.");
        } else if (imc >= 30 && imc < 34.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(imc) + "\n Você está com Obesidade grau I");
        } else if (imc >= 35.00 && imc < 39.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(imc) + "\n Você está com obesidade grau II (Severa).");
        } else {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(imc) + "\n Você está com obesidade grau III (Mórbida).");
        }
    }
}
