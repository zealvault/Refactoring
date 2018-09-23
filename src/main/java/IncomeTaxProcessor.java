public class IncomeTaxProcessor {
    private int taxBracket;

    public double calculateTax(Employee employee){
        if(employee.itDeclaration.costToCompany <= 300000){
            taxBracket = 10;
        }else if(employee.itDeclaration.costToCompany <= 600000){
            taxBracket = 20;
        }else{
            taxBracket = 30;
        }

        double taxableAmount = employee.itDeclaration.costToCompany - employee.itDeclaration.declarationUnder80C - employee.itDeclaration.getDeclarationUnder80D;

        return ((taxBracket * taxableAmount) / 100);
    }
}
