import java.sql.SQLOutput;

public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall=new Conditionals();
    }//main method

    public Conditionals(){
        String question = "Will I complete my CS homework?";
        System.out.println(question);
        int randomInt=(int)(Math.random()*11);
        if (randomInt<1){
            System.out.println("Without a doubt!");
        } else if (randomInt<2 && randomInt>0){
            System.out.println("Better not tell you now!");
        } else if (randomInt<3 && randomInt>1){
            System.out.println("Absolutely!");
        } else if (randomInt<4 && randomInt>2){
            System.out.println("There's no way...");
        } else if (randomInt<5 && randomInt>3){
            System.out.println("I wouldn't count on it.");
        } else if (randomInt<6 && randomInt>4){
            System.out.println("Absolutely not.");
        } else if (randomInt<7 && randomInt>5){
            System.out.println("I think there's a chance.");
        } else if (randomInt<8 && randomInt>6){
            System.out.println("Are you seriously asking that?");
        } else if (randomInt<9 && randomInt>7){
            System.out.println("Not today.");
        } else if (randomInt<10 && randomInt>8){
            System.out.println("Maybe sometime soon.");
        } else if (randomInt<11 && randomInt>9){
            System.out.println("You can make it happen.");
        }

    }//constructor method

}//end of class
