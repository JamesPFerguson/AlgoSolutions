public class ArrayMethods {

    public static void Main(String[] args) {
        findSumIndices(numArr, 7);
        int[] numArr = {2, 5, 8, 11, 4, 7};
    }

    public static void findSumIndices(int[] numArr,int sum) {
        int length = numArr.length;
        int halfLength = length / 2;
        int indices[] = new int[2];

        for(int i = S0; i < halfLength; i ++) {
            length -= 1;
            if (numArr[i] + numArr[length] == sum) {
                indices[0] = i;
                indices[1] = length;
                break;
            }
        }
        System.out.println(indices[0] + "--" + indices[1]);
    }

}
