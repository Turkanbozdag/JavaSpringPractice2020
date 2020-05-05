package Day34_CustomClass;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;
    public void eating(String food){
        System.out.println(name+"is drinking "+food);
    }
    public void drinking(String drink){
        System.out.println(name+" is drinking "+drink);

    }
    public void playing(String play){
        System.out.println(name+" is playig"+name);
    }

    public void setDogInfo(String DogBread,String DogSize,int DogAge,String DogColor,String DogNAme){
        /*
        breed=DogBread;
        size=DogSize;
        age=DogAge;
        color=DogColor;
        name=DogNAme;

         */
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;
        //this keyword is used for calling object insatance variable
        /*
        public String toString(){
            return "Dog name: "+name+", breed:"+breed+", size: "+size+", color:"+color+" ,age"+age;
        }

         */


    }


}
