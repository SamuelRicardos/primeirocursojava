
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o screen match");
        System.out.println(" Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
//Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);

        double precoOriginal = 5.0;
        double percentualDesconto = 10.0/100.0;
        double DescontoNoPreco = precoOriginal * percentualDesconto;
        double precoComDesconto = precoOriginal - DescontoNoPreco;
        String texto = "O resultado de tudo é:" + precoComDesconto;
        System.out.println(texto);


    }

}