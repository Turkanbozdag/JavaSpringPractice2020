package Day23_methods;
/*mup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C			MUST use for each loop

 */
public class uniquevalues {
    public static void main(String[] args) {
            String[]arr={"A","B","C","A","D"};
            for (String each2:arr){
                int count=0;
                for (String each:arr){
                    if (each.equals(each2)){
                        count++;
                    }
                }
                if (count==1){
                    System.out.println(each2);
                }
            }






    }
}
