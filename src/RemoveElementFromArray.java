
import java.util.Arrays;
public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] numbers = { 100, 200, 300, 400, 500 , 1000 };
        int i1 = 500;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == i1) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers = Arrays.copyOf(numbers, numbers.length - 1);
            System.out.println(Arrays.toString(numbers));
        } else {
            System.out.println("Không tìm thấy phần tử trong mảng này.");
        }
    }
}
