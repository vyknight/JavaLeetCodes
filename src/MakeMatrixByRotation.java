import java.util.Arrays;

public class MakeMatrixByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++){
            if(Arrays.deepEquals(mat, target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    private void rotate(int[][] mat){
        for(int i = 0, j = mat.length - 1; i < j; ++i, --j){
            int[] temp = mat[i];
            mat[i] = mat[j];
            mat[j] = temp;
        }
        for(int r = 0, R = mat.length; r < R; ++r){
            for(int c = r + 1; c < R; ++c){
                int temp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = temp;
            }
        }
    }
}
