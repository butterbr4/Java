package spaceinvaders;

public class Brick extends ElementosDoSistema {
    private int spriteBlocoBarreira; //"◻"

    //CONSTRUTOR
    Brick(int x, int y){
        super(x, y, 1);
        spriteBlocoBarreira = 3;
    }

    //RETORNA O SPRITE DO BLOCO
    public int getSpriteBrick() {
        return spriteBlocoBarreira;
    }
    
    //"SETA" O SPRITE DO BLOCO
    public void setSpriteBrick(int spriteBlocoBarreira) {
        this.spriteBlocoBarreira = spriteBlocoBarreira;
    }
}
