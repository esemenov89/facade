package com.company;

import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class Detective implements ExtendedSocialWeb{

    BasicSocialWeb ext;

    public Detective(BasicSocialWeb basicSocialWeb) {
        this.ext = basicSocialWeb;
    }

    public String dataOfUser(int userId, String date, boolean showNegative, int messageId){
        if(ext instanceof VKSocialWeb) {
            VKSocialWeb vk = new VKSocialWeb();
            return "History: "+vk.getHistory() + "\nLikes: "+ vk.getLikes(userId, messageId);
        }
        if(ext instanceof FacebookSocialWeb) {
            FacebookSocialWeb fb = new FacebookSocialWeb();
            return "History: "+fb.getHistory(date) + "\nLikes: "+ fb.getLikes(messageId, showNegative, userId);
        }
        return null;
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
    public List<Integer> getLikes(int userId, boolean showNegative, int messageId) {
        if(ext instanceof VKSocialWeb)
            return new VKSocialWeb().getLikes(userId,messageId);
        if(ext instanceof FacebookSocialWeb)
            return new FacebookSocialWeb().getLikes(messageId,showNegative,userId);
        return null;
    }
}
