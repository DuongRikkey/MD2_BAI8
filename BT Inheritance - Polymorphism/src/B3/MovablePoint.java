package B3;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float ySpeed, float xSpeed) {

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public  float [] getSpeed(){
        float [] speed = {xSpeed,ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + " xSpeed: " + xSpeed + " ySpeed: " + ySpeed;
    }

    public MovablePoint move() {
       super.setX(getX()+xSpeed);
       super.setY(getY()+ySpeed);
        return this;
    }

}
