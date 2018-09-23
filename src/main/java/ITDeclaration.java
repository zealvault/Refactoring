
public class ITDeclaration {
    private CostToCompany costToCompany;
    private Double declarationUnder80C;
    private Double getDeclarationUnder80D;

    public CostToCompany getCostToCompany() {
        return costToCompany;
    }

    public Double getDeclarationUnder80C() {
        return declarationUnder80C;
    }

    public Double getGetDeclarationUnder80D() {
        return getDeclarationUnder80D;
    }

    public CostToCompany setCostToCompany(double costToCompany) {
        if(costToCompany <= 300000){
            return new BracketA(costToCompany);
        } else if(costToCompany <= 600000){
            return new BracketB(costToCompany);
        }else{
            return new BracketC(costToCompany);
        }
    }



    public ITDeclaration(Double costToCompany, Double declarationUnder80C, Double getDeclarationUnder80D) {
        this.costToCompany = setCostToCompany(costToCompany);
        this.declarationUnder80C = declarationUnder80C;
        this.getDeclarationUnder80D = getDeclarationUnder80D;
    }

    public double getTaxBracket() {
       return costToCompany.getTaxBracket();
    }
}
