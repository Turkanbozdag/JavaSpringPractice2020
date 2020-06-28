package DaylyPractice;
//if animal class abstracx what happen
public abstract class Animal {//2 variable ,2 instance method
    public int age;
    public String gender;
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){
        System.out.println("Animal Class");
    }
}
