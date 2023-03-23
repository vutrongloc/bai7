import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhâp vào số phần tử của mảng");
            n = scanner.nextInt();
        } while (n < 0);

        int array[] = new int[n];

        System.out.println("Nhập các phần tử vào mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        Main sort = new Main();
        sort.sortArr(n,array);
        sort.display(array);
    }


    // sắp xếp theo chiều giảm dần
    private int[] sortArr(int n, int[] arr) {
        int temp = arr[0];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]+" ");
        }
    }
}
