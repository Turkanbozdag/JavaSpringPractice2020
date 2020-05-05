package Day33_CustomClass;

public class Car {
    String Brand;
    String model;
    int year;
    String color;
    public void start(){
        System.out.println(Brand+" is started");
    }
    public void drive(){
        System.out.println("Driving "+Brand+" "+model);
    }
   // public static void main(String[] args) {
       //int a=100;//local variable
   // }
    public void getCarInfo() {
        //System.out.println("Brand of the car is:"+Brand);
        // System.out.println("model of the car is"+model);
        System.out.println(year + " " + Brand + " " + model + "" + color);
    }//profecnal
        public void setCarInfo(String carBrand,String carModel,int caryear,String carColor){
            Brand = carBrand;
            model = carModel;
            year = caryear;
            color = carColor;


        }
        public String toString(){
            String result=Brand+" "+year+""+model+""+color;
            return result;
        }
        public static void main(String[]args){
            int a=100;//local variable
        }



    }

