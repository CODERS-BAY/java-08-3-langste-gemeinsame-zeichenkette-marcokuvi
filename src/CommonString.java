public class CommonString {

    public String getLongestCommonString(String string1, String string2) {

        int stringOneLength = string1.length();
        int stringTwoLength = string2.length();

        int max = 0;

        int[][] duplicate = new int[stringOneLength][stringTwoLength];
        int endOfString = -1;
        for (int i = 0; i < stringOneLength; i++) {
            for (int j = 0; j < stringTwoLength; j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        duplicate[i][j] = 1;
                    } else {
                        duplicate[i][j] = duplicate[i - 1][j - 1] + 1;
                    }
                    if (max < duplicate[i][j]) {
                        max = duplicate[i][j];
                        endOfString = i;
                    }
                }
            }
        }
        return string1.substring(endOfString - max + 1, endOfString + 1);
    }
}
