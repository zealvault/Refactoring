public class Employee {
    private String name;
    private ITDeclaration itDeclaration;
    private EmployeeType employeeType;
    private Taxable taxable;

    public Employee(String name, ITDeclaration itDeclaration, EmployeeType employeeType) {
        this.name = name;
        this.itDeclaration = itDeclaration;
        this.employeeType = employeeType;
        this.taxable = setTaxable(employeeType);
    }

    public double calculateTax() {
        return taxable.calculateTax();
    }

    public Taxable setTaxable(EmployeeType employeeType) {
        if (employeeType.equals(EmployeeType.PRIVATE)) {
            return new PrivateEmployee(itDeclaration);
        } else {
            return new GovernmentEmployee(itDeclaration);
        }
    }
}
