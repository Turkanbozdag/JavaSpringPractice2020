package day45_Exceptions;
/*
do 20 pushups
 */
public class warmUp {
    public static void main(String[] args) {
        int pushups = 0;
        while (pushups < 20) {
            System.out.println("pushup"+(pushups+1) );

            try {
                Thread.sleep(300);//burasi slowdown
            }catch(Exception e){

                }
                pushups++;


            }


        }
    }




