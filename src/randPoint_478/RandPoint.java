package randPoint_478;

import java.util.Arrays;
import java.util.Random;

public class RandPoint {
    public static void main(String[] args) {
        double radius=1.0,x_center=0,y_center=0;
        Solution obj = new Solution(radius, x_center, y_center);
        double[] param_1 = obj.randPoint();
        System.out.println(Arrays.toString(param_1));
    }
}
class Solution {

    double R, X, Y;
    Random random = new Random();
    public Solution(double radius, double x_center, double y_center) {
        this.R = radius;
        this.X = x_center;
        this.Y = y_center;
    }

    public double[] randPoint() {
        while (true){
            double x = random.nextDouble()*(2*R)-R;
            double y = random.nextDouble()*(2*R)-R;
            if (x*x + y*y <= R*R)
                return new double[]{X+x,Y+y};
        }
    }
}
