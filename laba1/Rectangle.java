package Task1;

public class Rectangle {
    public double height = -1, width = -1;

    Rectangle(){}

    Rectangle(double height_, double width_){
        this.height = height_;
        this.width = width_;
    }

    double getArea(){
        return this.height * this.width;
    }

    double getPerimeter(){
        return (this.width + this.height) * 2;
    }
}
