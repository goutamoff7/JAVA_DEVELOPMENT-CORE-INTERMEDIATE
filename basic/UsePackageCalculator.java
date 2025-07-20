package basic;
import packages.cal.addition.Addition;
import packages.cal.subtraction.Subtraction;
import packages.cal.multiplication.Multiplication;
import packages.cal.division.Division;;
class UsePackageCalculator{
    public static void main(String[] args) {

        new Addition().add(5,7);
        new Subtraction().sub(5,7);
        new Multiplication().mul(5,7);
        new Division().div(5,7);
        
    }
}