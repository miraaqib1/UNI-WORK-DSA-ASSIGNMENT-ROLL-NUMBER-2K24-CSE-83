public class RecursiveArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 9, 7, 6};
        int sum = findSum(numbers, numbers.length);

        System.out.print("Array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("\nSum of elements: " + sum);
    }

    static int findSum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + findSum(arr, n - 1);
        }
    }
}