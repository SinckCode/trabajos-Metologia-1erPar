import java.util.Scanner;

public class CaraEscudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        int[] result = findLongestSequence(input);

        System.out.println(result[0] + " " + (result[1]-1));
    }

    private static int[] findLongestSequence(String input) {
        int maxLength = 0;
        int startingPosition = 0;

        for (int position = 1; position <= input.length() / 2; position++) {
            String subsequence = input.substring(0, position);
            int sequenceLength = findSequenceLength(subsequence, input);

            if (sequenceLength > maxLength) {
                maxLength = sequenceLength;
                startingPosition = position;
            }
        }

        return new int[]{maxLength, startingPosition};
    }

    private static int findSequenceLength(String subsequence, String input) {
        int length = 0;
        int position = 0;

        while (position <= input.length() - subsequence.length()) {
            if (input.substring(position, position + subsequence.length()).equals(subsequence)) {
                length++;
                position += subsequence.length();
            } else {
                break;
            }
        }

        return length;
    }
}
