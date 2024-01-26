//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arrow arrow = new Arrow(5*Math.sqrt(3),5,20);
        Arrow arrowWithAngle = new Arrow(30,10);
        System.out.println("The arrow had reached " + arrow.distanceTraveled() + " meters");
        System.out.println("The impulse that bow caused in the arrow was " + arrow.impulseFromBow() + " Ns");
        System.out.println("Total speed of arrow was " + arrow.totalSpeed() + " m/s");
        System.out.println(arrow.angleOfThrow());
        System.out.println("The arrow had reached " + arrowWithAngle.distanceTraveled() + " meters");
        System.out.println("The impulse that bow caused in the arrow was " + arrowWithAngle.impulseFromBow() + " Ns");
        System.out.println("Total speed of arrow was " + arrowWithAngle.totalSpeed() + " m/s");
        System.out.println(arrowWithAngle.angleOfThrow());
    }
}