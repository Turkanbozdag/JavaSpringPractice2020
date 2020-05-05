public class newagainnew {
    public static void main(String[] args) {
        int month=3;
        boolean day28=month==2;
        boolean day30=month==4 && month==6 && month==9 || month==11;
        boolean day31=day28==false && day30==false;
        int day=0;
        if (day28){
            day=28;
        }
        int a=-55;
        boolean zero=a==0;
        boolean negative=a<0;
        boolean positive=a>0;
        if (zero){
            System.out.println("zero");

        }if (negative){
            System.out.println("negative");

        }
        if (positive){
            System.out.println("pozitive");
        }
        System.out.println("=======================");
        if (a==0){
            System.out.println("zero");
        }else if (a>0){
            System.out.println("positive");

        }else{
            System.out.println("negative");
        }





    }

}
