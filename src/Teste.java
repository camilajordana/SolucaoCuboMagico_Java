//Autoras: Camila Jordana Ribeiro Teixeira

public class Teste {
/*
     Branco(Bottom): 1
     Amarelo(Top): 2
     Verde(Front): 3
     Laranja(Right): 4
     Azul(Back): 5
     Vermelho(Left): 6
*/

    public static void main(String[] args) {

        int[][] front = new int[3][3];
        int[][] top = new int[3][3];
        int[][] right = new int[3][3];
        int[][] left = new int[3][3];
        int[][] bottom = new int[3][3];
        int[][] back = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                front[i][j] = 3;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                top[i][j] = 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                right[i][j] = 4;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                left[i][j] = 6;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bottom[i][j] = 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                back[i][j] = 5;
            }
        }

        Face face_Front = new Face(front);
        Face face_Top = new Face(top);
        Face face_Right = new Face(right);
        Face face_Left = new Face(left);
        Face face_Bottom = new Face(bottom);
        Face face_Back = new Face(back);

        Cubo cubo = new Cubo(face_Front, face_Back, face_Top, face_Bottom, face_Left, face_Right);

       
        cubo.frontClock();
        cubo.leftIClock();
        cubo.topClock180();
        cubo.backIClock();
        cubo.bottomClock();
        cubo.rightClock();
        
        
        cubo.primeiraCamada();
        cubo.segundaCamada();
        cubo.cruzAmarela();
        cubo.orientacaoCantos();
        cubo.permutacoesDosCantos();
        cubo.permutacoesDosMeios();
        
        

        cubo.exibir_Cubo();
        
        System.out.println(cubo.historyMoviments);

    }

}
