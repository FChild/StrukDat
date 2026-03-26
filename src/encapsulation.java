abstract class Car {
private int speed;

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }
    abstract void startEngine();
}