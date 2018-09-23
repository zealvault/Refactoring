import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

    @Test
    public void itShouldBeAbleToCalculateTaxOfAnEmployee() {
        //given
        ITDeclaration itDeclaration = new ITDeclaration(753000.00,150000.00, 0.00);
        Employee employee = new Employee("Vishal", itDeclaration, EmployeeType.PRIVATE);
        //when
        double tax = employee.calculateTax();
        //then
        Assert.assertEquals(180900.0, tax, 0);

    }

    @Test

    public void itShouldBeAbleToCalculateFlatTaxOfAGovernmentEmployee() {
        //given
        ITDeclaration itDeclaration = new ITDeclaration(753000.00,150000.00, 0.00);
        Employee employee = new Employee("Vishal", itDeclaration, EmployeeType.GOVERNEMNT);
        //when
        double tax = employee.calculateTax();
        //then
        Assert.assertEquals(90450.0, tax, 0);
    }


}