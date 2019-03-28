import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Baralho {

    private String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] naipes = {"♥", "♦", "♣", "♠"};
    private ArrayList<Carta> cartasJaTiradas = new ArrayList<>();
    private Carta[] cartasDaMao;


    public Baralho() {
        Carta[] helperCarta = new Carta[5];
        for (int i = 0; i < 5; i++) {
            helperCarta[i] = new Carta();
        }
        this.cartasDaMao = helperCarta;
    }


    public Carta[] sortear() throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            this.cartasDaMao[i].sortearNovaCarta();
            while (this.cartasJaTiradas.contains(this.cartasDaMao[i])) {
                this.cartasDaMao[i].sortearNovaCarta();
            }
            this.cartasJaTiradas.add(this.cartasDaMao[i]);
        }
        return this.cartasDaMao;
    }


    public Carta[] sortear(boolean[] quais) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            if (quais[i] == true) {
                this.cartasDaMao[i].sortearNovaCarta();
                while (this.cartasJaTiradas.contains(this.cartasDaMao[i])) {
                    this.cartasDaMao[i].sortearNovaCarta();
                }
            }
            /*cartasJaTiradas.add(cartasDaMao[i]);*/
        }
        return this.cartasDaMao;

    }

    public Carta[] sortear(java.lang.String s) throws InterruptedException {


        boolean[] quais = new boolean[5];
        Arrays.fill(quais, Boolean.FALSE);

        String[] separado = s.split(" ");

        int tamanho = separado.length;

        for (int i = 0; i < tamanho; i++) {
            int pos = Integer.valueOf(separado[i]) - 1;
            quais[pos] = true;
        }

        return this.sortear(quais);
    }


    public String[] getNumerosCartas(Carta[] cartasDaMao){

        String[] numerosCarta = new String[5];
        for (int i=0; i<5;  i++) {
            numerosCarta[i] = numeros[cartasDaMao[i].getNumero()];
        }
        return numerosCarta;
    }

    public String[] getNaipesCartas(Carta[] cartasDaMao){

        String[] naipesCarta = new String[5];
        for (int i=0; i<5; i++){
            naipesCarta[i] = naipes[cartasDaMao[i].getNaipe()];
        }
        return naipesCarta;
    }

    @Override
    public String toString() {
        return "Baralho{" +
                "cartasJaTiradas=" + cartasJaTiradas +
                ", cartasDaMao=" + Arrays.toString(cartasDaMao)+
                '}';
    }
}


/*
    List<Carta> cartasJaTiradas = new ArrayList<Carta>;
    cartasJaTiradas.add()
*/
/*
    - Criar baralho com cartas diferentes a partir da classe carta
    - Dar 5 cartas
    - Trocar de 0 a 5 cartas
    - não pode repetir as cartas até acabar a rodada


    - construtor - cria 5 cartas
    - troca carta (escolhe a carta pra trocar, não pode repetir)

    - toString pra imprimir o baralho


*/


