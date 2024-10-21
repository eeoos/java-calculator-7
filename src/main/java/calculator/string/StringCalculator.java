package calculator.string;

public class StringCalculator {
    private final InputParser parser;
    private final NumberExtractor extractor;
    private final Calculator calculator;

    public StringCalculator() {
        this.parser = new InputParser();
        this.extractor = new NumberExtractor();
        this.calculator = new Calculator();
    }

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        String[] numbers = parser.parse(input);
        List<Integer> integers = extractor.extract(numbers);
        return calculator.sum(integers);
    }
}
