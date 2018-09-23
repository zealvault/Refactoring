public class BracketB extends CostToCompany {
    private double costToCompanyValue;

    public BracketB(double costToCompanyValue) {

        this.costToCompanyValue = costToCompanyValue;
    }

    @Override
    public double getTaxBracket() {
        return 20;
    }

    public double getCostToCompanyValue() {
        return costToCompanyValue;
    }
}
