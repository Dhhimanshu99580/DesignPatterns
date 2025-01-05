package abstractfactory;

import javax.sound.midi.Soundbank;

public class ArtDecoChairImpl implements Chair{
    @Override
    public void sitOn() {
        System.out.println("I am sitting on Art Deco chair");
    }
}
