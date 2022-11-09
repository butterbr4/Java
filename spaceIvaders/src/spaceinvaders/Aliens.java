package spaceinvaders;

public class Aliens extends ElementosDoSistema{
    private Alien [][] aliens = new Alien[5][11]; //5x11 
    private float velocidade = 1;

    //CONSTRUTOR
    Aliens(){
        //INICIA OS ALIENS NO CANTO SUPERIOR ESQUERDO
        super(0, 0, 55);
        for (int linha = 0; linha < 5; linha++) {
            int u=0; 
            for (int coluna = 0; coluna < 11; coluna++) {
                aliens[linha][coluna] = new Alien(u, linha);
                u += 2;
            }
        }
        //A COORDENADA DO PRIMEIRO ALIEN E A COODENADA DO CONJUNTO DE ALIENS
    }
    
    //RETORNA A SOMA DAS VIDAS DOS ALIENS
    @Override
    public int getVida() {
        int vida = 0;
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 11; coluna++) {
                vida += aliens[linha][coluna].getVida();
            }
        }
        super.setVida(vida);
        return vida;
    }

    //RETORNA A VELOCIDADE
    public float getVelocidade() { 
        if(getVida() == 1)
            velocidade = 2;
        return velocidade;
    }

    //COLOCA A COORDENADA DA MATRIZ E RECALCULA A COORDENADA DE CADA ALIEN
    @Override
    public void setCoordenada(int x, int y) { 
        for (int linha = 0; linha < 5; linha++) {
            int u = 0;
            for (int coluna = 0; coluna < 11; coluna++) {
                aliens[linha][coluna].setCoordenada(x + u, y + linha);
                u += 2;
            }
        }
        //A COORDENADA DO PRIMEIRO ALIEN CORRESPONDA A COORDENADA DO CONJUNTO DE ALIENS
        super.setCoordenada(aliens[0][0].getCoordenadaX(), aliens[0][0].getCoordenadaY());
    }

    //RETORNA UM ALIEN TENDO COMO BASE SUA COORDENADA
    public Alien getAlien(int x, int y) {
        Alien erro = new Alien(-1, -1); //ALIEN ERRO
        erro.setSpriteAlien(-1);

        //PROCURA UM ALIEN COM COORDENADAS (X,Y) NA MATRIZ "aliens" E RETORNA O ALIEN
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 11; coluna++) {
                if((aliens[linha][coluna].getCoordenadaX() == x) && (aliens[linha][coluna].getCoordenadaY() == y))
                    return aliens[linha][coluna];
            }
        } 
        return erro; //RETORNA UM ALIEN ERRO SE NAO ENCONTROU O ALIEN
    }

    //PROCURA O ALIEN MAIS A DIREITA E RETORNA SUA COORDENADA X
    public int alienMaisDireita(){
        for (int coluna = 10; coluna > 0; coluna--) {
            for (int linha = 0; linha < 5; linha++) {
                if(aliens[linha][coluna].getSpriteAlien() == 1)
                    return aliens[linha][coluna].getCoordenadaX();
            }
        }
        return -1; //ERRO, NAO ENCONTROU NENHUM ALIEN
    }

    //PROCURA O ALIEN MAIS A ESQUERDA E RETORNA SUA COORDENADA X
    public int alienMaisEsquerda(){
        for (int coluna = 0; coluna < 11; coluna++) {
            for (int linha = 0; linha < 5; linha++) {
                if(aliens[linha][coluna].getSpriteAlien() == 1)
                    return aliens[linha][coluna].getCoordenadaX();
            }
        }
        return -1; //ERRO, NAO ENCONTROU NENHUM ALIEN
    }

    //PROCURA O ALIEN MAIS A BAIXO E RETORNA SUA COORDENADA Y
    public int alienMaisBaixo(){
        for (int linha = 4; linha > 0; linha--) {
            for (int coluna = 0; coluna < 11; coluna++) {
                if(aliens[linha][coluna].getSpriteAlien() == 1)
                    return aliens[linha][coluna].getCoordenadaY();
            }
        }
        return -1; //ERRO, NAO ENCONTROU NENHUM ALIEN
    }
}
