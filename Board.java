

public class Board {
    private int[][] board;
    int k = 10;
    int c = 6;
    int m = 1;

    public static void main(String[] args) {

        Board board = new Board(); // create a new board

        System.out.println(board);

    }

    public Board() {
        // create a new board

        this.board = new int[k][c];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++) {
                this.board[i][j] = 0;
            }
        }
    }

    public void setCoordinate(int x, int y, int value) {
        this.board[x][y] = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < k; i++) {
            
            for (int j = 1; j < c; j++) {
                if (j==1){
                    sb.append(i);
                }
                if (i==1){
                    sb.append(j);
                }
                sb.append("[");
                switch (this.board[i][j]) {
                    case 0:
                        sb.append(" ");
                        break;
                    case 1:
                        sb.append("X");
                        break;
                    case 2:
                        sb.append("O");
                        break;
                }

                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}