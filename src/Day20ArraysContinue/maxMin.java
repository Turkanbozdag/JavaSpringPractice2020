package Day20ArraysContinue;
/*
write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
 */
public class maxMin {
    public static void main(String[] args) {
int[]arr={2,3,4,5,6,7,8,9};
int lastindex=arr.length-1;//array icin
int max=arr[0];//2
int min=arr[0];
for (int i=0;i<=lastindex;i++){//last index length-1 ile bulunur
    if (arr[i]>=max){//after here you can find max,arrays index are copared with eah other,
        max=arr[i];
    }
    if (arr[i]<min){//min
      min=arr[i];
    }
}
        System.out.println(max);
        System.out.println(min);







    }
}
