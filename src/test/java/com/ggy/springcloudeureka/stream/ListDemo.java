package com.ggy.springcloudeureka.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user1 = new User("xxxx",11,1);
        list.add(user1);
        User user2 = new User("xxxx",12,1);
        list.add(user2);
        User user3 = new User("xxxx",13,1);
        list.add(user3);
        User user4 = new User("xxxx",14,0);
        list.add(user4);
        User user5 = new User("xxxx",16,2);
        list.add(user5);
        User user6 = new User("xxxx",17,2);
        list.add(user6);
        User user7 = new User("xxxx",18,2);
        list.add(user7);

       List<User>  lisy4 =  list.stream().filter(user  -> 1== user.getSex() ).collect(Collectors.toList());
        lisy4.stream().forEach(user ->System.out.println(user.toString()));

    }
}
