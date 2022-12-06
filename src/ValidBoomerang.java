public class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        // bad and poorly thought out 4:40 am answer
        if (points.length != 3) return false;
        int[] first = points[0];
        int[] second = points[1];
        int[] third = points[2];

        int xChangeOne = second[0] - first[0];
        int yChangeOne = second[1] - first[1];
        if (first[0] == second[0] && first[1] == second[1]) return false;
        if (xChangeOne != yChangeOne) return true;


        int xChangeTwo = third[0] - second[0];
        int yChangeTwo = third[1] - second[1];
        if (third[0] == second[0] && third[1] == second[1]) return false;
        if (xChangeTwo != yChangeTwo) return true;

        return false;
    }

    // the following works by calculating the area of the triangle
    public boolean isBooleanGood(int[][] p){
        return (p[0][0] - p[1][0]) * (p[0][1] - p[2][1]) != (p[0][0] - p[2][0]) * (p[0][1] - p[1][1]);
    }
}
