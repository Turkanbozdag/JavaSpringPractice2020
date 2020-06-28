package DaylyPractice;


class Emplo{
    public int salary;

}class mana extends Emplo {
    public int budget;

}
class Dire extends mana{
    public int stockOptions;
}
public class qu {
    public static void main(String[] args) {
        Emplo employee=new Emplo();
        mana manager=new mana();
        Dire director=new Dire();

    }
}
