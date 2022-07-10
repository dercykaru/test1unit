public class Mayatnik {
    //расчет периода колебаний математического маяника

    //int g = 10;
    final int pi = 3;

    public int period(int l, int g) {
        int T = (int) (2 * pi * Math.sqrt(l / g));
        return T;
    }

}
