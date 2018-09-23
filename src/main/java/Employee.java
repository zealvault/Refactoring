public class Employee {
    private String name;
    private ITDeclaration itDeclaration;
    private EmployeeType employeeType;

    public Employee(String name, ITDeclaration itDeclaration, EmployeeType employeeType) {
        this.name = name;
        this.itDeclaration = itDeclaration;
        this.employeeType = employeeType;
    }

    public double calculateTax(){
        double taxBracket;

        taxBracket = employeeType.equals(EmployeeType.PRIVATE) ? itDeclaration.getTaxBracket() : 15;

        double taxableAmount = itDeclaration.getCostToCompany().getCostToCompanyValue() - itDeclaration.getDeclarationUnder80C() - itDeclaration.getGetDeclarationUnder80D();

        return ((taxBracket * taxableAmount) / 100);
    }

}
