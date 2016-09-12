package holloway.nate.AliceBob;


/**
 * Created by nathanielholloway on 9/10/16.
 * This is the logic class.
 */
public class Compute {
    private Display userDisplay;




    public Compute(){
        userDisplay = new Display();
    }

    public void logic(){
        String userResponse = userDisplay.displayPrompt();
        String result = comparison(userResponse);
        userDisplay.displayGreeting(result);
    }

    private String comparison(String name){

        String greet = "Hello ";
        String username = name.toUpperCase();
        if(username.equals("BOB") || username.equals("ALICE")){
            return greet + username + "!";
        }
        else
            return greet + "!";


    }
}
