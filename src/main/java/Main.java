public class Main {
    public static void main(String[] args) {
        System.out.println("Программа помощи физику");

        //расчет полной энергии тела E = m * c^2.
        System.out.print("Полная энергия тела массы 10кг, [Дж] = ");
        Long E = new EnergyFull().energy(10L);
        System.out.println("E = " + E);
        System.out.println();

        //расчет периода колебаний математического маятника
        System.out.print("Период колебаний маятника [c] = ");
        Mayatnik periodT = new Mayatnik();
        double T = periodT.period(50, 10);
        System.out.println("T = " + T);
        System.out.println();
    }
}
