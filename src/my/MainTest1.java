package my;

import com._interface.RemoteController;
import com._interface.Television;

public class MainTest1 {

    public static void main(String[] args) {

        RemoteController[] remoteControllers = new RemoteController[1];
        remoteControllers[0] = new Television();

        for (int i = 0; i < remoteControllers.length; i++) {
            remoteControllers[i].turnOn();
        }

    }

}
