package Practice1.task02;
/* create a class called person
nam,age,gender
method eat,walk,sleep,setpersonInfo

 */
public class Person {
   public String name;
   public int age;
   public char gender;
        public void setPersonInfo(String name,int age,char gender){
            this.name=name;
            this.age=age;
            this.gender=gender;
        }

        public void eat(String food){
            System.out.println(name+"is eating "+food);
        }
        public void sleep(){
            System.out.println(name+"is sleeping");
        }
        public void walk(){
            System.out.println(name+"is walking");
        }
        public void drink(String drink ){
            System.out.println(name+"is drinking");

        }




}
