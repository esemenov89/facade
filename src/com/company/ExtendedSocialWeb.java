package com.company;

import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public interface ExtendedSocialWeb {

    String getHistory(int userID, String date);

    String dataOfUser(int userId, String date, boolean showNegative, int messageId);

    List<Integer> getLikes(int userId, boolean showNegative, int messageId);
}
