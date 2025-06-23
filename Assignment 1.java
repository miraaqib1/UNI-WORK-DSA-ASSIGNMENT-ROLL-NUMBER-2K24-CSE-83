import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        reverseArray(arr);

        System.out.print("\nReversed Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements into the stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop elements back into array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
}



