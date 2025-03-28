public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }
}
// This is a test.
// A test comment to test Jenkins
// A second test comment since the first one didn't work
// Third comment
// Fourth comment
// Fifth comment
// 6th
