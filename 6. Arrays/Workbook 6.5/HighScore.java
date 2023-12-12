public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] score = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),randomNumber()};
        
        System.out.print("Here are the scores: ");
        for (int i=0; i<score.length; i++) {
            System.err.print(score[i] + " ");
            if (highScore < score[i]) {
                highScore = score[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!"); 
    }   
    public static int randomNumber() {
        double random = Math.random()*50000;
        int randomInt = (int) random;
        return randomInt;

    } 

}
