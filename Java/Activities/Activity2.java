package Activities;

public class Activity2 {
    public static void main(String[] args) {
    int[] a={10, 77, 10, 54, -11, 10};
          //  System.out.println("Array: " + Arrays.toString(a));
          int find = 10;
          int Sum = 30;

          System.out.println("Result: " + result(a, find, Sum));

}
 public static boolean result ( int[] nums, int find, int Sum){
            int temp_sum = 0;
            //Loop through array
            for (int number : nums) {
                //If value is 10
                if (number == find) {
                    //Add them
                    temp_sum += find;
                }

                //Sum should not be more than 30
                if (temp_sum > Sum) {
                    break;
                }
            }

            //Return true if condition satisfies
            return temp_sum == Sum;
        }
}
