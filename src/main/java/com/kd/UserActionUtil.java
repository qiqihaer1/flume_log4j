package com.kd;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UserActionUtil {
        private static UserActionUtil userActionUtil;
    public UserActionUtil() {
    }

    public static UserActionUtil getInstance(){
        UserActionUtil userActionUtil = new UserActionUtil();
        return userActionUtil;
    }

    public String getNowDate(){
        Date date = new Date();
        SimpleDateFormat f=new SimpleDateFormat("yyyyMMdd HHmmss");
        return f.format(date);
    }

    public int getUserId(){
        Random random = new Random();
        //Integer.MAX_VALUE的意思是最大的值
//        return random.nextInt(Integer.MAX_VALUE);
        //简化
        return random.nextInt(300);
    }

    public static void main(String[] args) {
        UserActionUtil instance = UserActionUtil.getInstance();
        instance.getNowDate();
    }
}
