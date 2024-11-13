public class Pumpkin {
    //varaibles size, color, shape, boolean, seasonal?
    int size;
    String color;
    String shape;
    boolean isSeasonal;

    public Pumpkin(String pshape , String pcolor, boolean pisSeasonal, int psize){
        color = pcolor;
        shape = pshape;
        isSeasonal = pisSeasonal;
        size=psize;

    }
//default
    public Pumpkin(){
        color = "orange";
        shape = "circular";
        isSeasonal = false;
        size=10;
    }

    public void printInfo(){
        System.out.println(color);
        System.out.println(shape);
        System.out.println(size);

        if(isSeasonal){
            System.out.println("Ill be used for hallowen, im happy!");
        }
        else {
            System.out.println("Im a regular pumpkin. Im Sad :(");
        }

    }
}

//need to make public pumpkin
