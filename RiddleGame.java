import java.util.Scanner;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define an array of riddles and their corresponding answers.
        String[] riddles = {
            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
            "The more you take, the more you leave behind. What am I?",
            "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?"
        };

        String[] answers = {
            "an echo",
            "footsteps",
            "a fire"
        };

        // Define hints for each riddle.
        String[] hints = {
            "Hint: This thing is known for its ability to reflect sound.",
            "Hint: Think about what you leave behind when you walk.",
            "Hint: It produces heat and light."
        };

        int numRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * numRiddles);
            String selectedRiddle = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String hint = hints[randomIndex];

            // Display the riddle to the user.
            System.out.println("\nRiddle: " + selectedRiddle);

            boolean answeredCorrectly = false;

            while (!answeredCorrectly) {
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine().trim().toLowerCase();

                if (userAnswer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    score++;
                    answeredCorrectly = true;
                } else {
                    // If the answer is incorrect, offer a hint.
                    System.out.println("Wrong! Would you like a hint? (yes/no)");
                    String giveHint = scanner.nextLine().trim().toLowerCase();

                    if (giveHint.equals("yes")) {
                        System.out.println(hint);
                    } else {
                        break; // Exit hint offer loop.
                    }
                }
            }

            // Allow the user to continue or exit.
            System.out.println("Current score: " + score);
            System.out.println("Continue playing? (yes/no)");
            String playAgain = scanner.nextLine().trim().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display final score and close the scanner.
        System.out.println("\nYour final score: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}