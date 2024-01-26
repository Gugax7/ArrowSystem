//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arrow arrow = new Arrow(20,20,20);
        Arrow arrowWithAngle = new Arrow(45,20);
        // arrow with Angle to its to put a weight in arrow with angle, i dont know yet how i can improve this.
        Arrow arrowWithAngle2 = new Arrow(arrowWithAngle.getXSpeed(),arrowWithAngle.getYSpeed(),40);
        //some tests
        System.out.println("The arrow had reached " + arrow.distanceTraveled() + " meters");
        System.out.println("The impulse that bow caused in the arrow was " + arrow.impulseFromBow() + " Ns");
        System.out.println("Total speed of arrow was " + arrow.getTotalSpeed() + " m/s");
        System.out.println(arrow.getAngleOfThrow());
        System.out.println("The arrow had reached " + arrowWithAngle.distanceTraveled() + " meters");
        System.out.println("The impulse that bow caused in the arrow was " + arrowWithAngle2.impulseFromBow() + " Ns");
        System.out.println("Total speed of arrow was " + arrowWithAngle.getTotalSpeed() + " m/s");
        System.out.println(arrowWithAngle.getAngleOfThrow());
    }
}