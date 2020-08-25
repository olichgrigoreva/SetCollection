package lesson;

public class BracesChecker {
    public static void main(String[] args) {
        String[] examples = {
                "a[b,c]", //good
                "(a){z}", //good
                "{)[]()}", //bad
                "[some[text]]]]]", //bad
                "9",
                "("
        };
        BracesChecker bracesChecker = new BracesChecker();
        for (String example : examples) {
            System.out.printf("phrase \"%s\" is %s %n", example, bracesChecker.check(example));
        }
    }

    private boolean check(String example) {
        Stack stack = new Stack(100);
        //нужно сделать проверку для каждого символа строки
        for (int i = 0; i < example.length(); i++) {
            char ch = example.charAt(i);
            switch (ch) {
                case '[':
                case '(':
                case '{':
                    stack.push(ch);
                    break;
                case ']':
                case ')':
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (!checkBrace(stack.pop(), ch)) {
                        return false;
                    }
            }
        }
        return stack.isEmpty(); //для последнего кейса
    }

    private boolean checkBrace(char ch, char ch2) {
        return (ch == '[' && ch2 == ']') || (ch == '(' && ch2 == ')') || (ch == '{' && ch2 == '}');

    }
}
