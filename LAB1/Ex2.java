package LAB1;
import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

 class MediaAritmetica {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto da classe Scanner para leitura do teclado

        // Lê três números do usuário
        double num1 = lerNumero(sc, 1);
        double num2 = lerNumero(sc, 2);
        double num3 = lerNumero(sc, 3);

        // Calcula a média aritmética dos números lidos
        double media = calcularMedia(num1, num2, num3);

        // Exibe a média aritmética ao usuário
        System.out.printf("A média aritmética é: %.2f", media);
        
        sc.close(); // Fecha o objeto Scanner
    }

    // Função que lê os números informados pelo usuário
    public static double lerNumero(Scanner sc, int ordem) {
        double num;

        do {
            System.out.printf("Digite o %dº número: ", ordem);
            num = sc.nextDouble();
        }while(num<3);


        return num;
    }

    // Função que calcula a média aritmética de três números
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}

