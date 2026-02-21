package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // distance() -> (0,0)'a göre
    public double distance() {
        return distance(0, 0);
    }

    // distance(Point p)
    public double distance(Point p) {
        return distance(p.x, p.y);
    }

    // distance(int a, int b)
    public double distance(int a, int b) {
        int dx = a - this.x;
        int dy = b - this.y;
        return Math.sqrt((double) dx * dx + (double) dy * dy);
    }
}