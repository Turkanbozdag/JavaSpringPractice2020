package Day34_CustomClass;

public class DogObhject2 {
    public static void main(String[] args) {
        String food1="chicken";
        String food2="fish";

        String drink1="milk";
        String drink2="coffee";

        String toy1="Ps4";
        String toy2="piano";

        String subject="java";
        String subject2="Art";

        Dog dog1=new Dog();
        dog1.setDogInfo("alabay","extra big",5,"brown","ajdar");

        Dog dog2=new Dog();
        dog2.setDogInfo("chihua hua","smal",1,"brown","tuzik");
        dog2.eating(food1);
        dog1.eating(food2);

        dog2.drinking(drink2);
        dog1.drinking(drink1);

        dog2.playing(toy2);
        dog1.playing(toy1);
        Dog dog3=new Dog();
        dog3.setDogInfo("poodle","miniature",5,"white","lucky");

        Dog dog4=new Dog();
        dog4.setDogInfo("kangal","huge",5,"white","comar");
        System.out.println("==================");
        Dog[]dogpark={dog1,dog2,dog3,dog4};


        for (int i=0;i<dogpark.length;i++) {
            dogpark[i].eating("chicken");
        }
        for (Dog each:dogpark){
            each.drinking("water");
        }
        for (int i=0; i<dogpark.length;i++){
            dogpark[i].playing("football");

        }
        for (Dog each:dogpark){
           // each.studying(subject1);
        }
    }
}
