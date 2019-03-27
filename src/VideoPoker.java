import java.util.Arrays;

public class VideoPoker {

    public static void main(java.lang.String[] args) throws java.io.IOException, InterruptedException {

        Baralho cartas = new Baralho();


        System.out.println("Pressione enter para começar a rodada.");
        EntradaTeclado.leString();

        Carta[] cartasMao = new Carta[5];

        cartasMao = cartas.sortear();

        System.out.println(Arrays.toString(cartas.getNumerosCartas(cartasMao)));
        System.out.println(Arrays.toString(cartas.getNaipesCartas(cartasMao)));

        System.out.println("Insira as cartas que quer descartar separadas por espaço. (segunda vez)");
        String segundaVez = EntradaTeclado.leString();
        try{
            cartasMao = cartas.sortear(segundaVez);
            System.out.println(Arrays.toString(cartas.getNumerosCartas(cartasMao)));
            System.out.println(Arrays.toString(cartas.getNaipesCartas(cartasMao)));
        } catch (NumberFormatException e) {
            System.out.println(Arrays.toString(cartas.getNumerosCartas(cartasMao)));
            System.out.println(Arrays.toString(cartas.getNaipesCartas(cartasMao)));
        }

        System.out.println("Insira as cartas que quer descartar separadas por espaço. (terceira vez)");
        String terceiraVez = EntradaTeclado.leString();
        try {
            cartasMao = cartas.sortear(terceiraVez);
            System.out.println(Arrays.toString(cartas.getNumerosCartas(cartasMao)));
            System.out.println(Arrays.toString(cartas.getNaipesCartas(cartasMao)));
        } catch (NumberFormatException e) {
            System.out.println(Arrays.toString(cartas.getNumerosCartas(cartasMao)));
            System.out.println(Arrays.toString(cartas.getNaipesCartas(cartasMao)));
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

