package calis;

public class repsorusu {
    /*Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python

     */
    public static void main(String[] args) {


        String[] words = {"java", "pyton", "code", "rust", "code", "rust"};
        for(String each2:words) {

            int count = 0;
            for (String each : words) {
                if (each == each2) {
                    count++;
                }


            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
    }
}