package ads.poo;

public class Ponto {
    
    private double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto [x=" + x + ", y=" + y + "]";
    }

    public double distacia(Ponto p){
        double dx = Math.pow(p.x - this.x, 2);
        double dy = Math.pow(p.y - this.y, 2);
        return Math.sqrt(dx + dy);
    }
}
