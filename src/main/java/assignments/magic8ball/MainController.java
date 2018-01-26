package assignments.magic8ball;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import java.util.Random;
@RestController
public class MainController {
    private static final String[] answers = {
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            "Better not tell you now",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            "Don't count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful"

    };
    @RequestMapping
    public String wordReturn(){
        System.out.println("What is your question? ");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        Random r = new Random();
        int rand = 1 + r.nextInt(20);
        String answer=question+"<br/>"+answers[rand];
        return answer;
    }

}
