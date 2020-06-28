package DaylyPractice;

public final class Dog extends Animal {//dog class baska yerde inhiritated yapmamak icin final yazdik
    public String dogName;//uniq oldugu icin bunu yaziyoz
    public Dog(String dogName,int age,String gender){//constructor burasi
        this.dogName=dogName;
        this.age=age;
        this.gender=gender;
    }

   // public void eat(){
      //  System.out.println("Dog "+dogName+" is eating");
    //}
    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }
    public void bark(){
        System.out.println("Dog  "+dogName+" is barking");
    }







}
