package com.afs.tdd;

public class MarsRover {

    private int x_axis;
    private int y_axis;
    private String direction;

    public MarsRover(int x_axis, int y_axis, String direction) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.direction = direction;
    }

    public int getX_axis() {
        return x_axis;
    }

    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void move() {
        switch (getDirection()) {
            case "N":
                setY_axis((getY_axis() + 1));
                break;
            case "S":
                setY_axis((getY_axis() - 1));
                break;
            case "E":
                setX_axis((getX_axis() + 1));
                break;
            case "W":
                setX_axis((getX_axis() - 1));
                break;
        }


    }

    public void command(String command) {
        switch (command) {
            case "M":
                this.move();
                break;
            case "R":
                this.turnRight();
                break;
        }
    }

    private void turnRight() {
        switch (getDirection()) {
            case "N":
                setDirection("E");
                break;
            case "S":
                setDirection("W");
                break;
            case "E":
                setDirection("S");
                break;
            case "W":
                setDirection("N");
                break;
        }

    }
}