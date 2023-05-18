package LAB1;
import java.util.Scanner; // importa a classe Scanner para ler entrada do usuário

public class  NPRIMO  { // declaração da classe
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Digite um número inteiro: "); // solicita ao usuário que digite um número
        int num = sc.nextInt();// lê o número digitado pelo usuário

        boolean primo = true; // inicializa a variável booleana primo como true
        
            if (num <= 1){ // se o número digitado for menor ou igual a 1, não é primo
                primo = false; // altera o valor da variável primo para false
            }else{ 
                for (int i = 2; i <= num / 2; i++) { // laço de repetição para verificar se o número é primo
                if (num % i == 0) { // se o número for divisível por i = 2 , não é primo
                primo = false; // altera o valor da variável primo para false
               
    
            }
        }

        if (primo) { // se a variável primo for true, o número é primo
            System.out.println(num + " é um número primo."); // exibe a mensagem informando que o número é primo
        } else { // caso contrário, o número não é primo
            System.out.println(num + " não é um número primo."); // exibe a mensagem informando que o número não é primo
        }
    }

     
sc.close();
}
}
