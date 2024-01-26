public class Arrow {
    private double xSpeed;
    private double ySpeed;
    private double weight;
    private double totalSpeed;
    private double angleOfThrow;


    public Arrow(double xSpeed, double ySpeed, double weight) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.weight = weight;
        this.angleOfThrow = angleInDegrees();
        this.totalSpeed = calculateTotalSpeed();
    }

    public double getAngleInDegrees() {
        return angleOfThrow;
    }

    public Arrow(double angleInDegrees, double totalSpeed){
        this.totalSpeed = totalSpeed;
        this.angleOfThrow = angleInDegrees;
        xSpeed = totalSpeed * Math.cos(Math.toRadians(angleInDegrees));
        ySpeed = totalSpeed * Math.sin(Math.toRadians(angleInDegrees));
    }
    public double distanceTraveled(){
        double time = this.ySpeed / 5;
        return xSpeed*time;
    }
    private double calculateTotalSpeed(){
        return Math.sqrt((xSpeed*xSpeed)+(ySpeed*ySpeed));
    }
    public double impulseFromBow(){
        return totalSpeed * weight;
    }
    private double angleInDegrees(){
        double tan = ySpeed/xSpeed;
        double radians = Math.atan(tan);
        return Math.toDegrees(radians);
    }

    public double getAngleOfThrow() {
        return angleOfThrow;
    }
    public double getTotalSpeed(){
        return totalSpeed;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }
}
