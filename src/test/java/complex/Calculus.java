package complex;

import combinations.Arithmetics;
import operations.Mathematics;

public class Calculus extends Arithmetics


{   Mathematics mathematics = new Mathematics();

    public int multiple ()
        {
            return addition(4,5) * mathematics.multiplication(4,5);
        }
}
