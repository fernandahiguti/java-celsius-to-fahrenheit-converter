import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira a temperatura em graus Celsius para conversão em graus Fahrenheit:");
        double celsiusTemperature = terminal.nextDouble();
        double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;
        // casting practice
        int fahrenheitTemperatureNoDecimals = (int) fahrenheitTemperature;

        String resultMessage = String.format("A temperatura de %.1f Celsius é equivalente a %.2f Fahrenheit ou %d Fahrenheit sem casa decimais", celsiusTemperature, fahrenheitTemperature, fahrenheitTemperatureNoDecimals);

        System.out.println(resultMessage);
    }
}