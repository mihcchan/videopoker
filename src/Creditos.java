public class Creditos {
/*
    - Come�a fixo com 200 cr�ditos
    - Aposta um certo n�mero de cr�ditos, maior que zero e menor ou igual ao n�mero de cr�ditos que j� possui.
    - Recebe os premios em creditos de acordo com as combina��es
    - Criar os creditos - 200
    - Ficha
    - Aposta
    - set aposta
    - get ficha
    - metodo pontua��es - ordena as cartas
        - Dois pares Valor da aposta
        - Trinca 2 X valor da aposta
        - Straight (5 cartas seguidas de naipes diferentes) 5 X valor da aposta
        - Flush (5 cartas do mesmo naipe n�o seguidas) 10 X valor da aposta
        - Full hand (uma trinca e um par) 20 X valor da aposta
        - Quadra 50 X valor da aposta
        - Straight Flush (5 cartas seguidas do mesmo naipe) (straight + fush ao mesmo tempo)  100 X valor da aposta
        - Royal Straight Flush (5 cartas seguidas do mesmo naipe de 10 at� o As) (straight flush de 10 a as) 200 X valor da aposta
    -
    -
*/


    public int saldo,aposta;

    /**
     * Metodo construtor padr�o
     * Seta saldo de 200 cr�ditos e aposta como 0
     */
    public Creditos(){
        this.saldo = 200;
        this.aposta = 0;
    }

    /**
     * Construtor que permite setar saldo de cr�ditos inicial
     * @param n saldo de cr�ditos desejado para come�ar o jogo
     */
    public Creditos(int n){
        this.saldo = n;
        this.aposta = 0;
    }

    /**
     * Permite setar o valor da aposta da rodada
     * @param n valor de cr�ditos que ser�o apostados
     */
    public void setAposta(int n){
        this.aposta = n;
    }

    /**
     * Permite obter o valor do saldo atual
     * @return valor saldo atual
     */
    public int getSaldo(){
        return this.saldo;
    }

    /**
     * testa cada combina��o de pontua��o e com base na combina��o obtida
     * atualiza o saldo de cr�ditos.
     * Poss�vel pontua��o
     *   - Dois pares Valor da aposta
     *   - Trinca 2 X valor da aposta
     *   - Straight (5 cartas seguidas de naipes diferentes) 5 X valor da aposta
     *   - Flush (5 cartas do mesmo naipe n�o seguidas) 10 X valor da aposta
     *   - Full hand (uma trinca e um par) 20 X valor da aposta
     *   - Quadra 50 X valor da aposta
     *   - Straight Flush (5 cartas seguidas do mesmo naipe) (straight + fush ao mesmo tempo)  100 X valor da aposta
     *   - Royal Straight Flush (5 cartas seguidas do mesmo naipe de 10 at� o As) (straight flush de 10 a as) 200 X valor da aposta
     * @param cartas recebe a m�o de cartas do jogador
     */
    public void pontuacao( int []cartas){

    }


}
