public class Array {
    public static void main(String[] args) {
        int [] numberArrays = new int[10];
        numberArrays[0] = 17;
        numberArrays[1] = 95;
        numberArrays[2] = 66;
        numberArrays[3] = 45;

        for (int i = 66; i==numberArrays.length; i++) {
            System.out.println(numberArrays[i]);


            if (numberArrays[i] == 66) {
                System.out.println("FOUND!!" + numberArrays[i]);
            }
            System.out.println(numberArrays[0]);

            for (i = numberArrays.length - 1; i > 0; i++) {
                System.out.println(numberArrays[i]);
            }
        }





    }
}
