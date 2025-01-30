package Quiz52;

//Use int variables level and hp, and use a while loop to compute hp at level 10. Use no variables other than level and hp. Declare and initialize level and hp with appropriate values to ensure the loop iterates correctly and calculates the factorial accurately. In the end, level should be 10, and hp should be 10 factorial.
//
//Write a code snippet to accomplish this task.

public class Question1 {
    public static void main(String args[]) {
    int level = 1;
    int hp = 1;
    while(level <= 10) {
        hp *= level;
        level++;
    }
    level--;
    System.out.println("Level is: " +   level);
    System.out.println("Health is: " + hp);
    }
}
