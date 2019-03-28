import java.io.IOException;

/**
 * Classe VideoPoker que contém apenas o método main para executar o jogo.
 * 
 * @author Michelle Schmitt Gmurczyk - 9424315
 * @author Ana Clara Amorim Andrade - 10691992
 *
 */
public class VideoPoker{

    /**
     * Método main responsável pela execução do jogo. e possui um laço, no qual cada iteração representa uma rodada do jogo.
     * Em cada rodada, o jogador define sua aposta e pode, até 3 vezes, descartar entre 0 e 5 cartas da mão e tirar novas do baralho.
     * Após cada rodada a combinação de cartas é verificada e seus créditos atualizados.
     * O jogo termina se o jogador ficar sem créditos para apostar ou se ele quiser (apostando 0).
     * No final das rodadas a quatidade de créditos acumulados é exibida.
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(java.lang.String[] args) throws java.io.IOException, InterruptedException {

        Baralho baralho = new Baralho();
        Creditos saldo = new Creditos();
        int[] numeroCartas;
        int[] naipesCartas;
        
        int aposta, saldoAnterior;
        
        System.out.println("------------ Video Poker -------------");
        System.out.println(" Para sair da partida basta apostar 0. ");
        System.out.println("Pressione enter para começar a partida.");
        EntradaTeclado.leString();
        
        while(saldo.getSaldo()>0){
            System.out.println("Saldo atual: " + saldo.getSaldo());
            saldoAnterior = saldo.getSaldo();
            System.out.print("\n");
            System.out.println("Pressione enter para começar a rodada.");
            EntradaTeclado.leString();
            System.out.println("Aposta: ");
            aposta = EntradaTeclado.leInt();
            saldo.setAposta(aposta);
            if(aposta == 0 ){
                break;
            }else if(aposta > saldoAnterior){
                 System.out.println("Valor da aposta maior que o valor do saldo");
            }else{
                baralho.sortear();
                System.out.println(baralho.toString());
                
                System.out.println("Insira as cartas que quer descartar separadas por espaço.");
                String segundaVez = EntradaTeclado.leString();
                try{
                    baralho.sortear(segundaVez);
                    System.out.println(baralho.toString());
                } catch (NumberFormatException e) {
                    System.out.println(baralho.toString());
                }
                
                System.out.println("Insira as cartas que quer descartar separadas por espaço.");
                String terceiraVez = EntradaTeclado.leString();
                try {
                    baralho.sortear(terceiraVez);
                    System.out.println(baralho.toString());
                } catch (NumberFormatException e) {
                    System.out.println(baralho.toString());
                }
                
                
                numeroCartas = baralho.getNumerosCartas();
                naipesCartas = baralho.getNaipesCartas();
                System.out.print("\n");
                System.out.println(saldo.pontuacao(numeroCartas,naipesCartas));
                baralho.resetaCartasJáTiradas();
            }
        }
    }

}

