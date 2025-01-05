package abstractfactory;

public class Main {
    public static void main(String [] args) {
        Factory modernFactory = new ModernFactoryImpl();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        Table modernTable = modernFactory.createTable();
        modernChair.sitOn();
        modernSofa.lieOn();
        modernTable.putOn();
    }
}
