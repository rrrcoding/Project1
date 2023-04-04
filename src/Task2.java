public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[]{-1, 12, 45, -1, 22, 17, 9, 5, 15, 71, 39};

        for (int i = 0; i < array.length; i++) {

            //System.out.println(array[i]);
            if (array[i] >= 5 && array[i] < 15) {
                System.out.println(array[i]);

            }
        }

    }
}
