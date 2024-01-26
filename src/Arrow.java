public class Arrow {
    private double xSpeed;
    private double ySpeed;
    private double weight;
    private double tSpeed;
    private double angleInDegrees = -1;

    public Arrow(double xSpeed, double ySpeed, double weight) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.weight = weight;
    }

    public double getAngleInDegrees() {
        return angleInDegrees;
    }

    public Arrow(double angleInDegrees, double tSpeed){
        this.tSpeed = tSpeed;
        this.angleInDegrees = angleInDegrees;
        this.weight = 20; // default weight, I will change it later.
        xSpeed = tSpeed * Math.cos(Math.toRadians(angleInDegrees));
        ySpeed = tSpeed * Math.sin(Math.toRadians(angleInDegrees));
    }
    public double distanceTraveled(){
        double time = this.ySpeed / 5;
        return xSpeed*time;
    }
    public double totalSpeed(){
        return Math.sqrt((xSpeed*xSpeed)+(ySpeed*ySpeed));
    }
    public double impulseFromBow(){
        return totalSpeed() * weight;
    }
    public double angleOfThrow(){
        if(angleInDegrees != -1){
            return angleInDegrees;
        }
        double tan = ySpeed/xSpeed;
        double radians = Math.atan(tan);
        return Math.toDegrees(radians);
    }
}
