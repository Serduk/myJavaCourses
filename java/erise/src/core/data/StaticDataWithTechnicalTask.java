package core.data;

import core.random.RandomUtils;

/**
 * Created by sergey on 1/27/16.
 */
public class StaticDataWithTechnicalTask {
    RandomUtils random = new RandomUtils();
    /**
     * Only Dating
     * */
    public int PROFILES_IN_SEARCH_FOR_FREE_USER = 48;
    public int COUNT_USER_CAN_SENT_FREE_MESSAGE = 5;



    /**
     * Diff hello messages
     * */

    String [] greetings = {
            "Hello!",
            "Good morning!",
            "Good afternoon!",
            "Goog evening!",
            "Hi!",
            "Hey, ",
            "How's it going?",
            "Howdy!",
            "Hiya!",
            "What’s up?",
            "Yo!",
            "G'day!",
            "Nice to see you.",
            "Long time no see.",
            "I haven't seen you in a while.",
            "What have you been up to?",
            "How are things?",
            "What's new?"
    };

    public String getGreetings() {
        return greetings[random.getUniqNumWithMaxParam(greetings.length)];

    }
}
