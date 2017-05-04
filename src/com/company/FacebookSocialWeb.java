package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class FacebookSocialWeb extends BasicSocialWeb {

    String getHistory(String date){
        return "FacebookSocialWeb history";
    }

    List<Integer> getLikes(int messageId, boolean showNegative, int userId){
        return Arrays.asList(7,8,9);
    }
}
