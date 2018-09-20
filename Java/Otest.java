public class Otest {

    public static int loopCount = 0;
    public static int nestedLoopCount = 0;
    public static int tripleCount = 0;

    public static void main(String[] args) {
        // This section is O(n)
        for (int i = 0; i < 10; i++) {
            loopCount++;
        }
        for (int i = 0; i < 10; i++) {
            loopCount++;
        }
        System.out.println(loopCount);

        // This section is O(n^2)
        for (int i = 0; i < 10; i++) {
            nestedLoopCount++;
            for (int j = 0; j < 10; j++) {
                nestedLoopCount++;
            }
        }
        System.out.println(nestedLoopCount);

        // This section is O(n^3)
        for (int i = 0; i < 10; i++) {
            tripleCount++;
            for (int j = 0; j < 10; j++) {
                tripleCount++;
                for (int k = 0; k < 10; k++) {
                    tripleCount++;
                }
            }
        }

        System.out.println(tripleCount);

    }

}