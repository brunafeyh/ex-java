import java.util.Scanner;
public class Exercicios {
    public static void main(String[] args) {
        // Operação de soma
        int nota1 = 10;
        int nota2 = 20;
        double media = (nota1 + nota2) /2; 
        
        int media2 = (int) media;

        // Imprimir o resultado sem aspas
        System.out.println(media2);
        
        
        char letra = 'b';
        String nome = "runa";
        String nome2 = letra + nome;
        
        System.out.println(nome2);
        
        double preco_produto = 4.50;
        int quant = 2;
        
        double precototal = preco_produto * quant;
        
        System.out.println(precototal);
        
        double valor_dolar = 4.94;
        
        double dolar = 20;
        
        double reais = dolar * valor_dolar;
        
        System.out.println(reais);
        
        Scanner leitura = new Scanner(System.in);
        String filme = leitura.nextLine();
        System.out.println(filme);
        
    }
}
