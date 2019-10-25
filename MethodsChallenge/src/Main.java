public class Main {

    public static void main(String[] args) {
        int highScorePosition = CalculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = CalculateHighScorePosition(900);
        displayHighScorePosition("Mark", highScorePosition);

        highScorePosition = CalculateHighScorePosition(400);
        displayHighScorePosition("Luke", highScorePosition);

        highScorePosition = CalculateHighScorePosition(50);
        displayHighScorePosition("Matthew", highScorePosition);
	// write your code here
    }

    public static void displayHighScorePosition (String name, int highScorePosition ) {
        System.out.println(name + " managed to get into position " + highScorePosition +
                " on the high score table");
    }

    public static int CalculateHighScorePosition (int playerScore){
        int highScorePosition;
        if (playerScore >= 1000){
            highScorePosition = 1;
        }else if(playerScore >= 500){
            highScorePosition = 2;
        }else if(playerScore >= 100){
            highScorePosition = 3;
        }else{
            highScorePosition = 4;
        }
        return highScorePosition;
    }
}
