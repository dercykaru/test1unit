public class EnergyFull {
    //расчет полной энергии тела

    //скорость света км/с
    private Long c = 300_000L;
    //релятивистская масса
    protected Long m;

//    public EnergyFull(int m) {
//        this.m = m;
//    }


    //формула Эйнштейна
    public Long energy(Long m) {
        Long energy = m * c * c;
        return energy;
    }

}
