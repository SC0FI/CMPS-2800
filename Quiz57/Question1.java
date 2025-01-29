package Quiz57;

//Goal: Learn to write for loops.
//
//Assignment: In a new mobile game, players earn points by overcoming obstacles. Each level has an increasing number of obstacles, and the points earned for each obstacle in a level are equal to the square of the level number. The game designer needs to calculate the total points that can be earned from the first 20 levels to adjust the game's difficulty.
//
//Given int variables level and totalPoints, use a for loop to compute the total points a player can earn by completing all obstacles in the first 20 levels. The points from each level are the square of the level number multiplied by the number of obstacles in that level (assume each level has obstacles equal to the level number). Store this cumulative point total in totalPoints.
//
//For example, level 1 has 1 obstacle worth 1^2 points, level 2 has 2 obstacles each worth 2^2 points (totaling 4*2=8 points for level 2), and so on. You must use level for the for loop control variable.

public class Question1 {
    public static void main(String args[]) {
        int level = 1;
        int totalPoints = 0;
        for(level = 1; level <=20; level++) {
            totalPoints += Math.pow(level,2)*level;
            System.out.print("level: " + level + " ");
            System.out.print("total points: " + totalPoints);
            System.out.println(" ");
        }
    }
}