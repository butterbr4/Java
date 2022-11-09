package spaceinvaders;

public class Canhao extends ElementosDoSistema {
    private int spriteCanhao; //"🛰"
    
    //CONSTRUTOR
    Canhao(){
        super(24, 15, 3);
        spriteCanhao = 2;
    }

    //RETORNA O SPRITE DO CANHAO
    public int getSpriteCanhao() { 
        return spriteCanhao;
    }

    //"SETA" O SPRITE DO CANHAO
    public void setSpriteCanhao(int spriteCanhao) {
        this.spriteCanhao = spriteCanhao;
    }
}
