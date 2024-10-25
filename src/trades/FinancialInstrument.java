package trades;

public class FinancialInstrument {
// abstract class FinancialInstrument {
    private String symbol;
    private String name;

    public FinancialInstrument() {};

    public FinancialInstrument(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
}
