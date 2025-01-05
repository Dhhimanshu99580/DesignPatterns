package abstractfactory;

public class ArtDecoFactoryImpl implements Factory{
    @Override
    public Chair createChair() {
        return new ArtDecoChairImpl();
    }
    @Override
    public Table createTable() {
        return new ArtDecoTableImpl();
    }
    @Override
    public Sofa createSofa() {
        return new ArtDecoSofaImpl();
    }
}
