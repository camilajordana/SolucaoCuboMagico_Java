public class Face {

    int[][] face = new int[3][3];
    private int aux1;
    private int aux2;

    public Face(int[][] face) {
        this.face = face;
    }

    public int[][] getFace() {
        return face;
    }

    public void turnClock(){
        //girando os elementos das pontas
        aux1 = face[0][0];
        aux2 = face[0][2];
        face[0][2] = aux1;
        aux1 = face[2][2];
        face[2][2] = aux2;
        aux2 = face[2][0];
        face[2][0] = aux1;
        face[0][0] = aux2;

        //girando os elementos do meio
        aux1 = face[0][1];
        aux2 = face[1][2];
        face[1][2] = aux1;
        aux1 = face[2][1];
        face[2][1] = aux2;
        aux2 = face[1][0];
        face[1][0] = aux1;
        face[0][1] = aux2;
    }

    public void turnClock180() {
        turnClock();
        turnClock();
    }

    public void turnIClock(){
        turnClock();
        turnClock();
        turnClock();
    }

    public int[] getTop() {
        int top[] = {face[0][0], face[0][1], face[0][2]};
        return top;
    }

    public int[] getTopI() {
        int top[] = {face[0][2], face[0][1], face[0][0]};
        return top;
    }

    public void setTop(int top[]) {
        face[0][0] = top[0];
        face[0][1] = top[1];
        face[0][2] = top[2];
    }

    public int[] getBottom() {
        int bottom[] = {face[2][0], face[2][1], face[2][2]};
        return bottom;
    }

    public int[] getBottomI() {
        int bottom[] = {face[2][2], face[2][1], face[2][0]};
        return bottom;
    }

    public void setBottom(int bottom[]) {
        face[2][0] = bottom[0];
        face[2][1] = bottom[1];
        face[2][2] = bottom[2];
    }

    public int[] getCenterH() {
        int centerH[] = {face[1][0], face[1][1], face[1][2]};
        return centerH;
    }

    public void setCenterH(int centerH[]) {
        face[1][0] = centerH[0];
        face[1][1] = centerH[1];
        face[1][2] = centerH[2];
    }

    public int[] getLeft() {
        int left[] = {face[0][0], face[1][0], face[2][0]};
        return left;
    }

    public int[] getLeftI() {
        int left[] = {face[2][0], face[1][0], face[0][0]};
        return left;
    }

    public void setLeft(int left[]) {
        face[0][0] = left[0];
        face[1][0] = left[1];
        face[2][0] = left[2];
    }

    public int[] getRight() {
        int right[] = {face[0][2], face[1][2], face[2][2]};
        return right;
    }

    public int[] getRightI() {
        int right[] = {face[2][2], face[1][2], face[0][2]};
        return right;
    }

    public void setRight(int right[]) {
        face[0][2] = right[0];
        face[1][2] = right[1];
        face[2][2] = right[2];
    }

    public int[] getCenterV() {
        int centerV[] = {face[0][1], face[1][1], face[2][1]};
        return centerV;
    }

    public void setCenterV(int centerV[]) {
        face[0][1] = centerV[0];
        face[1][1] = centerV[1];
        face[2][1] = centerV[2];
    }

}