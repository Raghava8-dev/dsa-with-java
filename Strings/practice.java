
public class practice {
    public static int sum(int arr[]) {
        int n = arr.length;
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]++;

        }
        int sum = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {
                sum += arr[i];

            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 3, 2, 4 };
        System.out.println(sum(arr));

    }
}
