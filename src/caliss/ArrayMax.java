package caliss;

public class ArrayMax {
  //  public static void main(String[] args) {


        public static int maxValue ( int[] n){
            int max = Integer.MIN_VALUE;
            for (int each : n)
                if (each > max)
                    max = each;
            return max;
        }


    }
