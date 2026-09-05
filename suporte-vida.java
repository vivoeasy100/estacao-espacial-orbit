```java
public class SuporteVida {

    public static void monitorarAmbiente(double oxigenio, double temperatura) {

        System.out.println("=== Monitoramento do Suporte de Vida ===");
        System.out.println("Nível de oxigênio: " + oxigenio + "%");
        System.out.println("Temperatura: " + temperatura + "°C");

        if (oxigenio < 19.5) {
            System.out.println("ALERTA: Nível de oxigênio abaixo do recomendado!");
        } else if (oxigenio > 23.5) {
            System.out.println("ALERTA: Nível de oxigênio acima do recomendado!");
        } else {
            System.out.println("Oxigênio: nível normal.");
        }

        if (temperatura < 18) {
            System.out.println("ALERTA: Temperatura abaixo do recomendado!");
        } else if (temperatura > 27) {
            System.out.println("ALERTA: Temperatura acima do recomendado!");
        } else {
            System.out.println("Temperatura: nível normal.");
        }

        System.out.println("========================================");
    }

    public static void main(String[] args) {

        double oxigenio = 21.0;
        double temperatura = 22.0;

        monitorarAmbiente(oxigenio, temperatura);
    }
}
```
