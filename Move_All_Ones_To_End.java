public class Move_All_Ones_To_End {
    public static void main(String[] args) {
        int[] arrNum = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int n = arrNum.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arrNum[i] != 1) {
                arrNum[count++] = arrNum[i];
            }
        }
        while (count < n) {
            arrNum[count++] = 1;
        }
        System.out.print("Array elements after moving Ones to end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrNum[i] + " ");
        }
    }
}