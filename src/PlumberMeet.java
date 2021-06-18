import java.util.Scanner;

public class PlumberMeet {
    public static void main(String[] args){
        PlumberController controller = new PlumberController();
        controller.callPlumber();
        controller.start();
        controller.finish();
    }
}