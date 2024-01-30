import java.util.*;

public class Development {
    public static void main(String[] args) {
        int[] diagramData = {1, 2, 1, 1, 3, 2};
        System.out.println("max index of diagramData = " +
                           findMaxIndex(diagramData));
        System.out.println("counts array for diagramData = " +
                           Arrays.toString(getCounts(diagramData)));

        int[] exampleData = {1, 0, 1, 5, 4, 4, 2, 3, 5, 1};
        System.out.println("max index of exampleData = " +
                           findMaxIndex(exampleData));
        System.out.println("counts array for exampleData = " +
                           Arrays.toString(getCounts(exampleData)));
    }

    public static int findMaxIndex(int[] data) {
        // TODO: implement this method--edit this return statement appropriately
        return 0;
    }

    public static int[] getCounts(int[] data) {
        // TODO: implement this method--edit this return statement appropriately
        return new int[]{};
    }
}
