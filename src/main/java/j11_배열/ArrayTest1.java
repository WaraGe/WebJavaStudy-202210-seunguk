package j11_배열;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        int i = 0;
        int k = numArray[i] = i++;

        for(int j=0; j < numArray.length; j++) {
            k++;
            System.out.println(k);

            for(int l =0; l < 10; l++) {
                System.out.println(numArray[l]);
            }
        }
    }
}
