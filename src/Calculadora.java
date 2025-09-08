import java.util.Scanner;

public class Calculadora {

    double grauCelsius;
    double grauFahrenheit;
    double grauKelvin;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Pronto para calcular, vamos lá");
        System.out.println("Digite a temperatura em Celsius (Digite sem o marcador ordinal):");
        grauCelsius = leitor.nextDouble();

        calcularDados();
    }
    public void calcularDados(){
        grauFahrenheit = (grauCelsius * 1.8) + 32;
        grauKelvin = grauCelsius + 273.15;

        exibirResultados();
    }
    public void exibirResultados(){
        String fahrenheitDecimal = String.format("%.2f", grauFahrenheit);

        System.out.println("**********************************");
        System.out.println("Graus Celsius: " + grauCelsius + "ºC.");
        System.out.println("Resultado em graus Fahrenheit: " + fahrenheitDecimal + "ºF.");
        System.out.println("Resultado em graus Kelvin: " + grauKelvin + "ºK.");
        System.out.println("**********************************");

    }


}
