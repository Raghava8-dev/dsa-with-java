package recursion;

public class subsetsum {
    public static int subsetsum(int arr[], int n, int sum) {
        if (n == 0)
            return sum == 0 ? 1 : 0;
        return subsetsum(arr, n - 1, sum) +
                subsetsum(arr, n - 1, sum - arr[n - 1]);

    }

    public static void main(String[] args) {
        int n = 3,
                arr[] = { 10, 20, 15 }, sum = 45;
        System.out.println(subsetsum(arr, n, sum));
    }

}
