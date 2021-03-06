package Resources;

import java.util.Arrays;

public class Library {
    public static int[] sortDesending(int[] arr) {//retur
        Arrays.sort(arr);//{1,2,3,4};===>{4,3,2,1};
        int[] RevArr = new int[arr.length];
        /*      i       j
        RevArr[0]=arr[3]
        RevArr[1]=arr[2]
        RevArr[2]=arr[1];
        RevArr[3]=arr[0];

         */
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        //System.out.println(Arrays.toString(RevArr));
        return RevArr;

    }

    public static String Reverse2(String str) {//return me str//can reverse a string and returns string
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;

    }

    //remove duplicates from string
    //frequency of string
    //merge two array and return third one
    //max number from array
    public static String Removeduplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    public static String RemoveDuplicates(String str) {
        String result = "";//AB
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;

            }
        }
        return result;

    }

    public static int Frequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            //we need to make that we are not counting the same index over again
        }
        return count;
    }

    public static String frequencyOfChars(String str) {
        String NonDup = Library.RemoveDuplicates(str);
        String result = "";//coantisn the frequency of chars
        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//"A"
            int num = Library.Frequency(str, ch);
            result += ch + num;
        }
        return result;
    }

    public static int frequency(String str, char ch) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
return count;

    }
}

