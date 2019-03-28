import java.util.Arrays;

public class VideoPoker {

    public static void main(java.lang.String[] args) throws java.io.IOException, InterruptedException {

        Baralho baralho = new Baralho();


        System.out.println("Pressione enter para começar a rodada.");
        EntradaTeclado.leString();

        baralho.sortear();
        System.out.println(baralho.toString());


        System.out.println("Insira as cartas que quer descartar separadas por espaço. (segunda vez)");
        String segundaVez = EntradaTeclado.leString();
        try{
            baralho.sortear(segundaVez);
            System.out.println(baralho.toString());
        } catch (NumberFormatException e) {
            System.out.println(baralho.toString());
        }

        System.out.println("Insira as cartas que quer descartar separadas por espaço. (terceira vez)");
        String terceiraVez = EntradaTeclado.leString();
        try {
            baralho.sortear(terceiraVez);
            System.out.println(baralho.toString());
        } catch (NumberFormatException e) {
            System.out.println(baralho.toString());
        }


    }

}
/*


    - Começa o jogo com 200 creditos
    - Jogador aposta um certo número de creditos
    - Recebe 5 cartas
    - Escolhe quais quer trocar
    - Ecolhe mais uma vez quais quer trocar
    - Verfica se o jogador recebeu algum prêmio/qual
    - repete
    - Quando termina: quando credito a 0 ou quando o usuario quiser.



*/

