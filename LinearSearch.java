import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] array = { {23,34,21},{76,32,45,67},{24,66,87,11},{34,38,76} };

        int target = 11;
        int[] answer = search(array,target);
        System.out.println(Arrays.toString(answer));

    }

    static int[] search(int[][] array, int target) {
        for(int row=0;row<array.length;row++)
        {
            for(int col=0;col<array[row].length;col++)
            {
                if(array[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
