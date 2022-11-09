package spaceinvaders;

public class Barreira extends ElementosDoSistema{
    private Brick [][] barreira = new Brick[2][6]; 

    //CONSTRUTOR
    Barreira(int x){
        //INICIA A BARREIRA COM COORDENADAS x,y
        super(x, 13, 12); 
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                barreira[linha][coluna] = new Brick(coluna + x, (linha + 13));
            }
        }
        //A COORDENADA DO PRIMEIRO BLOCO CORRESPONDE A COORDENADA DA BARREIRA 
    }
    
    //RETORNA A VIDA DA BARREIRA
    @Override
    public int getVida() {
        int vida = 0;
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                vida += barreira[linha][coluna].getVida();
            }
        }
        super.setVida(vida);
        return vida;
    }

    //RETORNA UM BLOCO TENDO COMO BASE SUA COORDENADA
    public Brick getBrick(int x, int y) {
        Brick erro = new Brick(-1, -1); //BLOCO ERRO
        erro.setSpriteBrick(-1);

        //PROCURA UM BLOCO COM COORDENADAS (X,Y) NA MATRIZ "barreira" E RETORNA O BLOCO
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                if((barreira[linha][coluna].getCoordenadaX() == x) && (barreira[linha][coluna].getCoordenadaY() == y))
                return barreira[linha][coluna];
            }
        } 
        return erro; //RETORNA UM BLOCO ERRO SE NAO ENCONTROU O BLOCO
    }
}
