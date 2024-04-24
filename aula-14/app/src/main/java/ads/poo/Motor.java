package ads.poo;

public class Motor {

    private int hp;
    private int cc;

    public Motor(int hp, int cc){
        this.hp = hp;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return  "hp=" + hp +
                ", cc=" + cc +
                '}';
    }
}
