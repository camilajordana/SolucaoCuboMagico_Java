public class Cubo {

    private Face front;
    private Face back;
    private Face top;
    private Face bottom;
    private Face left;
    private Face rigth;
    private int aux1;
    private int aux2;
    String historyMoviments = "";

    public String getHistoryMoviments() {
        return historyMoviments;
    }

    public Cubo(Face front, Face back, Face top, Face bottom, Face left, Face rigth) {
        this.front = front;
        this.back = back;
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.rigth = rigth;
    }

    public void frontClock() {
        front.turnClock();
        int aux1[] = top.getBottom();
        int aux2[] = rigth.getLeftI();
        int aux3[] = bottom.getTop();
        top.setBottom(left.getRightI());
        rigth.setLeft(aux1);
        bottom.setTop(aux2);
        left.setRight(aux3);
        historyMoviments += "frontClock\n";
    }

    public void frontClock180() {
        frontClock();
        frontClock();
        //historyMoviments += "frontClock180\n";
    }

    public void frontIClock() {
        frontClock();
        frontClock();
        frontClock();
        //historyMoviments += "frontIClock\n";
    }

    public void rightClock() {
        rigth.turnClock();
        int aux1[] = top.getRightI();
        int aux2[] = back.getRightI();
        int aux3[] = bottom.getRight();
        top.setRight(front.getRight());
        back.setRight(aux1);
        bottom.setRight(aux2);
        front.setRight(aux3);
        historyMoviments += "rightClock\n";
    }

    public void rightClock180() {
        rightClock();
        rightClock();
        //historyMoviments += "rightClock180\n";
    }

    public void rightIClock() {
        rightClock();
        rightClock();
        rightClock();
        //historyMoviments += "rightIClock\n";
    }

    public void leftClock() {
        left.turnClock();
        int aux1[] = top.getLeft();
        int aux2[] = front.getLeft();
        int aux3[] = bottom.getLeftI();
        top.setLeft(back.getLeftI());
        front.setLeft(aux1);
        bottom.setLeft(aux2);
        back.setLeft(aux3);
        historyMoviments += "leftClock\n";
    }

    public void leftClock180() {
        leftClock();
        leftClock();
        //historyMoviments += "leftClock180\n";
    }

    public void leftIClock() {
        leftClock();
        leftClock();
        leftClock();
        //historyMoviments += "leftIClock\n";
    }

    public void bottomIClock() {
        bottom.turnIClock();
        int aux1[] = rigth.getBottom();
        int aux2[] = front.getBottom();
        int aux3[] = left.getBottomI();
        rigth.setBottom(back.getBottomI());
        front.setBottom(aux1);
        left.setBottom(aux2);
        back.setBottom(aux3);
        historyMoviments += "bottomIClock\n";
    }

    public void bottomClock180() {
        bottomIClock();
        bottomIClock();
        //historyMoviments += "bottomClock180\n";
    }

    public void bottomClock() {
        bottomIClock();
        bottomIClock();
        bottomIClock();
        //historyMoviments += "bottomClock\n";
    }

    public void backIClock() {
        back.turnClock();
        int aux1[] = top.getTop();
        int aux2[] = rigth.getRightI();
        int aux3[] = bottom.getBottom();
        top.setTop(left.getLeftI());
        rigth.setRight(aux1);
        bottom.setBottom(aux2);
        left.setLeft(aux3);
        historyMoviments += "backIClock\n";
    }

    public void backClock180() {
        backIClock();
        backIClock();
        //historyMoviments += "backClock180\n";
    }

    public void backClock() {
        backIClock();
        backIClock();
        backIClock();
        //historyMoviments += "backClock\n";

    }

    public void topClock() {

        top.turnClock();
        int aux1[] = rigth.getTop();
        int aux2[] = front.getTop();
        int aux3[] = left.getTopI();
        rigth.setTop(back.getTopI());
        front.setTop(aux1);
        left.setTop(aux2);
        back.setTop(aux3);
        historyMoviments += "topClock\n";
    }

    public void topClock180() {
        topClock();
        topClock();
        //historyMoviments += "topClock180\n";
    }

    public void topIClock() {
        topClock();
        topClock();
        topClock();
        //historyMoviments += "topIClock\n";
    }

    public void exibir_Cubo() {
        int matriz_front[][] = front.getFace();
        int matriz_left[][] = left.getFace();
        int matriz_right[][] = rigth.getFace();
        int matriz_top[][] = top.getFace();
        int matriz_back[][] = back.getFace();
        int matriz_bottom[][] = bottom.getFace();

        System.out.print("        ");
        System.out.println(matriz_top[0][0] + " " + matriz_top[0][1] + " " + matriz_top[0][2]);
        System.out.print("        ");
        System.out.println(matriz_top[1][0] + " " + matriz_top[1][1] + " " + matriz_top[1][2]);
        System.out.print("        ");
        System.out.println(matriz_top[2][0] + " " + matriz_top[2][1] + " " + matriz_top[2][2]);

        System.out.println(matriz_left[0][0] + " " + matriz_left[0][1] + " " + matriz_left[0][2] + "   " + matriz_front[0][0] + " " + matriz_front[0][1] + " " + matriz_front[0][2] + "   " + matriz_right[0][0] + " " + matriz_right[0][1] + " " + matriz_right[0][2] + "   " + matriz_back[0][2] + " " + matriz_back[0][1] + " " + matriz_back[0][0]);
        System.out.println(matriz_left[1][0] + " " + matriz_left[1][1] + " " + matriz_left[1][2] + "   " + matriz_front[1][0] + " " + matriz_front[1][1] + " " + matriz_front[1][2] + "   " + matriz_right[1][0] + " " + matriz_right[1][1] + " " + matriz_right[1][2] + "   " + matriz_back[1][2] + " " + matriz_back[1][1] + " " + matriz_back[1][0]);
        System.out.println(matriz_left[2][0] + " " + matriz_left[2][1] + " " + matriz_left[2][2] + "   " + matriz_front[2][0] + " " + matriz_front[2][1] + " " + matriz_front[2][2] + "   " + matriz_right[2][0] + " " + matriz_right[2][1] + " " + matriz_right[2][2] + "   " + matriz_back[2][2] + " " + matriz_back[2][1] + " " + matriz_back[2][0]);

        System.out.print("        ");
        System.out.println(matriz_bottom[0][0] + " " + matriz_bottom[0][1] + " " + matriz_bottom[0][2]);
        System.out.print("        ");
        System.out.println(matriz_bottom[1][0] + " " + matriz_bottom[1][1] + " " + matriz_bottom[1][2]);
        System.out.print("        ");
        System.out.println(matriz_bottom[2][0] + " " + matriz_bottom[2][1] + " " + matriz_bottom[2][2]);

    }

    public void primeiraCamada() {

        int matriz_front[][] = front.getFace();
        int matriz_left[][] = left.getFace();
        int matriz_right[][] = rigth.getFace();
        int matriz_top[][] = top.getFace();
        int matriz_back[][] = back.getFace();
        int matriz_bottom[][] = bottom.getFace();

        //(1,3)
        if (matriz_bottom[1][2] == 1 && matriz_right[2][1] == 3) {
            bottomIClock();
        } else if (matriz_bottom[2][1] == 1 && matriz_back[2][1] == 3) {
            bottomClock180();
        } else if (matriz_bottom[1][0] == 1 && matriz_left[2][1] == 3) {
            bottomClock();
        } else if (matriz_front[2][1] == 1 && matriz_bottom[0][1] == 3) {
            frontIClock();
            rightIClock();
            bottomIClock();
        } else if (matriz_front[1][2] == 1 && matriz_right[1][0] == 3) {
            rightIClock();
            bottomIClock();
        } else if (matriz_front[0][1] == 1 && matriz_top[2][1] == 3) {
            topClock();
            leftClock();
            frontIClock();
        } else if (matriz_front[1][0] == 1 && matriz_left[1][2] == 3) {
            leftClock();
            bottomClock();
        } else if (matriz_left[1][2] == 1 && matriz_front[1][0] == 3) {
            frontIClock();
        } else if (matriz_left[2][1] == 1 && matriz_bottom[1][0] == 3) {
            leftIClock();
            frontIClock();
        } else if (matriz_left[0][1] == 1 && matriz_top[1][0] == 3) {
            leftClock();
            frontIClock();
        } else if (matriz_left[1][0] == 1 && matriz_back[1][0] == 3) {
            leftClock180();
            frontIClock();
        } else if (matriz_right[1][0] == 1 && matriz_front[1][2] == 3) {
            frontClock();
        } else if (matriz_right[2][1] == 1 && matriz_bottom[1][2] == 3) {
            rightClock();
            frontClock();
        } else if (matriz_right[1][2] == 1 && matriz_back[1][2] == 3) {
            rightClock180();
            frontClock();
        } else if (matriz_right[0][1] == 1 && matriz_top[1][2] == 3) {
            rightIClock();
            frontClock();
        } else if (matriz_top[2][1] == 1 && matriz_front[0][1] == 3) {
            frontClock180();
        } else if (matriz_top[1][0] == 1 && matriz_left[0][1] == 3) {
            topIClock();
            frontClock180();
        } else if (matriz_top[1][2] == 1 && matriz_right[0][1] == 3) {
            topClock();
            frontClock180();
        } else if (matriz_top[0][1] == 1 && matriz_back[0][1] == 3) {
            topClock180();
            frontClock180();
        } else if (matriz_back[0][1] == 1 && matriz_top[0][1] == 3) {
            topIClock();
            leftClock();
            frontIClock();
        } else if (matriz_back[1][0] == 1 && matriz_left[1][0] == 3) {
            leftIClock();
            bottomClock();
        } else if (matriz_back[1][2] == 1 && matriz_right[1][2] == 3) {
            rightClock();
            bottomIClock();
        } else if (matriz_back[2][1] == 1 && matriz_bottom[2][1] == 3) {
            backIClock();
            leftIClock();
            bottomClock();
        }

        //(1,6)
        if (matriz_bottom[2][1] == 1 && matriz_back[2][1] == 6) {
            backClock180();
            topIClock();
            leftClock180();
        } else if (matriz_bottom[1][2] == 1 && matriz_right[2][1] == 6) {
            rightClock180();
            topClock180();
            leftClock180();
        } else if (matriz_left[2][1] == 1 && matriz_bottom[1][0] == 6) {
            leftClock180();
            topClock();
            backClock();
            leftIClock();
        } else if (matriz_left[1][2] == 1 && matriz_front[1][0] == 6) {
            leftIClock();
            topClock();
            backClock();
            leftIClock();
        } else if (matriz_left[0][1] == 1 && matriz_top[1][0] == 6) {
            topClock();
            backClock();
            leftIClock();
        } else if (matriz_left[1][0] == 1 && matriz_back[1][0] == 6) {
            leftClock();
            topClock();
            backClock();
            leftIClock();
        } else if (matriz_right[1][0] == 1 && matriz_front[1][2] == 6) {
            rightClock180();
            backClock();
            topIClock();
            leftClock180();
        } else if (matriz_right[0][1] == 1 && matriz_top[1][2] == 6) {
            rightClock();
            backClock();
            topIClock();
            leftClock180();
        } else if (matriz_right[1][2] == 1 && matriz_back[1][2] == 6) {
            backClock();
            topIClock();
            leftClock180();
        } else if (matriz_right[2][1] == 1 && matriz_bottom[1][2] == 6) {
            rightIClock();
            backClock();
            topIClock();
            leftClock180();
        } else if (matriz_front[1][0] == 1 && matriz_left[1][2] == 6) {
            leftClock();
        } else if (matriz_front[0][1] == 1 && matriz_top[2][1] == 6) {
            topClock180();
            backClock();
            leftIClock();
        } else if (matriz_front[1][2] == 1 && matriz_right[1][0] == 6) {
            rightClock();
            topClock180();
            leftClock180();
        } else if (matriz_top[2][1] == 1 && matriz_front[0][1] == 6) {
            topClock();
            leftClock180();
        } else if (matriz_top[1][0] == 1 && matriz_left[0][1] == 6) {
            leftClock180();
        } else if (matriz_top[0][1] == 1 && matriz_back[0][1] == 6) {
            topIClock();
            leftClock180();
        } else if (matriz_top[1][2] == 1 && matriz_right[0][1] == 6) {
            topClock180();
            leftClock180();
        } else if (matriz_back[2][1] == 1 && matriz_bottom[2][1] == 6) {
            backIClock();
            leftIClock();
        } else if (matriz_back[1][0] == 1 && matriz_left[1][0] == 6) {
            leftIClock();
        } else if (matriz_back[1][2] == 1 && matriz_right[1][2] == 6) {
            backClock180();
            leftIClock();
        } else if (matriz_back[0][1] == 1 && matriz_top[0][1] == 6) {
            backClock();
            leftIClock();
        }

        //(1,5)
        if (matriz_bottom[1][2] == 1 && matriz_right[2][1] == 5) {
            rightClock180();
            topIClock();
            backClock180();
        } else if (matriz_left[1][0] == 1 && matriz_back[1][0] == 5) {
            backClock();
        } else if (matriz_left[1][2] == 1 && matriz_front[1][0] == 5) {
            leftIClock();
            topClock180();
            leftClock();
            rightClock();
            backIClock();
        } else if (matriz_left[0][1] == 1 && matriz_top[1][0] == 5) {
            topClock180();
            rightClock();
            backIClock();
        } else if (matriz_right[1][0] == 1 && matriz_front[1][2] == 5) {
            rightClock180();
            backIClock();
        } else if (matriz_right[0][1] == 1 && matriz_top[1][2] == 5) {
            rightClock();
            backIClock();
        } else if (matriz_right[1][2] == 1 && matriz_back[1][2] == 5) {
            backIClock();
        } else if (matriz_right[2][1] == 1 && matriz_bottom[1][2] == 5) {
            rightIClock();
            backIClock();
        } else if (matriz_front[1][0] == 1 && matriz_left[1][2] == 5) {
            leftIClock();
            topIClock();
            leftClock();
            topClock180();
            backClock180();
        } else if (matriz_front[1][2] == 1 && matriz_right[1][0] == 5) {
            rightClock();
            topIClock();
            backClock180();
        } else if (matriz_front[0][1] == 1 && matriz_top[2][1] == 5) {
            topIClock();
            rightClock();
            backIClock();
        } else if (matriz_top[2][1] == 1 && matriz_front[0][1] == 5) {
            topClock180();
            backClock180();
        } else if (matriz_top[1][0] == 1 && matriz_left[0][1] == 5) {
            topClock();
            backClock180();
        } else if (matriz_top[1][2] == 1 && matriz_right[0][1] == 5) {
            topIClock();
            backClock180();
        } else if (matriz_top[0][1] == 1 && matriz_back[0][1] == 5) {
            backClock180();
        } else if (matriz_back[0][1] == 1 && matriz_top[0][1] == 5) {
            topClock();
            rightClock();
            backIClock();
        } else if (matriz_back[1][0] == 1 && matriz_left[1][0] == 5) {
            backIClock();
            topClock();
            rightClock();
            backIClock();
        } else if (matriz_back[1][2] == 1 && matriz_right[1][2] == 5) {
            backClock();
            topClock();
            rightClock();
            backIClock();
        } else if (matriz_back[2][1] == 1 && matriz_bottom[2][1] == 5) {
            backClock180();
            topClock();
            rightClock();
            backIClock();
        }

        //(1,4)
        if (matriz_right[2][1] == 1 && matriz_bottom[1][2] == 4) {
            backIClock();
            rightIClock();
            backClock();
            topClock();
            rightClock180();
        } else if (matriz_right[1][0] == 1 && matriz_front[1][2] == 4) {
            backIClock();
            rightClock180();
            backClock();
            topClock();
            rightClock180();
        } else if (matriz_right[0][1] == 1 && matriz_top[1][2] == 4) {
            backIClock();
            rightClock();
            backClock();
            topClock();
            rightClock180();
        } else if (matriz_right[1][2] == 1 && matriz_back[1][2] == 4) {
            backClock();
            topClock();
            backIClock();
            rightClock180();
        } else if (matriz_front[1][0] == 1 && matriz_left[1][2] == 4) {
            leftIClock();
            topClock180();
            leftClock();
            rightClock180();
        } else if (matriz_front[1][2] == 1 && matriz_right[1][0] == 4) {
            rightIClock();
        } else if (matriz_front[0][1] == 1 && matriz_top[2][1] == 4) {
            frontClock();
            rightIClock();
            frontIClock();
        } else if (matriz_left[0][1] == 1 && matriz_top[1][0] == 4) {
            frontIClock();
            topIClock();
            frontClock();
            rightIClock();
        } else if (matriz_left[1][2] == 1 && matriz_front[1][0] == 4) {
            frontClock();
            topIClock();
            rightClock180();
            frontIClock();
        } else if (matriz_left[1][0] == 1 && matriz_back[1][0] == 4) {
            backIClock();
            topClock();
            rightClock180();
            backClock();
        } else if (matriz_top[2][1] == 1 && matriz_front[0][1] == 4) {
            topIClock();
            rightClock180();
        } else if (matriz_top[1][2] == 1 && matriz_right[0][1] == 4) {
            rightClock180();
        } else if (matriz_top[1][0] == 1 && matriz_left[0][1] == 4) {
            topClock180();
            rightClock180();
        } else if (matriz_top[0][1] == 1 && matriz_back[0][1] == 4) {
            topClock();
            rightClock180();
        } else if (matriz_back[1][2] == 1 && matriz_right[1][2] == 4) {
            rightClock();
        } else if (matriz_back[1][0] == 1 && matriz_left[1][0] == 4) {
            leftClock();
            topClock180();
            rightClock180();
            leftIClock();
        } else if (matriz_back[0][1] == 1 && matriz_top[0][1] == 4) {
            backIClock();
            rightClock();
            backClock();
        }

        //FINALIZANDO PRIMEIRA CAMADA
        //(1,3,4)
        if (matriz_bottom[0][0] == 1 && matriz_front[2][0] == 4 && matriz_left[2][2] == 3) {
            leftIClock();
            topIClock();
            leftClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_bottom[2][0] == 1 && matriz_left[2][0] == 4 && matriz_back[2][0] == 3) {
            backIClock();
            topClock180();
            backClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_bottom[2][2] == 1 && matriz_right[2][2] == 3 && matriz_back[2][2] == 4) {
            backClock();
            topClock180();
            backIClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_front[2][2] == 1 && matriz_bottom[0][2] == 4 && matriz_right[2][0] == 3) {
            rightClock();
            topIClock();
            rightIClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_front[2][0] == 1 && matriz_bottom[0][0] == 3 && matriz_left[2][2] == 4) {
            leftIClock();
            topClock();
            leftClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_front[0][2] == 1 && matriz_top[2][2] == 3 && matriz_right[0][0] == 4) {
            topClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_front[0][0] == 1 && matriz_top[2][0] == 4 && matriz_left[0][2] == 3) {
            topIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_left[2][2] == 1 && matriz_front[2][0] == 3 && matriz_bottom[0][0] == 4) {
            leftIClock();
            rightClock();
            topIClock();
            leftClock();
            rightIClock();
        } else if (matriz_left[0][2] == 1 && matriz_front[0][0] == 4 && matriz_top[2][0] == 3) {
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_left[0][0] == 1 && matriz_top[0][0] == 4 && matriz_back[0][0] == 3) {
            topClock180();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_left[2][0] == 1 && matriz_bottom[2][0] == 3 && matriz_back[2][0] == 4) {
            backIClock();
            topClock();
            backClock();
            topClock180();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_right[2][0] == 1 && matriz_front[2][2] == 4 && matriz_bottom[0][2] == 3) {
            rightClock();
            topClock();
            rightIClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_right[0][0] == 1 && matriz_front[0][2] == 3 && matriz_top[2][2] == 4) {
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_right[0][2] == 1 && matriz_top[0][2] == 3 && matriz_back[0][2] == 4) {
            topClock180();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_right[2][2] == 1 && matriz_bottom[2][2] == 4 && matriz_back[2][2] == 3) {
            backClock();
            topIClock();
            backIClock();
            topClock180();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_top[2][2] == 1 && matriz_front[0][2] == 4 && matriz_right[0][0] == 3) {
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_top[2][0] == 1 && matriz_front[0][0] == 3 && matriz_left[0][2] == 4) {
            topIClock();
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_top[0][2] == 1 && matriz_right[0][2] == 4 && matriz_back[0][2] == 3) {
            topClock();
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_top[0][0] == 1 && matriz_left[0][0] == 3 && matriz_back[0][0] == 4) {
            topClock180();
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_back[0][0] == 1 && matriz_left[0][0] == 4 && matriz_top[0][0] == 3) {
            rightClock();
            topClock180();
            rightIClock();
        } else if (matriz_back[0][2] == 1 && matriz_right[0][2] == 3 && matriz_top[0][2] == 4) {
            topClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_back[2][2] == 1 && matriz_bottom[2][2] == 3 && matriz_right[2][2] == 4) {
            backClock();
            topClock();
            backIClock();
            rightClock();
            topClock();
            rightIClock();
        } else if (matriz_back[2][0] == 1 && matriz_left[2][0] == 3 && matriz_bottom[2][0] == 4) {
            backIClock();
            topIClock();
            backClock();
            rightClock();
            topIClock();
            rightIClock();
        }

        //(1,3,6)
        if (matriz_bottom[2][0] == 1 && matriz_left[2][0] == 3 && matriz_back[2][0] == 6) {
            backIClock();
            topClock180();
            backClock();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_bottom[2][2] == 1 && matriz_right[2][2] == 6 && matriz_back[2][2] == 3) {
            backClock();
            topClock180();
            backIClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_front[2][0] == 1 && matriz_bottom[0][0] == 6 && matriz_left[2][2] == 3) {
            leftIClock();
            topClock();
            leftClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_front[0][0] == 1 && matriz_top[2][0] == 3 && matriz_left[0][2] == 6) {
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_front[0][2] == 1 && matriz_top[2][2] == 6 && matriz_right[0][0] == 3) {
            topClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_left[2][2] == 1 && matriz_front[2][0] == 6 && matriz_bottom[0][0] == 3) {
            leftIClock();
            topIClock();
            leftClock();
            topClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_left[2][0] == 1 && matriz_back[2][0] == 3 && matriz_bottom[2][0] == 6) {
            backIClock();
            topClock();
            backClock();
            topClock180();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_left[0][2] == 1 && matriz_front[0][0] == 3 && matriz_top[2][0] == 6) {
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_left[0][0] == 1 && matriz_top[0][0] == 3 && matriz_back[0][0] == 6) {
            topClock180();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_right[0][0] == 1 && matriz_front[0][2] == 6 && matriz_top[2][2] == 3) {
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_right[0][2] == 1 && matriz_top[0][2] == 6 && matriz_back[0][2] == 3) {
            topClock180();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_right[2][2] == 1 && matriz_bottom[2][2] == 3 && matriz_back[2][2] == 6) {
            backClock();
            topIClock();
            backIClock();
            topClock180();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_top[2][0] == 1 && matriz_front[0][0] == 6 && matriz_left[0][2] == 3) {
            leftIClock();
            topClock180();
            leftClock();
            topClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_top[2][2] == 1 && matriz_front[0][2] == 3 && matriz_right[0][0] == 6) {
            leftIClock();
            topClock180();
            leftClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_top[0][2] == 1 && matriz_right[0][2] == 3 && matriz_back[0][2] == 6) {
            leftIClock();
            topIClock();
            leftClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_top[0][0] == 1 && matriz_left[0][0] == 6 && matriz_back[0][0] == 3) {
            topIClock();
            leftIClock();
            topClock180();
            leftClock();
            topClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_back[0][0] == 1 && matriz_left[0][0] == 3 && matriz_top[0][0] == 6) {
            topIClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_back[0][2] == 1 && matriz_top[0][2] == 3 && matriz_right[0][2] == 6) {
            leftIClock();
            topClock180();
            leftClock();
        } else if (matriz_back[2][0] == 1 && matriz_bottom[2][0] == 3 && matriz_left[2][0] == 6) {
            backIClock();
            topIClock();
            backClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_back[2][2] == 1 && matriz_right[2][2] == 3 && matriz_bottom[2][2] == 6) {
            backClock();
            topClock();
            backIClock();
            leftIClock();
            topClock();
            leftClock();
        }

        //(1, 6, 5)
        if (matriz_bottom[2][2] == 1 && matriz_right[2][2] == 5 && matriz_back[2][2] == 6) {
            backClock();
            topIClock();
            backIClock();
            topClock180();
            backIClock();
            topClock();
            backClock();
        } else if (matriz_back[2][0] == 1 && matriz_bottom[2][0] == 6 && matriz_left[2][0] == 5) {
            backIClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_back[2][2] == 1 && matriz_bottom[2][2] == 5 && matriz_right[2][2] == 6) {
            backClock();
            topClock();
            backClock180();
            topClock180();
            backClock();
        } else if (matriz_back[0][0] == 1 && matriz_top[0][0] == 5 && matriz_left[0][0] == 6) {
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_back[0][2] == 1 && matriz_top[0][2] == 6 && matriz_right[0][2] == 5) {
            topClock180();
            backIClock();
            topClock();
            backClock();
        } else if (matriz_left[2][0] == 1 && matriz_bottom[2][0] == 5 && matriz_back[2][0] == 6) {
            backIClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
        } else if (matriz_left[0][2] == 1 && matriz_front[0][0] == 6 && matriz_top[2][0] == 5) {
            topClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_left[0][0] == 1 && matriz_top[0][0] == 6 && matriz_back[0][0] == 5) {
            topIClock();
            backIClock();
            topClock();
            backClock();
        } else if (matriz_right[0][0] == 1 && matriz_front[0][2] == 5 && matriz_top[2][2] == 6) {
            backIClock();
            topClock180();
            backClock();
        } else if (matriz_right[0][2] == 1 && matriz_top[0][2] == 5 && matriz_back[0][2] == 6) {
            topIClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_right[2][2] == 1 && matriz_bottom[2][2] == 6 && matriz_back[2][2] == 5) {
            backClock();
            topIClock();
            backIClock();
            topIClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_front[0][0] == 1 && matriz_top[2][0] == 6 && matriz_left[0][2] == 5) {
            backIClock();
            topClock();
            backClock();
        } else if (matriz_front[0][2] == 1 && matriz_top[2][2] == 5 && matriz_right[0][0] == 6) {
            topClock180();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_top[2][0] == 1 && matriz_front[0][0] == 5 && matriz_left[0][2] == 6) {
            topClock();
            backIClock();
            topClock180();
            backClock();
            topClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_top[2][2] == 1 && matriz_front[0][2] == 6 && matriz_right[0][0] == 5) {
            topClock180();
            backIClock();
            topClock180();
            backClock();
            topClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_top[0][0] == 1 && matriz_left[0][0] == 5 && matriz_back[0][0] == 6) {
            backIClock();
            topClock180();
            backClock();
            topClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_top[0][2] == 1 && matriz_right[0][2] == 6 && matriz_back[0][2] == 5) {
            topIClock();
            backIClock();
            topClock180();
            backClock();
            topClock();
            backIClock();
            topIClock();
            backClock();
        }

        //(1, 4, 5)
        if (matriz_right[2][2] == 1 && matriz_bottom[2][2] == 5 && matriz_back[2][2] == 4) {
            backClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
        } else if (matriz_right[0][2] == 1 && matriz_top[0][2] == 4 && matriz_back[0][2] == 5) {
            topClock();
            backClock();
            topIClock();
            backIClock();
        } else if (matriz_right[0][0] == 1 && matriz_front[0][2] == 4 && matriz_top[2][2] == 5) {
            topIClock();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_left[0][2] == 1 && matriz_front[0][0] == 5 && matriz_top[2][0] == 4) {
            backClock();
            topClock180();
            backIClock();
        } else if (matriz_left[0][0] == 1 && matriz_top[0][0] == 5 && matriz_back[0][0] == 4) {
            topClock();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_front[0][0] == 1 && matriz_top[2][0] == 5 && matriz_left[0][2] == 4) {
            topClock180();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_front[0][2] == 1 && matriz_top[2][2] == 4 && matriz_right[0][0] == 5) {
            backClock();
            topIClock();
            backIClock();
        } else if (matriz_back[2][2] == 1 && matriz_right[2][2] == 5 && matriz_bottom[2][2] == 4) {
            backClock();
            topClock();
            backIClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_back[0][2] == 1 && matriz_right[0][2] == 4 && matriz_top[0][2] == 5) {
            backClock();
            topClock();
            backIClock();
        } else if (matriz_back[0][0] == 1 && matriz_top[0][0] == 4 && matriz_left[0][0] == 5) {
            topClock180();
            backClock();
            topIClock();
            backIClock();
        } else if (matriz_top[0][0] == 1 && matriz_back[0][0] == 5 && matriz_left[0][0] == 4) {
            topClock();
            backClock();
            topClock180();
            backIClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_top[0][2] == 1 && matriz_back[0][2] == 4 && matriz_right[0][2] == 5) {
            backClock();
            topClock180();
            backIClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_top[2][0] == 1 && matriz_front[0][0] == 4 && matriz_left[0][2] == 5) {
            topClock180();
            backClock();
            topClock180();
            backIClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_top[2][2] == 1 && matriz_front[0][2] == 5 && matriz_right[0][0] == 4) {
            topIClock();
            backClock();
            topClock180();
            backIClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
        }

    }

    public void segundaCamada() {

        int matriz_front[][] = front.getFace();
        int matriz_left[][] = left.getFace();
        int matriz_right[][] = rigth.getFace();
        int matriz_top[][] = top.getFace();
        int matriz_back[][] = back.getFace();
        int matriz_bottom[][] = bottom.getFace();

        //(3, 4)
        if (matriz_front[1][0] == 3 && matriz_left[1][2] == 4) {
            leftIClock();
            topClock();
            leftClock();
            frontIClock();
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_front[0][1] == 3 && matriz_top[2][1] == 4) {
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
        } else if (matriz_left[1][2] == 3 && matriz_front[1][0] == 4) {
            leftIClock();
            topIClock();
            leftClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
            leftIClock();
            topClock();
            leftClock();
        } else if (matriz_left[1][0] == 3 && matriz_back[1][0] == 4) {
            backIClock();
            topIClock();
            backClock();
            topClock();
            frontIClock();
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_left[0][1] == 3 && matriz_top[1][0] == 4) {
            rightClock();
            topIClock();
            rightIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
        } else if (matriz_right[1][0] == 3 && matriz_front[1][2] == 4) {
            rightClock();
            topClock();
            rightIClock();
            topClock180();
            rightClock();
            topClock180();
            rightIClock();
            topClock();
            frontIClock();
            topIClock();
            frontClock();
        } else if (matriz_right[0][1] == 3 && matriz_top[1][2] == 4) {
            topClock180();
            rightClock();
            topIClock();
            rightIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
        } else if (matriz_right[1][2] == 3 && matriz_back[1][2] == 4) {
            backClock();
            topClock();
            backIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            backClock();
            topIClock();
            backIClock();
        } else if (matriz_back[1][0] == 3 && matriz_left[1][0] == 4) {
            backIClock();
            topIClock();
            backClock();
            rightClock();
            topIClock();
            rightIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
            backIClock();
            topClock180();
            backClock();
        } else if (matriz_back[1][2] == 3 && matriz_right[1][2] == 4) {
            backClock();
            topIClock();
            backIClock();
            rightClock();
            topIClock();
            rightIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
            backClock();
            topClock();
            backIClock();
        } else if (matriz_back[0][1] == 3 && matriz_top[0][1] == 4) {
            topIClock();
            rightClock();
            topIClock();
            rightIClock();
            topIClock();
            frontIClock();
            topClock();
            frontClock();
        } else if (matriz_top[2][1] == 3 && matriz_front[0][1] == 4) {
            topClock180();
            frontIClock();
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_top[1][0] == 3 && matriz_left[0][1] == 4) {
            topClock();
            frontIClock();
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_top[1][2] == 3 && matriz_right[0][1] == 4) {
            topIClock();
            frontIClock();
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if (matriz_top[0][1] == 3 && matriz_back[0][1] == 4) {
            frontIClock();
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
        }

        //(3, 6)
        if (matriz_front[0][1] == 3 && matriz_top[2][1] == 6) {
            topIClock();
            leftIClock();
            topClock();
            leftClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
        } else if (matriz_left[1][2] == 3 && matriz_front[1][0] == 6) {
            frontClock();
            topClock();
            frontIClock();
            topClock180();
            frontClock();
            topClock180();
            frontIClock();
            topClock();
            leftIClock();
            topIClock();
            leftClock();
        } else if (matriz_left[0][1] == 3 && matriz_top[1][0] == 6) {
            topClock180();
            leftIClock();
            topClock();
            leftClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
        } else if (matriz_left[1][0] == 3 && matriz_back[1][0] == 6) {
            backIClock();
            topIClock();
            backClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
            backIClock();
            topClock();
            backClock();
        } else if (matriz_back[1][0] == 3 && matriz_left[1][0] == 6) {
            backIClock();
            topClock();
            backClock();
            leftIClock();
            topClock();
            leftClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
            backIClock();
            topIClock();
            backClock();
        } else if (matriz_back[1][2] == 3 && matriz_right[1][2] == 6) {
            backClock();
            topClock();
            backIClock();
            leftIClock();
            topClock();
            leftClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
            backClock();
            topClock180();
            backIClock();
        } else if(matriz_back[0][1] == 3 && matriz_top[0][1] == 6){
            topClock();
            leftIClock();
            topClock();
            leftClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
        } else if(matriz_right[1][2] == 3 && matriz_back[1][2] == 6){
            backClock();
            topIClock();
            backIClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
        } else if(matriz_right[0][1] == 3 && matriz_top[1][2] == 6){
            leftIClock();
            topClock();
            leftClock();
            topClock();
            frontClock();
            topIClock();
            frontIClock();
        } else if(matriz_top[1][0] == 3 && matriz_left[0][1] == 6){
            topClock();
            frontClock();
            topIClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } else if(matriz_top[2][1] == 3 && matriz_front[0][1] == 6){
            topClock180();
            frontClock();
            topIClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } else if(matriz_top[1][2] == 3 && matriz_right[0][1] == 6){
            topIClock();
            frontClock();
            topIClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } else if(matriz_top[0][1] == 3 && matriz_back[0][1] == 6){
            frontClock();
            topIClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
        } 
        
        
        //(6, 5)
        
        if(matriz_front[0][1] == 6 && matriz_top[2][1] == 5){
            backIClock();
            topClock();
            backClock();
            topClock();
            leftClock();
            topIClock();
            leftIClock();
        } else if(matriz_left[0][1] == 6 && matriz_top[1][0] == 5){
            topIClock();
            backIClock();
            topClock();
            backClock();
            topClock();
            leftClock();
            topIClock();
            leftIClock();
        } else if(matriz_back[1][0] == 6 && matriz_left[1][0] == 5){
            leftClock();
            topClock();
            leftIClock();
            topClock180();
            leftClock();
            topClock180();
            leftIClock();
            topClock();
            backIClock();
            topIClock();
            backClock();
        } else if(matriz_back[1][2] == 6 && matriz_right[1][2] == 5){
            backClock();
            topClock180();
            backClock180();
            topClock();
            backClock();
            topClock();
            leftClock();
            topIClock();
            leftIClock();
            topClock180();
            backClock();
            topIClock();
            backIClock();
        } else if(matriz_back[0][1] == 6 && matriz_top[0][1] == 5){
            topClock180();
            backIClock();
            topClock();
            backClock();
            topClock();
            leftClock();
            topIClock();
            leftIClock();
        } else if(matriz_right[1][2] == 6 && matriz_back[1][2] == 5){
            backClock();
            topClock();
            backIClock();
            leftClock();
            topIClock();
            leftIClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
            topIClock();
            backClock();
            topClock();
            backIClock();
        } else if(matriz_right[0][1] == 6 && matriz_top[1][2] == 5){
            topClock();
            backIClock();
            topClock();
            backClock();
            topClock();
            leftClock();
            topIClock();
            leftIClock();
        } else if(matriz_top[2][1] == 6 && matriz_front[0][1] == 5){
            topIClock();
            leftClock();
            topIClock();
            leftIClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
        } else if(matriz_top[1][2] == 6 && matriz_right[0][1] == 5){
            leftClock();
            topIClock();
            leftIClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
        } else if(matriz_top[1][0] == 6 && matriz_left[0][1] == 5){
            topClock180();
            leftClock();
            topIClock();
            leftIClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
        } else if(matriz_top[0][1] == 6 && matriz_back[0][1] == 5){
            topClock();
            leftClock();
            topIClock();
            leftIClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
        }
        
        
        //(4, 5)
        
        if(matriz_front[0][1] == 4 && matriz_top[2][1] == 5){
            backClock();
            topIClock();
            backIClock();
            topIClock();
            rightIClock();
            topClock();
            rightClock();
        } else if(matriz_left[0][1] == 4 && matriz_top[1][0] == 5){
            topIClock();
            backClock();
            topIClock();
            backIClock();
            topIClock();
            rightIClock();
            topClock();
            rightClock();
        } else if(matriz_back[0][1] == 4 && matriz_top[0][1] == 5){
            topClock180();
            backClock();
            topIClock();
            backIClock();
            topIClock();
            rightIClock();
            topClock();
            rightClock();
        } else if(matriz_back[1][2] == 4 && matriz_right[1][2] == 5){
            backClock();
            topClock();
            backIClock();
            topClock180();
            backClock();
            topClock180();
            backIClock();
            topClock();
            rightIClock();
            topIClock();
            rightClock();
        } else if(matriz_right[0][1] == 4 && matriz_top[1][2] == 5){
            topClock();
            backClock();
            topIClock();
            backIClock();
            topIClock();
            rightIClock();
            topClock();
            rightClock();
        } else if(matriz_top[1][0] == 4 && matriz_left[0][1] == 5){
            rightIClock();
            topClock();
            rightClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
        } else if(matriz_top[2][1] == 4 && matriz_front[0][1] == 5){
            topClock();
            rightIClock();
            topClock();
            rightClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
        } else if(matriz_top[1][2] == 4 && matriz_right[0][1] == 5){
            topClock180();
            rightIClock();
            topClock();
            rightClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
        } else if(matriz_top[0][1] == 4 && matriz_back[0][1] == 5){
            topIClock();
            rightIClock();
            topClock();
            rightClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
        }
        
    }
    
    
    public void cruzAmarela(){
        
        int matriz_front[][] = front.getFace();
        int matriz_left[][] = left.getFace();
        int matriz_right[][] = rigth.getFace();
        int matriz_top[][] = top.getFace();
        int matriz_back[][] = back.getFace();
        int matriz_bottom[][] = bottom.getFace();
        
        
        
        // RESOLVENDO A CRUZ AMARELA
        
        
        // Se só tiver peça amarela no centro
        if(matriz_top[0][1] != 2 && matriz_top[1][0] != 2 && matriz_top[1][2] != 2 && matriz_top[2][1] != 2){
            // (F R' F' R) U2 F R' F' R2 U2 R'
            frontClock();
            rightIClock();
            frontIClock();
            rightClock();
            topClock180();
            frontClock();
            rightIClock();
            frontIClock();
            rightClock180();
            topClock180();
            rightIClock();
        } else if(matriz_top[0][1] == 2 && matriz_top[2][1] == 2 && matriz_top[1][0] != 2 && matriz_top[1][2] != 2){
            // Se as peças estivem na vertical --> U F(R U R′ U′) F′
            topClock();
            frontClock();
            rightClock();
            topClock();
            rightIClock();
            topIClock();
            frontIClock();
        } else if(matriz_top[0][1] != 2 && matriz_top[2][1] != 2 && matriz_top[1][0] == 2 && matriz_top[1][2] == 2){
            // Se as peças estivem na horizontal --> F(R U R′ U′) F′
            frontClock();
            rightClock();
            topClock();
            rightIClock();
            topIClock();
            frontIClock();
        } else if(matriz_top[0][1] == 2 && matriz_top[1][0] == 2 && matriz_top[1][2] != 2 && matriz_top[2][1] != 2){
            // quando as peças estão orientadas de modo a forma um L (caso 1)
            // F U R U′ R′ F′
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            frontIClock();
        } else if(matriz_top[0][1] == 2 && matriz_top[1][0] != 2 && matriz_top[1][2] == 2 && matriz_top[2][1] != 2){
            // quando as peças estão orientadas de modo a forma um L (caso 2)
            // U' F U R U′ R′ F′
            topIClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            frontIClock();
        } else if(matriz_top[0][1] != 2 && matriz_top[1][0] != 2 && matriz_top[1][2] == 2 && matriz_top[2][1] == 2){
            // quando as peças estão orientadas de modo a forma um L (caso 3)
            // U2 F U R U′ R′ F′
            topClock180();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            frontIClock();
        } else if(matriz_top[0][1] != 2 && matriz_top[1][0] == 2 && matriz_top[1][2] != 2 && matriz_top[2][1] == 2){
            // quando as peças estão orientadas de modo a forma um L (caso 4)
            // U F U R U′ R′ F′
            topClock();
            frontClock();
            topClock();
            rightClock();
            topIClock();
            rightIClock();
            frontIClock();
        }
        
        
        
        
        //ORIENTAÇÕES DOS CANTOS
        
        
    }

    
    public void orientacaoCantos(){
        
        
        int matriz_front[][] = front.getFace();
        int matriz_left[][] = left.getFace();
        int matriz_right[][] = rigth.getFace();
        int matriz_top[][] = top.getFace();
        int matriz_back[][] = back.getFace();
        int matriz_bottom[][] = bottom.getFace();
    
        
       
        
        if(matriz_top[2][0] == 2 && matriz_front[0][2] == 2 && matriz_right[0][2] == 2 && matriz_back[0][0] == 2){
            // 1º CASO
            // R U R' U R U2 R'
            rightClock();
            topClock();
            rightIClock();
            topClock();
            rightClock();
            topClock180();
            rightIClock();
        } else if(matriz_top[2][2] == 2 && matriz_left[0][2] == 2 && matriz_right[0][2] == 2 && matriz_back[0][0] == 2){
            // 1º CASO
            // U R U R' U R U2 R'
            topClock();
            rightClock();
            topClock();
            rightIClock();
            topClock();
            rightClock();
            topClock180();
            rightIClock();
        } else if(matriz_top[0][2] == 2 && matriz_back[0][0] == 2 && matriz_left[0][2] == 2 && matriz_front[0][2] == 2){
            // 1º CASO            
            // U2 R U R' U R U2 R'
            topClock180();
            rightClock();
            topClock();
            rightIClock();
            topClock();
            rightClock();
            topClock180();
            rightIClock();            
        } else if(matriz_top[0][0] == 2 && matriz_left[0][2] == 2 && matriz_front[0][2] == 2 && matriz_right[0][2] == 2){
            // 1º CASO
            // U' R U R' U R U2 R'
            topIClock();
            rightClock();
            topClock();
            rightIClock();
            topClock();
            rightClock();
            topClock180();
            rightIClock(); 
        } else if(matriz_top[0][2] == 2 && matriz_left[0][0] == 2 && matriz_front[0][0] == 2 && matriz_right[0][0] == 2){
            // 2º CASO
            // R U2 R′ U′ R U′ R′
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if(matriz_top[0][0] == 2 && matriz_front[0][0] == 2 && matriz_right[0][0] == 2 && matriz_back[0][2] == 2){
            // 2º CASO
            // U R U2 R′ U′ R U′ R′
            topClock();
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if(matriz_top[2][0] == 2 && matriz_right[0][0] == 2 && matriz_back[0][2] == 2 && matriz_left[0][0] == 2){
            // 2º CASO
            // U2 R U2 R′ U′ R U′ R′
            topClock180();
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if(matriz_top[2][2] == 2 && matriz_back[0][2] == 2 && matriz_left[0][0] == 2 && matriz_front[0][0] == 2){
            // 2º CASO
            // U' R U2 R′ U′ R U′ R′
            topIClock();
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if(matriz_left[0][0] == 2 && matriz_left[0][2] == 2 && matriz_front[0][2] == 2 && matriz_back[0][2] == 2){
            // 3º CASO
            // R U2 R2 U' R2 U' R2 U2 R
            rightClock();
            topClock180();
            rightClock180();
            topIClock();
            rightClock180();
            topIClock();
            rightClock180();
            topClock180();
            rightClock();
        } else if(matriz_front[0][0] == 2 && matriz_front[0][2] == 2 && matriz_right[0][2] == 2 && matriz_left[0][0] == 2){
            // 3º CASO
            // U R U2 R2 U' R2 U' R2 U2 R
            topClock();
            rightClock();
            topClock180();
            rightClock180();
            topIClock();
            rightClock180();
            topIClock();
            rightClock180();
            topClock180();
            rightClock();
        } else if(matriz_right[0][0] == 2 && matriz_right[0][2] == 2 && matriz_back[0][0] == 2 && matriz_front[0][0] == 2){
            // 3º CASO
            // U2 R U2 R2 U' R2 U' R2 U2 R
            topClock180();
            rightClock();
            topClock180();
            rightClock180();
            topIClock();
            rightClock180();
            topIClock();
            rightClock180();
            topClock180();
            rightClock();
        } else if(matriz_back[0][0] == 2 && matriz_back[0][2] == 2 && matriz_left[0][2] == 2 && matriz_right[0][0] == 2){
            // 3º CASO
            // U' R U2 R2 U' R2 U' R2 U2 R
            topIClock();
            rightClock();
            topClock180();
            rightClock180();
            topIClock();
            rightClock180();
            topIClock();
            rightClock180();
            topClock180();
            rightClock();
        } else if(matriz_front[0][0] == 2 && matriz_front[0][2] == 2 && matriz_back[0][0] == 2 && matriz_back[0][2] == 2){
            // 4º CASO
            // R U2 R' U' R U R' U' R U' R'
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
            topIClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if(matriz_left[0][0] == 2 && matriz_left[0][2] == 2 && matriz_right[0][0] == 2 && matriz_right[0][2] == 2){
            // 4º CASO
            // U R U2 R' U' R U R' U' R U' R'
            topClock();
            rightClock();
            topClock180();
            rightIClock();
            topIClock();
            rightClock();
            topClock();
            rightIClock();
            topIClock();
            rightClock();
            topIClock();
            rightIClock();
        } else if(matriz_top[0][0] == 2 && matriz_top[2][0] == 2 && matriz_front[0][2] == 2 && matriz_back[0][2] == 2){
            // 5º CASO
            // (R' F' L F) (R F' L' F)
            rightIClock();
            frontIClock();
            leftClock();
            frontClock();
            rightClock();
            frontIClock();
            leftIClock();
            frontClock();
        } else if(matriz_top[2][0] == 2 && matriz_top[2][2] == 2 && matriz_right[0][2] == 2 && matriz_left[0][0] == 2){
            // 5º CASO
            // U (R' F' L F) (R F' L' F)
            topClock();
            rightIClock();
            frontIClock();
            leftClock();
            frontClock();
            rightClock();
            frontIClock();
            leftIClock();
            frontClock();
        } else if(matriz_top[2][2] == 2 && matriz_top[0][2] == 2 && matriz_front[0][0] == 2 && matriz_back[0][0] == 2){
            // 5º CASO
            // U2 (R' F' L F) (R F' L' F)
            topClock180();
            rightIClock();
            frontIClock();
            leftClock();
            frontClock();
            rightClock();
            frontIClock();
            leftIClock();
            frontClock();
        } else if(matriz_top[0][0] == 2 && matriz_top[0][2] == 2 && matriz_left[0][2] == 2 && matriz_right[0][0] == 2){
            // 5º CASO
            // U' (R' F' L F) (R F' L' F)
            topIClock();
            rightIClock();
            frontIClock();
            leftClock();
            frontClock();
            rightClock();
            frontIClock();
            leftIClock();
            frontClock();
        } else if(matriz_top[0][0] == 2 && matriz_top[0][2] == 2 && matriz_front[0][0] == 2 && matriz_front[0][2] == 2){
            // 6º CASO
            // R2 D R' U2 R D' R' U2 R'
            rightClock180();
            bottomClock();
            rightIClock();
            topClock180();
            rightClock();
            bottomIClock();
            rightIClock();
            topClock180();
            rightIClock();
        } else if(matriz_top[0][0] == 2 && matriz_top[2][0] == 2 && matriz_right[0][0] == 2 && matriz_right[0][2] == 2){
            // 6º CASO
            // U R2 D R' U2 R D' R' U2 R'
            topClock();
            rightClock180();
            bottomClock();
            rightIClock();
            topClock180();
            rightClock();
            bottomIClock();
            rightIClock();
            topClock180();
            rightIClock();
        } else if(matriz_top[2][0] == 2 && matriz_top[2][2] == 2 && matriz_back[0][0] == 2 && matriz_back[0][2] == 2){
            // 6º CASO
            // U2 R2 D R' U2 R D' R' U2 R'
            topClock180();
            rightClock180();
            bottomClock();
            rightIClock();
            topClock180();
            rightClock();
            bottomIClock();
            rightIClock();
            topClock180();
            rightIClock();
        } else if(matriz_top[0][2] == 2 && matriz_top[2][2] == 2 && matriz_left[0][0] == 2 && matriz_left[0][2] == 2){
            // 6º CASO
            // U' R2 D R' U2 R D' R' U2 R'
            topIClock();
            rightClock180();
            bottomClock();
            rightIClock();
            topClock180();
            rightClock();
            bottomIClock();
            rightIClock();
            topClock180();
            rightIClock();
        } else if(matriz_top[0][0] == 2 && matriz_top[2][2] == 2 && matriz_front[0][0] == 2 && matriz_right[0][2] == 2){
            // 7º CASO
            // (R' F R B') (R' F' R B)
            rightIClock();
            frontClock();
            rightClock();
            backIClock();
            rightIClock();
            frontIClock();
            rightClock();
            backClock();
        } else if(matriz_top[2][0] == 2 && matriz_top[0][2] == 2 && matriz_right[0][0] == 2 && matriz_back[0][0] == 2){
            // 7º CASO
            // U (R' F R B') (R' F' R B)
            topClock();
            rightIClock();
            frontClock();
            rightClock();
            backIClock();
            rightIClock();
            frontIClock();
            rightClock();
            backClock();
        } else if(matriz_top[0][0] == 2 && matriz_top[2][2] == 2 && matriz_left[0][2] == 2 && matriz_back[0][2] == 2){
            // 7º CASO
            // U2     (R' F R B') (R' F' R B)
            topClock180();
            rightIClock();
            frontClock();
            rightClock();
            backIClock();
            rightIClock();
            frontIClock();
            rightClock();
            backClock();
        } else if(matriz_top[2][0] == 2 && matriz_top[0][2] == 2 && matriz_front[0][2] == 2 && matriz_left[0][0] == 2){
            // 7º CASO
            // U'     (R' F R B') (R' F' R B)
            topIClock();
            rightIClock();
            frontClock();
            rightClock();
            backIClock();
            rightIClock();
            frontIClock();
            rightClock();
            backClock();
        }
        
    }
    
    
    
    
    public void permutacoesDosCantos(){
    
        int matriz_front[][] = front.getFace();
        int matriz_left[][] = left.getFace();
        int matriz_right[][] = rigth.getFace();
        int matriz_top[][] = top.getFace();
        int matriz_back[][] = back.getFace();
        int matriz_bottom[][] = bottom.getFace();
        
        
        if((matriz_back[0][0] == matriz_back[0][2]) && (matriz_front[0][0] != matriz_front[0][2]) && (matriz_right[0][0] != matriz_right[0][2]) && (matriz_left[0][0] != matriz_left[0][2])){
            // 1º CASO
            // R' F R' B2 R F' R' B2 R2
            rightIClock();
            frontClock();
            rightIClock();
            backClock180();
            rightClock();
            frontIClock();
            rightIClock();
            backClock180();
            rightClock180();
        } else if((matriz_front[0][0] == matriz_front[0][2]) && (matriz_left[0][0] != matriz_left[0][2]) && (matriz_right[0][0] != matriz_right[0][2]) && (matriz_back[0][0] != matriz_back[0][2])){
            // 1º CASO
            // U2 R' F R' B2 R F' R' B2 R2
            topClock180();
            rightIClock();
            frontClock();
            rightIClock();
            backClock180();
            rightClock();
            frontIClock();
            rightIClock();
            backClock180();
            rightClock180();
        } else if((matriz_left[0][0] == matriz_left[0][2]) && (matriz_front[0][0] != matriz_front[0][2]) && (matriz_right[0][0] != matriz_right[0][2]) && (matriz_back[0][0] != matriz_back[0][2])){
            // 1º CASO
            // U R' F R' B2 R F' R' B2 R2
            topClock();
            rightIClock();
            frontClock();
            rightIClock();
            backClock180();
            rightClock();
            frontIClock();
            rightIClock();
            backClock180();
            rightClock180();
        } else if((matriz_right[0][0] == matriz_right[0][2]) && (matriz_front[0][0] != matriz_front[0][2]) && (matriz_left[0][0] != matriz_left[0][2]) && (matriz_back[0][0] != matriz_back[0][2])){
            // 1º CASO
            // U' R' F R' B2 R F' R' B2 R2
            topIClock();
            rightIClock();
            frontClock();
            rightIClock();
            backClock180();
            rightClock();
            frontIClock();
            rightIClock();
            backClock180();
            rightClock180();
        } else if((matriz_back[0][0] != matriz_back[0][2]) && (matriz_front[0][0] != matriz_front[0][2]) && (matriz_left[0][0] != matriz_left[0][2]) && (matriz_right[0][0] != matriz_right[0][2])){
            // 2º CASO
            // R2 U R' (BU'B'U)³ R U' R2
            rightClock180();
            topClock();
            rightIClock();
            backClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
            topClock();
            backClock();
            topIClock();
            backIClock();
            topClock();
            rightClock();
            topIClock();
            rightClock180();
        }
    
    }
    
    
    
    public void permutacoesDosMeios(){
    
        int matriz_front[][] = front.getFace();
        int matriz_left[][] = left.getFace();
        int matriz_right[][] = rigth.getFace();
        int matriz_top[][] = top.getFace();
        int matriz_back[][] = back.getFace();
        int matriz_bottom[][] = bottom.getFace();
        
        if((matriz_back[0][0] ==  matriz_back[0][1] && matriz_back[0][1] == matriz_back[0][2]) && (matriz_left[0][0] == matriz_left[0][2] && matriz_left[0][2] == matriz_front[0][1]) && (matriz_left[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2]) && (matriz_front[0][0] == matriz_front[0][2] && matriz_front[0][2] == matriz_right[0][1])){
            // 1º CASO
            // F2 U(R' L F2 R L')U F2
            frontClock180();
            topClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topClock();
            frontClock180();
        } else if((matriz_right[0][0] == matriz_right[0][1] && matriz_right[0][1] == matriz_right[0][2]) && (matriz_front[0][0] == matriz_front[0][2] && matriz_front[0][2] == matriz_back[0][1]) && (matriz_front[0][1] == matriz_left[0][0] && matriz_left[0][0] == matriz_left[0][2]) && (matriz_left[0][1] == matriz_back[0][0] && matriz_back[0][0] == matriz_back[0][2])){
            // 1º CASO
            // U' F2 U(R' L F2 R L')U F2
            topIClock();
            frontClock180();
            topClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topClock();
            frontClock180();
        } else if((matriz_front[0][0] == matriz_front[0][1] && matriz_front[0][1] == matriz_front[0][2]) && (matriz_left[0][0] == matriz_left[0][2] && matriz_left[0][2] == matriz_right[0][1]) && (matriz_left[0][1] == matriz_back[0][0] && matriz_back[0][0] == matriz_back[0][2]) && (matriz_back[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2])){
            // 1º CASO
            // U2 F2 U(R' L F2 R L')U F2
            topClock180();
            frontClock180();
            topClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topClock();
            frontClock180();
        } else if((matriz_left[0][0] == matriz_left[0][1] && matriz_left[0][1] == matriz_left[0][2]) && (matriz_front[0][0] == matriz_front[0][2] && matriz_front[0][2] == matriz_right[0][1]) && (matriz_front[0][1] == matriz_back[0][0] &&  matriz_back[0][0] == matriz_back[0][2]) && (matriz_back[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2])){
            // 1º CASO
            // U F2 U(R' L F2 R L')U F2
            topClock();
            frontClock180();
            topClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topClock();
            frontClock180();
        } else if((matriz_back[0][0] == matriz_back[0][1] && matriz_back[0][1] == matriz_back[0][2]) && (matriz_right[0][0] == matriz_right[0][2] && matriz_right[0][2] == matriz_front[0][1]) && (matriz_right[0][1] == matriz_left[0][0] && matriz_left[0][0] == matriz_left[0][2]) && (matriz_left[0][1] == matriz_front[0][0] && matriz_front[0][0] == matriz_front[0][2])){
            // 3º CASO
            // F2 U'(R' L F2 R L')U' F2
            frontClock180();
            topIClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topIClock();
            frontClock180();
        } else if((matriz_right[0][0] == matriz_right[0][1] && matriz_right[0][1] == matriz_right[0][2]) && (matriz_front[0][0] == matriz_front[0][2] && matriz_front[0][2] == matriz_left[0][1]) && (matriz_front[0][1] == matriz_back[0][0] && matriz_back[0][0] == matriz_back[0][2]) && (matriz_back[0][1] == matriz_left[0][0] && matriz_left[0][0] == matriz_left[0][2])){
            // 3º CASO
            // U' F2 U'(R' L F2 R L')U' F2
            topIClock();
            frontClock180();
            topIClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topIClock();
            frontClock180();
        } else if((matriz_front[0][0] == matriz_front[0][1] && matriz_front[0][1] == matriz_front[0][2]) && (matriz_left[0][0] == matriz_left[0][2] && matriz_left[0][2] == matriz_back[0][1]) && (matriz_left[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2]) && (matriz_right[0][1] == matriz_back[0][0] && matriz_back[0][0] == matriz_back[0][2])){
            // 3º CASO
            // U2 F2 U'(R' L F2 R L')U' F2
            topClock180();
            frontClock180();
            topIClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topIClock();
            frontClock180();
        } else if((matriz_left[0][0] == matriz_left[0][1] && matriz_left[0][1] == matriz_left[0][2]) && (matriz_back[0][0] == matriz_back[0][2] && matriz_back[0][2] == matriz_right[0][1]) && (matriz_back[0][1] == matriz_front[0][0] && matriz_front[0][0] == matriz_front[0][2]) && (matriz_front[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2])){
            // 3º CASO
            // U F2 U'(R' L F2 R L')U' F2
            topClock();
            frontClock180();
            topIClock();
            rightIClock();
            leftClock();
            frontClock180();
            rightClock();
            leftIClock();
            topIClock();
            frontClock180();
        } else if((matriz_back[0][0] == matriz_back[0][2] && matriz_back[0][2] == matriz_left[0][1]) && (matriz_back[0][1] == matriz_left[0][0] && matriz_left[0][0] == matriz_left[0][2]) && (matriz_right[0][0] == matriz_right[0][2] && matriz_right[0][2] == matriz_front[0][1]) && (matriz_right[0][1] == matriz_front[0][0] && matriz_front[0][0] == matriz_front[0][2])){
            // 2º CASO
            // R' U' R'  F R F' U R F' U' L' U L F
            rightIClock();
            topIClock();
            rightIClock();
            frontClock();
            rightClock();
            frontIClock();
            topClock();
            rightClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
            frontClock();
        } else if((matriz_back[0][0] == matriz_back[0][2] && matriz_back[0][2] == matriz_right[0][1]) && (matriz_back[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2]) && (matriz_front[0][0] == matriz_front[0][2] && matriz_front[0][2] == matriz_left[0][1]) && (matriz_left[0][0] == matriz_left[0][2] && matriz_left[0][2] == matriz_front[0][1])){
            // 2º CASO
            // U' R' U' R'  F R F' U R F' U' L' U L F
            topIClock();
            rightIClock();
            topIClock();
            rightIClock();
            frontClock();
            rightClock();
            frontIClock();
            topClock();
            rightClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
            frontClock();
        } else if((matriz_back[0][0] == matriz_back[0][2] && matriz_back[0][2] == matriz_left[0][1]) && (matriz_back[0][1] == matriz_left[0][0] && matriz_left[0][0] == matriz_left[0][2]) && (matriz_front[0][0] == matriz_front[0][2] && matriz_front[0][2] == matriz_right[0][1]) && (matriz_front[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2])){
            // 2º CASO
            // U2 R' U' R'  F R F' U R F' U' L' U L F
            topClock180();
            rightIClock();
            topIClock();
            rightIClock();
            frontClock();
            rightClock();
            frontIClock();
            topClock();
            rightClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
            frontClock();
        } else if((matriz_front[0][0] == matriz_front[0][2] && matriz_front[0][2] == matriz_left[0][1]) && (matriz_front[0][1] == matriz_left[0][0] && matriz_left[0][0] == matriz_left[0][2]) && (matriz_back[0][0] == matriz_back[0][2] && matriz_back[0][2] == matriz_right[0][1]) && (matriz_back[0][1] == matriz_right[0][0] && matriz_right[0][0] == matriz_right[0][2])){
            // 2º CASO
            // U R' U' R'  F R F' U R F' U' L' U L F
            topClock();
            rightIClock();
            topIClock();
            rightIClock();
            frontClock();
            rightClock();
            frontIClock();
            topClock();
            rightClock();
            frontIClock();
            topIClock();
            leftIClock();
            topClock();
            leftClock();
            frontClock();
        } else if((matriz_back[0][0] == matriz_back[0][2] && matriz_back[0][2] == matriz_front[0][1]) && (matriz_back[0][1] == matriz_front[0][0] && matriz_front[0][0] == matriz_front[0][2]) && (matriz_left[0][0] == matriz_left[0][2] && matriz_left[0][2] == matriz_right[0][1]) && (matriz_right[0][0] == matriz_right[0][2] && matriz_right[0][2] == matriz_left[0][1])){
            // 4º CASO
            // (R2 U2)^2 R2 U (R2 U2)^2 R2 U'
            rightClock180();
            topClock180();
            rightClock180();
            topClock180();
            rightClock180();
            topClock();
            rightClock180();
            topClock180();
            rightClock180();
            topClock180();
            rightClock180();
            topIClock();
        } 
        
        
        
        //Mover o topo para "juntar" as cores certas
        
        if(matriz_front[1][1] == matriz_right[0][0]){
            topClock();
        } else if(matriz_front[1][1] == matriz_back[0][0]){
            topClock180();
        } else if(matriz_front[1][1] == matriz_left[0][0]){
            topIClock();
        }
        
        
        
    }
    
    
    
}
