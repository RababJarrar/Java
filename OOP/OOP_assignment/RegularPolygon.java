public class RegularPolygon {
    Integer n = 5;                 //private=>getter
    double side = 2.0; 
    double x = 10.0; 
    double y = 10.0; 
                   
    public RegularPolygon(){
    }

    public RegularPolygon(Integer n,double side){
    this.n=n;
    this.side=side;
    }
    public RegularPolygon(Integer n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    public double getPerimeter(){
        return (n*side);
    }
    public double getArea(){
        return ((n*side*side)/(4.0 * Math.tan((Math.PI / n))));
    }

}
