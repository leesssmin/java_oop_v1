package my;

import com._interface.HomeAppliances;
import com._interface.RemoteController;

public class Television extends HomeAppliances implements RemoteController {

    @Override
    public void turnOn() {
        System.out.println("전원 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("전원 끔");
    }


}
