public class PrivateEmployee implements Taxable {
    private ITDeclaration itDeclaration;

    public PrivateEmployee(ITDeclaration itDeclaration) {
        this.itDeclaration = itDeclaration;
    }

    @Override
    public double calculateTax() {
        double taxBracket;

        taxBracket = itDeclaration.getTaxBracket();
        double taxableAmount = itDeclaration.getCostToCompany().getCostToCompanyValue() - itDeclaration.getDeclarationUnder80C() - itDeclaration.getGetDeclarationUnder80D();

        return ((taxBracket * taxableAmount) / 100);
    }
}
