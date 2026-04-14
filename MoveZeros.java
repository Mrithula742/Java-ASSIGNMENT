public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        int index = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != 0) 
            {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
         }
        for (int num : arr)
            System.out.print(num + " ");
    }
}