import java.util.Scanner;

public class Hopscotch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfData = scanner.nextInt();
        int[] hopscotchArray = new int[sizeOfData];

        for(int i = 0; i < sizeOfData; i++)
        {
            hopscotchArray[i] = scanner.nextInt();
        }

//        for(int i =0; i < sizeOfData; i++)
//        {
//            System.out.println(hopscotchArray[i]);
//        }

        int[] coolerHopscotchArray = new int[sizeOfData - 2];
        for(int i = 2; i < sizeOfData; i++)
        {
            coolerHopscotchArray[i - 2] = hopscotchArray[i];
        }

        int[] S = new int[sizeOfData - 2];

        for(int j = 0; j < sizeOfData - 2; j++)
        {
            if (j <= 1)
            {
                S[j] = coolerHopscotchArray[j];
            } else if (j == 2) {
                S[j] = coolerHopscotchArray[j] + S[j - 2];
            }
            else if (j > 2) {
                S[j] = Math.max(coolerHopscotchArray[j] + S[j-2], coolerHopscotchArray[j] + S[j - 3]);
            }
        }

//        for(int i =0; i < sizeOfData - 2; i++)
//        {
//            System.out.println(S[i]);
//        }

        System.out.println(S[sizeOfData - 2 - 1] + hopscotchArray[0]);
        scanner.close();
    }

}