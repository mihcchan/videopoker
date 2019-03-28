public class Creditos {
/*
    - Começa fixo com 200 créditos
    - Aposta um certo número de créditos, maior que zero e menor ou igual ao número de créditos que já possui.
    - Recebe os premios em creditos de acordo com as combinações
    - Criar os creditos - 200
    - Ficha
    - Aposta
    - set aposta
    - get ficha
    - metodo pontuações - ordena as cartas
        - Dois pares Valor da aposta
        - Trinca 2 X valor da aposta
        - Straight (5 cartas seguidas de naipes diferentes) 5 X valor da aposta
        - Flush (5 cartas do mesmo naipe não seguidas) 10 X valor da aposta
        - Full hand (uma trinca e um par) 20 X valor da aposta
        - Quadra 50 X valor da aposta
        - Straight Flush (5 cartas seguidas do mesmo naipe) (straight + fush ao mesmo tempo)  100 X valor da aposta
        - Royal Straight Flush (5 cartas seguidas do mesmo naipe de 10 até o As) (straight flush de 10 a as) 200 X valor da aposta
    -
    -
*/

	
	public int saldo,aposta;
	
	/**
	 * Metodo construtor padrão
	 * Seta saldo de 200 créditos e aposta como 0
	 */
	public Creditos(){
		this.saldo = 200;
		this.aposta = 0;
	}

	/**
	 * Construtor que permite setar saldo de créditos inicial
	 * @param n saldo de créditos desejado para começar o jogo
	 */
	public Creditos(int n){
		this.saldo = n;
		this.aposta = 0;
	}
	
	/**
	 * Permite setar o valor da aposta da rodada
	 * @param n valor de créditos que serão apostados
	 */
	public void setAposta(int n){
		this.aposta = n;
		this.saldo = this.saldo - this.aposta;
	}
	
	/**
	 * Permite obter o valor do saldo atual
	 * @return valor saldo atual
	 */
	public int getSaldo(){
		return this.saldo;
	}
	
	/**
	 * testa cada combinação de pontuação e com base na combinação obtida
	 * atualiza o saldo de créditos.
	 * Possível pontuação
     *   - Dois pares Valor da aposta
     *   - Trinca 2 X valor da aposta
     *   - Straight (5 cartas seguidas de naipes diferentes) 5 X valor da aposta
     *   - Flush (5 cartas do mesmo naipe não seguidas) 10 X valor da aposta
     *   - Full hand (uma trinca e um par) 20 X valor da aposta
     *   - Quadra 50 X valor da aposta
     *   - Straight Flush (5 cartas seguidas do mesmo naipe) (straight + fush ao mesmo tempo)  100 X valor da aposta
     *   - Royal Straight Flush (5 cartas seguidas do mesmo naipe de 10 até o As) (straight flush de 10 a as) 200 X valor da aposta
	 * @param cartas recebe a mão de cartas do jogador
	 */
	/*public void pontuacao( int []cartas){
		int cartasNum[] = new int[13];
		*//*Vetor de cartas:
		 * Posição     Valor
		 * 0 			2
		 * 1 			3
		 * 2			4
		 * 3			5
		 * 4			6
		 * 5			7
		 * 6			8
		 * 7			9
		 * 8			10
		 * 9			J
		 * 10			Q
		 * 11			K
		 * 12			A
		*//*
		
		int cartasNaipe[] = new int[3];
		
		*//*
		 * Vetor de naipes:
		 * Posição     Naipe
		 * 0			?
		 * 1			?
		 * 2			?
		 * 3			?
		 *//*
		
		//Guarda o valor das cartas na posição do vetor
		for(int i=0;i<13;i++){
			//cartasNum[cartas.numeros[i]]++;
		}
		
		for(int i=0;i<3;i++){
			//cartasNaipe[cartas.naipe[i]]++;
		}
		
		boolean sequenciaAlta=false,sequencia = false,quadra = false,trinca = false, par = false;
		int indicePar;
		//Testa se tem sequencia de cartas do numero 10 a A
		if(cartasNum[8] == 1 && cartasNum[9] == 1 && cartasNum[10] == 1 && cartasNum[11] == 1 && cartasNum[12] == 1){
			sequenciaAlta = true;
		} else{
			// Cada if testa sequencia do numero correspondente e mais 5
			//Testa se tem sequencia de cartas no jogo, só testa até o número 6 (posição 3) pois sabe-se que não tem sequencia do 10 pra frente
			for(int i = 0;i<4;i++){
				if(cartasNum[i] == 1 && cartasNum[i+1] == 1 && cartasNum[i+2] == 1 && cartasNum[i+3] == 1 && cartasNum[i+4] == 1 ){
					sequencia = true;
				}
			}
		}
		
		//Testa a quadra
		for(int i = 0;i<13;i++){
		    if(cartasNum[i] == 4){
		        quadra = true;
		    } else if(cartasNum[i] == 3){
		        trinca = true;
		    } else if(cartasNum[i] == 2){
		        par = true;
		        indicePar = i;
		    }
		}
		
		boolean mesmoNaipe = false;
		//Testa se as 5 cartas sao do mesmo naipe
		for(int i= 0;i<3;i++){
			if(cartasNaipe[i] == 5){
				mesmoNaipe = true;
				break;
			}
		}
		
		
		if(sequenciaAlta && mesmoNaipe){
		    //royal straight flush
		    this.saldo = this.saldo + (200*this.aposta);
		}else if(sequencia && mesmoNaipe){
		    //straight flush
		    this.saldo = this.saldo + (100*this.aposta);
		} else if(quadra){
		    //Quadra
		    this.saldo = this.saldo + (50*this.aposta);
		} else if( trinca && par){
		    //Full hand
		    this.saldo = this.saldo + (20*this.aposta);
		} else if(mesmoNaipe){
		    //flush
		    this.saldo = this.saldo + (10*this.aposta);
		} else if(sequencia){
		    //straight
		     this.saldo = this.saldo + (5*this.aposta);
		} else if(trinca){
		    //trinca
		    this.saldo = this.saldo + (2*this.aposta);
		} else if(par){
		    boolean parDois = false;
		    for(int i=0;i<13;i++){
		        if(cartasNum[i] == 4 && i!=indicePar){
		            parDois = true;
		            break;
		        }
		    }
		    if(parDois){
		        //Dois par
		        this.saldo = this.saldo + this.aposta;
		    }
		}
	}	*/
	

}