public class BracketA extends CostToCompany {
    private double costToCompanyValue;

    public BracketA(double costToCompanyValue) {

        this.costToCompanyValue = costToCompanyValue;
    }

    public double getCostToCompanyValue() {
        return costToCompanyValue;
    }

    @Override
    public double getTaxBracket() {
        return 10;
    }
}
