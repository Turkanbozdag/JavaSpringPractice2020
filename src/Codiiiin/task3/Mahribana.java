package Codiiiin.task3;

 class Mahribana {
   void methodA(){
        System.out.println("Method A");

    }
}
  class AccessModifiers extends Mahribana{
    /*
    void methodA(){
        System.out.println("Method A");
    }

     */
    @Override
    public void methodA(){
        System.out.println("method A");
    }
}
