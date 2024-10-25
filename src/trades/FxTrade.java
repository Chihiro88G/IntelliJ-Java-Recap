package trades;

public class FxTrade extends FinancialInstrument implements Tradable {
    private double amount;
    private double rate;
    private String status;

    public FxTrade (String symbol, String name, double amount, double rate) {
        super(symbol, name);
        this.amount = amount;
        this.rate = rate;
        this.status = "Pending";
    }

    @Override
    public void execute() {
        setStatus("Executed");
    }

    @Override
    public void cancel() {
        setStatus("Canceled");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
