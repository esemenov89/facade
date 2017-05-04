package com.company;

import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class ExtendedSocialWebAdapter implements ExtendedSocialWeb{

    BasicSocialWeb ext;

    public ExtendedSocialWebAdapter(BasicSocialWeb basicSocialWeb) {
        this.ext = basicSocialWeb;
    }

    @Override
    public String getHistory(int userID, String date) {
        if(ext instanceof VKSocialWeb)
            return new VKSocialWeb().getHistory();
        if(ext instanceof FacebookSocialWeb)
            return new FacebookSocialWeb().getHistory(date);
        return null;
}

    @Override
    public String dataOfUser(int userId, String date, boolean showNegative, int messageId) {
        return null;
    }

    @Override
    public List<Integer> getLikes(int userId, boolean showNegative, int messageId) {
        if(ext instanceof VKSocialWeb)
            return new VKSocialWeb().getLikes(userId,messageId);
        if(ext instanceof FacebookSocialWeb)
            return new FacebookSocialWeb().getLikes(messageId,showNegative,userId);
        return null;
    }
}
