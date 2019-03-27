
public class Carta {

    private int numero, naipe;

    public Carta(){

    }

    public Carta sortearNovaCarta(){
        Carta carta = new Carta();
        /*Random random = new Random();
        this.numero = random.getIntRand(13) - 1;*/
        this.numero = carta.sortearNumero();
       /* Random random2 = new Random();
        this.naipe = random2.getIntRand(4) -1;*/
       this.naipe = carta.sortearNaipe();
        return carta;
    }


    public int sortearNumero(){
        Random random = new Random();
        this.numero = random.getIntRand(13);
        return this.numero;
    }

    public int sortearNaipe(){
        Random random2 = new Random();
        this.naipe = random2.getIntRand(4);
        return naipe;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getNaipe(){
        return this.naipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Carta carta = (Carta) o;
        return this.numero == carta.numero &&
                this.naipe == carta.naipe;
    }

/*
    - sortear um numero
    - sortear um naipe
    - cada carta vai ter um numero e um naipe


    - aletorio numero
    - aleatorio naipe
    - construtor carta (gera numero e carta)

    - nova carta aleatoria - aleatorio numero + aleatório naipe
    - get numero
    - get naipe

*/


}
