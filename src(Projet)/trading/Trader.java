package trading;

public class Trader {
    // Attributs de la classe
    private String[] portfolio; // Tableau de chaînes représentant le portefeuille
    private double pnl; // Profit et perte

    // Ajout d'un attribut pour la relation unidirectionnelle avec Market
    private Market market;

    // Constructeur
    public Trader(String[] portfolio, double pnl) {
        this.portfolio = portfolio;
        this.pnl = pnl;
        this.market = null; // Initialement, le trader n'est associé à aucun marché
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    // Accesseurs (getters) et mutateurs (setters)
    public String[] getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String[] portfolio) {
        this.portfolio = portfolio;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    // Méthode d'exemple pour manipuler les attributs
    public void updatePortfolio(String newAsset) {
        // Ajoute un nouvel actif au portefeuille
        String[] newPortfolio = new String[this.portfolio.length + 1];
        System.arraycopy(this.portfolio, 0, newPortfolio, 0, this.portfolio.length);
        newPortfolio[this.portfolio.length] = newAsset;
        this.portfolio = newPortfolio;
    }

    // Méthode pour afficher les informations du trader
    public void displayInfo() {
        System.out.println("Portfolio: ");
        for (String asset : portfolio) {
            System.out.println("- " + asset);
        }
        System.out.println("PnL: " + pnl);
    }

    // Méthode qui collabore avec Market
    public double getAdjustedPnL() {
        if (this.market != null) {
            return this.market.calculateAdjustedPnL(this);
        } else {
            return pnl; // Retourne le PnL sans ajustement si aucun marché n'est associé
        }
    }
}
