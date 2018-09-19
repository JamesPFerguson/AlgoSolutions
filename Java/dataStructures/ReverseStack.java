public class ReverseStack {

    private int top = -1;
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
        this.top--;
        return this.letters[top + 1];
    }

    public char push(char letter) {
        this.top++;
        return this.letters[this.top] = letter;
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