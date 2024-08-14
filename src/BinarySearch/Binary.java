package BinarySearch;

public class Binary {
    public static void main(String[] args){
        // Vector must be sorted in ascending order
        int[] vector = {4, 11, 21, 32, 45, 54, 78, 97};
        System.out.println("number 11 position: ");
        binary(vector, 11);
        System.out.println("number 42 position: ");
        binary(vector, 97);
        System.out.println("number 69 position");
        binary(vector, 69);
    }

    public static void binary(int[] vector, int x){
        int start = 0;
        int half;
        int end = vector.length;

        while(start <= end){
            half = (start + end)/2;

            if(vector[half] == x){
                System.out.println(half);
                break;
            } else if (x < vector[half]){
                end = half - 1;
            } else {
                start = half + 1;
            }

            if(start > end){
                System.out.println("Element not found");
            }
        }
    }
}
