import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Define a list of integers with duplicates
        List<Integer> integers = new ArrayList<>();
        integers.add(42); //duplicated
        integers.add(42); //duplicated
        integers.add(142);//duplicated
        integers.add(142);//duplicated
        integers.add(252);
        integers.add(700);
        integers.add(300);
        integers.add(314);

        try {
            //set to remove duplicates
            Set<Integer> uniqueIntegers = new HashSet<>(integers);
            //calculate sum of integers
            double sum = 0; //set sum to 0 in the beginning, double for decimals later
            for (int num : uniqueIntegers) {
                sum += num;
            }
            //calculate the average of integers
            double average = sum / uniqueIntegers.size();

            //print the sum, average, and the list of integers without duplicates
            System.out.println("sum: " + sum);
            System.out.println("average: " + average);
            System.out.println("list of integers that are not duplicated: " + uniqueIntegers);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bounds: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
