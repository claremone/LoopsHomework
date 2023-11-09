public class Loops {
    public static void main(String[] args) {
        Loops myCount= new Loops();
    }//main method
    public Loops (){
        countUp();
        countByThrees();
        countDown();

    }//constructor method
    public void countUp(){
        for (int x=1; x<6; x=x+1){
            System.out.println(x);
        }
    }
    public void countByThrees(){
        for (int y=3; y<16; y=y+3){
            System.out.print(y+" ");
        }
        System.out.println();
    }
    public void countDown(){
        for (int z=10; z>0; z=z-1){
            System.out.print(z+", ");
        }
        System.out.println("Happy Loop Year!");
    }
}
