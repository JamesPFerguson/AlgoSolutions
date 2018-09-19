public class ReverseStack {

    private int count = -1;
    private String word;
    private char[] letters;
    private char[] reversedLetters;
    private String reversedWord;

    public static void main(String[] args) {
        ReverseStack reverser = new ReverseStack("Elementary");
        System.out.println(reverser.reverseLetters());
    }

    public ReverseStack(String word) {
        this.word = word;
        this.letters = word.toCharArray();
        this.reversedLetters = new char[letters.length];
    }

    public char pop() {
        this.count--;
        return this.letters[count + 1];
    }

    public char push(char letter) {
        this.count++;
        return this.letters[this.count] = letter;
    }

    // This is far from the best way to reverse a string since it loops twice. This
    // is primarily an exercise in Stacks
    // rather than efficiency.
    public String reverseLetters() {

        for (int i = 0; i < this.word.length(); i++) {
            this.push(this.letters[i]);
        }

        for (int i = 0; i < this.word.length(); i++) {
            this.reversedLetters[i] = this.pop();
        }
        this.reversedWord = String.valueOf(reversedLetters);
        return this.reversedWord;
    }

}