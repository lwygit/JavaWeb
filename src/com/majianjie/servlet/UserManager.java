package com.majianjie.servlet;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public List<String> findUserByName(String name){
        List<String> userList=new ArrayList<String>();
        userList.add("数据一");
        userList.add("数据二");
        userList.add("数据三");
        return userList;
    }
}
