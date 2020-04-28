package Day21;
/*
write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2				[10, 15, 5, 6]
				average: 9				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class Averagenumber {
    public static void main(String[] args) {
    double[]arr={1,2,2};
    double length=arr.length;
    double sum=0;
    for (int i=0;i<length;i++){
        double eachnum=arr[i];
        sum+=eachnum;

    }
        System.out.println(sum);
    double average=sum/length;
        System.out.println(average);



    }
}
