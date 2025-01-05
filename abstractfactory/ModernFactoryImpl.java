package abstractfactory;

public class ModernFactoryImpl implements Factory{
    @Override
    public Chair createChair() {
        return new ModernChairImpl();
    }
    @Override
    public Table createTable() {
        return new ModernTableImpl();
    }
    @Override
    public Sofa createSofa() {
        return new ModernSofaImpl();
    }
}
