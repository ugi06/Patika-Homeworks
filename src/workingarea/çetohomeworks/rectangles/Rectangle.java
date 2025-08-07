package workingarea.çetohomeworks.rectangles;


public class Rectangle {


    private double height;

    private double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double  calculateArea(){
        return height * width;
    }

    public double calculatePerimeter(){
        return 2*(height + width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area= " + calculateArea() +
                ", çevresi " + calculatePerimeter()+
                '}';
    }
}
