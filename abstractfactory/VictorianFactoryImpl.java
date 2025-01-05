package abstractfactory;

public class VictorianFactoryImpl implements Factory{
    @Override
    public Chair createChair() {
        return new VictorianChairImpl();
    }
    @Override
    public Table createTable() {
        return new VictorianTableImpl();
    }
    @Override
    public Sofa createSofa() {
        return new VictorianSofaImpl();
    }
}
