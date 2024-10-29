package trades;

//public class FinancialInstrument {
 abstract class FinancialInstrument {
    private String symbol;
    private String name;

    public FinancialInstrument() {};

    public FinancialInstrument(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // needs to be overridden by child classes or child class needs to be declared as abstract
    public abstract void TestMethod();
}
