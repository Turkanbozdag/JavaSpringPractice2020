package Codiiiin.classForAnimal;

public class cat extends Pet{
    /* not inherited:

     */

    public cat(String name,int age,String color,String size,String breed){
        setInfo(name,age,color,size,breed);

    }
    public void scratch(){

        System.out.println(name+"is scratching");
    }
    public cat(){
        this("A",1,"A","B","M");
    }




}
