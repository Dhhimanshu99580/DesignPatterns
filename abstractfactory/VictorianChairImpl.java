package abstractfactory;

public class VictorianChairImpl implements Chair{
    @Override
    public void sitOn() {
        System.out.println("I am sitting on Victorian style chair");
    }
}
