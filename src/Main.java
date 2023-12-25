
public class Main {
    public static int binarySearch(int list[], int value) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (value < list[mid]) {
                high = mid - 1;
            } else if (value == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6, 7, 7, 8};
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,3));
        System.out.println(binarySearch(list,4));
        System.out.println(binarySearch(list,5));
    }
}