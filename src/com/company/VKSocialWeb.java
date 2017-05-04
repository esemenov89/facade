package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class VKSocialWeb extends BasicSocialWeb {

    public String getHistory(){
        return "VK Cool Story";
    }

    List<Integer> getLikes(int messageId, int userId){
        return Arrays.asList(7,8,9);
    }
}
