package combinations;

public class Arithmetics
{
    int sayo_age = 35;
    int josiane_age = 18;
    int chicken_count = 30;
    double price = 23.56;
    boolean isOld = false;

    String susan_name = "Susan";
    String password = "Susan3";

    public int addition()
    {
        return sayo_age + josiane_age;
    }

    public int addition (int initial, int last )
    {
        return initial + last;
    }

    public int subtract ( int initial, int last)
    {
        return last - initial;
    }

    private int subtract( )
    {
        return subtract(4,5);
    }
}
