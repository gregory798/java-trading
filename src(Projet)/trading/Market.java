package trading;

public class Market {

    private String name;
    private double marketFactor; // Un facteur représentant les conditions du marché

    public Market(String name, double marketFactor) {
        this.name = name;
        this.marketFactor = marketFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Méthode qui collabore avec Trader
    public double calculateAdjustedPnL(Trader trader) {
        // Obtient le P&L du trader et on l'ajuste en fonction du marketFactor
        double traderPnL = trader.getPnl();
        return traderPnL * marketFactor; // Ajuste le PnL basé sur le facteur du marché
    }

}
