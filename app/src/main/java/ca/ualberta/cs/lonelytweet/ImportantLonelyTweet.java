package ca.ualberta.cs.lonelytweet;

import android.util.Log;

/**
 * Created by henrywei on 3/14/17.
 */

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet(String text) {
        super(text);
    }

    @Override

    public String getTweetBody() {
        String msg = tweetBody.toUpperCase();
        Log.i("LonelyTweet", msg);
        return msg;
    }

    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }

        return true;
    }
}
