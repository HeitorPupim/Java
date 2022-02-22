import java.util.Locale;
public class Main {
    public static void main(String[] args){

        System.out.print("Olá, mundo!"); // não da quebra de linha no final
        System.out.println("Bom Dia!"); // dá uma quebra de linha no final
        
        int y = 32; 
        double x = 10.3514;

        System.out.println(y); //imprime Y
        System.out.println(x); //imprime o x
        //printf = print formatado. Por padrão pega o idioma do Pc, dai imprime com virgula as vezes

        System.out.printf("%.2f%n", x); //2 casas decimais
        System.out.printf("%.4f%n", x); //4 casas decimais
        //%n é uma quebra de linha

        //Configura a localizacão do programa:
        Locale.setDefault(Locale.US);    

        // concatenar vários elementos em um comando de escrita com println
        System.out.println("Resultado = " + x + " Metros");

        //concatenar vários elementos no comando de escrita com printf
        System.out.printf("Resultado = %.2f metros %n", x);

        //concatenar vários elementos em um msm tipo de escrita:
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);

    }
}