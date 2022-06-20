package shapes;
import javax.sound.midi.InvalidMidiDataException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        Shape arr[]=new Shape[1000];// storing all shapes
        int i=0;
        try
        {
            File file=new File("src/shapes/shapes.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            String s;
            while((s=br.readLine())!=null)
            { try {
                String[] tokens=s.split(",");//split line into tokens
                if(tokens.length==0){// if empty line found
                    throw new InvalidMidiDataException();
                }
                if(tokens[0].equalsIgnoreCase("circle")){
                    if(tokens.length<2){
                        // need to parameter for circle one is name of shape and radius
                        throw new InvalidMidiDataException();
                    }
                    if(Double.parseDouble(tokens[1])<0){
                        //if radius is negative
                        throw new InvalidMidiDataException();
                    }
                    Shape cr=new Circle(Double.parseDouble(tokens[1]));// create reference of Shape
                    arr[i++]=cr;// put at array
                }else  if(tokens[0].equalsIgnoreCase("Square")){
                    if(tokens.length<2){
                        throw new InvalidMidiDataException();
                    }
                    if(Double.parseDouble(tokens[1])<0){
                        //if radius is negative
                        throw new InvalidMidiDataException();
                    }
                    Shape sq=new Square(Double.parseDouble(tokens[1]));
                    arr[i++]=sq;
                }else  if(tokens[0].equalsIgnoreCase("rectangle")){
                    if(tokens.length<3){
                        throw new InvalidMidiDataException();
                    }
                    if(Double.parseDouble(tokens[1])<0 || Double.parseDouble(tokens[2])<0){
                        //if anyone ,length or width is negative
                        throw new InvalidMidiDataException();
                    }
                    Shape r=new Rectangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                    arr[i++]=r;
                }else  if(tokens[0].equalsIgnoreCase("triangle")){
                    if(tokens.length<4){
                        throw new InvalidMidiDataException();
                    }
                    if(Double.parseDouble(tokens[1])<0 || Double.parseDouble(tokens[2])<0  || Double.parseDouble(tokens[3])<0){
                        //if anyone of a,b,c is negative
                        throw new InvalidMidiDataException();
                    }
                    Shape tr=new Triangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
                    arr[i++]=tr;
                }else  if(tokens[0].equalsIgnoreCase("Parallelogram")){
                    if(tokens.length<3){
                        throw new InvalidMidiDataException();
                    }
                    if(Double.parseDouble(tokens[1])<0 || Double.parseDouble(tokens[2])<0 ){
                        //if anyone of length,or width is negative
                        throw new InvalidMidiDataException();
                    }
                    Shape pr=new Parallelogram(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                    arr[i++]=pr;
                }
                else{
                    // wrong shape input
                    throw new InvalidMidiDataException();
                }
            }
            catch (InvalidMidiDataException e){

            }
            }
            fr.close();    //closes the stream and release the resources
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
      // print shapes
        for(int j=0;j<i;j++){
            System.out.println(arr[j].toString()+" perimeter = "+arr[j].perimeter());
        }
        // task 2
        double circleMaxPerimeter=Double.MIN_VALUE;
        double triangleMinPerimeter=Double.MAX_VALUE;
        // find min and max perimeter;
        for(int j=0;j<i;j++){
            if(arr[j].getClass().getSimpleName().equalsIgnoreCase("circle") && arr[j].perimeter()>circleMaxPerimeter){
                circleMaxPerimeter=arr[j].perimeter();
            }
            else if(arr[j].getClass().getSimpleName().equalsIgnoreCase("triangle") && arr[j].perimeter()<triangleMinPerimeter){
                triangleMinPerimeter=arr[j].perimeter();
            }
        }
        // delete circle and triangle
        //put null where you find min triangle perimeter and max circle perimeter
        for(int j=0;j<i;j++){
            if(arr[j].getClass().getSimpleName().equalsIgnoreCase("circle") && arr[j].perimeter()==circleMaxPerimeter){
                arr[j]=null;
            }
            else if(arr[j].getClass().getSimpleName().equalsIgnoreCase("triangle") && arr[j].perimeter()==triangleMinPerimeter){
                arr[j]=null;
            }
        }
        // print again
        // print shapes
        System.out.println("**********************Task 2************************************");
        for(int j=0;j<i;j++){
            if(arr[j]!=null){
                System.out.println(arr[j].toString()+" perimeter = "+arr[j].perimeter());
            }
        }
        // task -4
        double totalParallelogramPerimeter=0;
        double totalTrianglePerimeter=0;
        for(int j=0;j<i;j++){
            if(arr[j]!=null){
                if(arr[j].getClass().getSimpleName().equalsIgnoreCase("parallelogram")){
                    totalParallelogramPerimeter=totalTrianglePerimeter+arr[j].perimeter();
                }
               else if(arr[j].getClass().getSimpleName().equalsIgnoreCase("triangle") ){
                    totalTrianglePerimeter=totalTrianglePerimeter+arr[j].perimeter();
                }
            }
        }
        System.out.println("Total perimeter of parallelogram is: "+totalParallelogramPerimeter);
        System.out.println("Total perimeter of triangle is: "+totalTrianglePerimeter);

    }
}
