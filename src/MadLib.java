public class MadLib {
    public static void main(String[] args) {
        System.out.println("MadLib");
        MadLib myStory=new MadLib();
    } //main method
    public MadLib(){
        System.out.println("Hello World!");
        String classmate="Christina";
        String city="New York City";
        String noun="dog";
        String adjective="hungry";
        String pluralNoun="computers";
        String pluralAnimal="ostriches";
        boolean trueOrFalse=true;
        Double decimalBiggerThan1=6.78;
        int number1=7;
        int number2=100;
        int wholeNumberBetween1And4=3;
        String miltonTeacher="Dr. Funes";
        String miltonDean="Ms. Sugrue";
        String letterGrade="F";
        String season="summer";
        String pluralNoun2="coyotes";
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class. However, I think that the "+pluralNoun2+" might get us... ";
        System.out.println(story);


    } //constructor method

}
