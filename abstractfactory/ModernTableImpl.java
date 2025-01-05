package abstractfactory;

public class ModernTableImpl implements Table{
    @Override
    public void putOn() {
        System.out.println("Modern style table");
    }
}
