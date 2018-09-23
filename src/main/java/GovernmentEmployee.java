public class GovernmentEmployee implements Taxable{
    private ITDeclaration itDeclaration;

    public GovernmentEmployee(ITDeclaration itDeclaration) {
        this.itDeclaration = itDeclaration;
    }

    @Override
    public double calculateTax() {
        double taxBracket = 15;
        double taxableAmount = itDeclaration.getCostToCompany().getCostToCompanyValue() - itDeclaration.getDeclarationUnder80C() - itDeclaration.getGetDeclarationUnder80D();
        return ((taxBracket * taxableAmount) / 100);
    }
}
