package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code

        BasicSocialWeb faceBookSocialWeb = new FacebookSocialWeb();
        BasicSocialWeb vk = new VKSocialWeb();

        ExtendedSocialWeb detective=
                new Detective(faceBookSocialWeb);

        System.out.println(detective.dataOfUser(1,"04.05.17",true,2));

        ExtendedSocialWeb detective2=
                new Detective(vk);
        System.out.println(detective2.dataOfUser(1,"04.05.17",true,2));
/*        System.out.println(extendedSocialWeb.getHistory(1,"04.05.17"));
        System.out.println(extendedSocialWeb.getLikes(1, true, 2));*/

    }
}
