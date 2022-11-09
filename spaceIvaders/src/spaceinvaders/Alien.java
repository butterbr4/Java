package spaceinvaders;

/**
 * 
 * @author Mateus Santos Messias
 */
public class Alien extends ElementosDoSistema {
    private int spriteAlien;//"m"
    /**
     * 
     * @param x
     * @param y
     */
    //CONSTRUTOR
    Alien(int x, int y){
        super(x, y, 1);
        spriteAlien = 1;
    }
    /**
     * 
     * @return
     */
    //RETORNA O SPRITE DO ALIEN
    public int getSpriteAlien() {
        return spriteAlien;
    }
    /**
     * 
     * @param spriteAlien
     */
    //"SETA" O SPRITE DO ALIEN
    public void setSpriteAlien(int spriteAlien) {
        this.spriteAlien = spriteAlien;
    }
}