package spaceinvaders;

public final class Tela{
    //larguraTela = 50, vai de 0 a 49 
    //alturaTela = 16, vai de 0 a 15

    //GERA A MATRIZ DA TELA PREENCHENDO CADA POSICAO COM UM ELEMENTO DO SISTEMA, E DEPOIS IMPRIME A TELA
    public static void printTela(Aliens aliens, Canhao canhao, Barreira barreira1, Barreira barreira2, Barreira barreira3, Barreira barreira4){
        final int matrizTela[][] = new int [16][50];
        
        //PREENCE A "matrizTela" COM OS SPRITES DOS ELEMENTOS DO SISTEMA
        for (int linha = 0; linha < 16; linha++) {
            for (int coluna = 0; coluna < 50; coluna++) {
                //PROCURA SE EXISTE UM ALIEN NA POSICAO (linha, coluna) E SE EXISTIR COLOCA O ALIENS NA MATRIZ
                if((aliens.getAlien(coluna, linha).getSpriteAlien() != -1) && (aliens.getAlien(coluna, linha).getSpriteAlien() != 0)){
                    matrizTela[linha][coluna] = aliens.getAlien(coluna, linha).getSpriteAlien();
                }
                //PROCURA SE EXISTE UM BLOCO NA POSICAO (linha, coluna) E SE EXISTIR COLOCA O BLOCO NA MATRIZ
                else if(barreira1.getBrick(coluna, linha).getSpriteBrick() != -1){
                    matrizTela[linha][coluna] = barreira1.getBrick(coluna, linha).getSpriteBrick();
                }
                //PROCURA SE EXISTE UM BLOCO NA POSICAO (linha, coluna) E SE EXISTIR COLOCA O BLOCO NA MATRIZ
                else if(barreira2.getBrick(coluna, linha).getSpriteBrick() != -1){
                    matrizTela[linha][coluna] = barreira2.getBrick(coluna, linha).getSpriteBrick();
                }
                //PROCURA SE EXISTE UM BLOCO NA POSICAO (linha, coluna) E SE EXISTIR COLOCA O BLOCO NA MATRIZ
                else if(barreira3.getBrick(coluna, linha).getSpriteBrick() != -1){
                    matrizTela[linha][coluna] = barreira3.getBrick(coluna, linha).getSpriteBrick();
                }
                //PROCURA SE EXISTE UM BLOCO NA POSICAO (linha, coluna) E SE EXISTIR COLOCA O BLOCO NA MATRIZ
                else if(barreira4.getBrick(coluna, linha).getSpriteBrick() != -1){
                    matrizTela[linha][coluna] = barreira4.getBrick(coluna, linha).getSpriteBrick();
                }
                //PROCURA SE EXISTE UM CANHAO NA POSICAO (linha, coluna) E SE EXISTIR COLOCA O CANHAO NA MATRIZ
                else if((linha == canhao.getCoordenadaY()) && (coluna == canhao.getCoordenadaX())){
                    matrizTela[linha][coluna] = canhao.getSpriteCanhao();
                }
                //SE NAO FOR ENCONTRADO UM ALIEN, OU UM BLOCO, OU UM CANHAO NA POSICAO (linha, coluna) SERA COLOCADO UM ESPACO VAZIO 
                else{
                    matrizTela[linha][coluna] = 0;
                }
            }
        }

        //IMPRESSAO DA TELA
        System.out.print("\n   score: "+ (55 - aliens.getVida()) +"                       vida:");

        for (int i = 0; i < canhao.getVida(); i++) { //IMPRIME A VIDA
            System.out.print(" ♥");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");

        //PERCORRE A "matrizTela" ANALIZANDO CADA SPRITE DA POSICAO (linha, coluna) E O IMPRIMINDO
        for (int linha = 0; linha < 16; linha++) {
            System.out.print("|");
            for (int coluna = 0; coluna < 50; coluna++) {
                switch (matrizTela[linha][coluna]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("m");//👾
                        break;
                    case 2:
                        System.out.print("A");//🛰
                        break;
                    case 3:
                        System.out.print("◻");
                        break;
                    default:
                        break;
                }
            }
            System.out.println("|");
        }
        System.out.print("----------------------------------------------------");
    }
}
/* 
      score: 0~55                       vida: ♥ ♥ ♥
   ----------------------------------------------------
0  |10101010101010101010100000000000000000000000000000| 
1  |10101010101010101010100000000000000000000000000000|
2  |10101010101010101010100000000000000000000000000000|
3  |10101010101010101010100000000000000000000000000000|
4  |10101010101010101010100000000000000000000000000000|
5  |00000000000000000000000000000000000000000000000000|
6  |00000000000000000000000000000000000000000000000000|
7  |00000000000000000000000000000000000000000000000000|
8  |00000000000000000000000000000000000000000000000000|
9  |00000000000000000000000000000000000000000000000000|
10 |00000000000000000000000000000000000000000000000000|
11 |00000000000000000000000000000000000000000000000000|
12 |00000000000000000000000000000000000000000000000000|
13 |00003333330000003333330000003333330000003333330000|
14 |00003333330000003333330000003333330000003333330000|
15 |00000000000000000000000020000000000000000000000000|
   ----------------------------------------------------
    0123456789...
tela: 16x50
*/