package SecuentialSearch;

public class SequentialSearch {
    public static void main(String[] args) {

        int[] vector = {45, 32, 54, 97, 11, 78, 21, 4};
        System.out.println("Number 45 position: ");
        Sequential(vector, 45);
        System.out.println("Number 4 position: ");
        Sequential(vector, 4);
        System.out.println("Number 99 position");
        Sequential(vector, 99);

    }

        public static void Sequential(int[] vector, int x){
            for(int i = 0; i <= vector.length; i++ ){

                if(i == vector.length){
                    System.out.println("Value not found");
                    break;
                }

                if (vector[i] == x){
                    System.out.println(i + 1);
                    break;
                }
            }
        }
}

