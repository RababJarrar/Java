public class Rectangle {
    
    double height = 1.0;                 //private=>getter
    double width = 1.0;                  //private=>getter
    public Rectangle(){
    }

    public  Rectangle(double newHeight, double newWidth){
        height= newHeight;
        width= newWidth;
    }

    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return (height+width+height+width);
    }

}
        