package spaceinvaders;

import java.util.Timer;
import java.util.TimerTask;
/**
 * 
 * @author Mateus Santos Messias
 */
public class Jogo {
    public static void main(String[] args) throws Exception {
        Canhao canhao = new Canhao();
        Aliens aliens = new Aliens();
        Barreira barreira1 = new Barreira(4);
        Barreira barreira2 = new Barreira(16);
        Barreira barreira3 = new Barreira( 28);
        Barreira barreira4 = new Barreira( 40);
        Timer timer = new Timer();
        
        //MOVE OS ALIENS A CADA 0,5 SEGUNDO
        TimerTask moverAliens = new TimerTask() {
            @Override
            public void run() {
                EngineDeFuncionamento.mover(aliens);
            }
        };
        
        //MOVE O CANHAO A CADA 1,5 SEGUNDO
        TimerTask moverCanhao = new TimerTask() {
            @Override
            public void run() {
                    EngineDeFuncionamento.mover(canhao, 1);
                    //EngineDeFuncionamento.mover(canhao, -1);
            }
        };

        //ATUALIZA A TELA A CADA 0,5 SEGUNDO VERIFICANDO SE OS ALIENS CHEGARAM NO FIM
        TimerTask printTela = new TimerTask() {
            @Override
            public void run() {
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
                Tela.printTela(aliens, canhao, barreira1, barreira2, barreira3, barreira4);
                
                //SE OS ALIENS CHEGARAM NO FIM IMPRIME UMA MENSSAGEM E FINALIZA O PROGRAMA
                if ((aliens.alienMaisBaixo() == 14) && (aliens.alienMaisDireita() == 49)){ 
                    System.out.println("\n\n\n\nVoce perdeu Ô-Ô\n\n");
                    timer.cancel();
                    timer.purge();
                    return;
                }
            }
        };
            timer.scheduleAtFixedRate(printTela,0 ,500);
            timer.scheduleAtFixedRate(moverAliens,0 , 500);
            timer.scheduleAtFixedRate(moverCanhao,0 , 1500);
    }
}