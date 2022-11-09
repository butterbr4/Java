package spaceinvaders;

public class EngineDeFuncionamento {
    //MOVE O CANHAO
    public static void mover(Canhao canhao, int x) {
        if ((canhao.getCoordenadaX() > 0) && (canhao.getCoordenadaX() < 49)){
            int coordenada = canhao.getCoordenadaX() + x;
            canhao.setCoordenada(coordenada, 15);
        }
    }

    //MOVE OS ALIENS
    public static void mover(Aliens aliens) {
        int x = aliens.getCoordenadaX();
        int y = aliens.getCoordenadaY();
        
        //MOVE PARA A DIREITA SE A COORDENADA DOS ALIENS NO EIXO Y FOR PAR, E NAO CHEGARAM NA MAIOR COORDENADA X
        if (((y % 2) == 0) && (49 > aliens.alienMaisDireita())){ 
            x++;
            aliens.setCoordenada(x, y);
        }
        else{ //ALIENS ESTAO EM UMA COORDENADA Y IMPAR OU CHEGARAM NA MAIOR COORDENADA X
            if(0 > -(aliens.alienMaisEsquerda()) && ((y % 2) != 0)){ //MOVE PARA ESQUERDA SE FOR COORDENADA IMPAR, E NAO CHEGOU NA MENOR COORDENADA X
                x--;
                aliens.setCoordenada(x,y);
            }
            //ALIENS ESTAO NA MAIOR OU NA MENOR COORDENADA X
            else if (aliens.alienMaisBaixo() < 14){ //MOVE PARA BAIXO SE O ALIEN MAIS A BAIXO NAO CHEGOU NA MAIOR COORDENADA Y
                y++;
                aliens.setCoordenada(x,y);
            }
            //O ALIEN MAIS A BAIXO CHEGOU NA MAIOR COORDENADA Y
        }
    }
}

//💥
//⚡
