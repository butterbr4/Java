package spaceinvaders;

public class ElementosDoSistema {
    private int x, y = 0; //coordenada dos elementos
    private int vida;
    
    //CONSTRUTOR
    ElementosDoSistema(int x, int y, int vida){
        this.x = x;
        this.y = y;
        this.vida = vida;
    }
    
    //"SETA" UMA COORDENADA
    public void setCoordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //RETORNA COORDENADA X
    public int getCoordenadaX() {
        return x;
    }

    //RETORNA COORDENADA Y
    public int getCoordenadaY() {
        return y;
    }

    //RETORNA VIDA
    public int getVida() {
        return vida;
    }

    //"SETA" A VIDA
    public void setVida(int vida) {
        this.vida = vida;
    }
}
