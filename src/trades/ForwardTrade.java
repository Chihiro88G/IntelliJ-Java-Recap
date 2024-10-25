package trades;

import java.time.LocalDate;

public class ForwardTrade extends FxTrade {
    private LocalDate settlementDate;

    public ForwardTrade(String symbol, String name, double amount, double rate) {
        super(symbol, name, amount, rate);
        this.settlementDate = LocalDate.now();
    }
}
