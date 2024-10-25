package trades;

import java.time.LocalDate;
import java.util.Date;

public class SpotTrade extends FxTrade {
    private LocalDate settlementDate;

    public SpotTrade(String symbol, String name, double amount, double rate) {
        super(symbol, name, amount, rate);
        this.settlementDate = LocalDate.now().plusDays(2);
    }
}
