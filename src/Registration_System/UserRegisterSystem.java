package Registration_System;

import java.util.HashSet;

public class UserRegisterSystem {

    private static HashSet<User> USER_DATA = new HashSet<>();

    public boolean register(User user){
        String checkInfo = checkUser(user);
        if(checkInfo != null){
            System.out.println(checkInfo);
            return false;
        }
       return USER_DATA.add(user);
    }

    public int size(){
        return USER_DATA.size();
    }
    private String checkUser(User user){
        if(user.getUsername().length() > 10 || user.getUsername().length() < 1){
            return "The username's length 1 <= lenght <= 10";
        }
        if(user.getAge() > 120){
            return "The age must be less than 120";
        }
        if(user.getPassword().length() < 8){
            return "The length for password must be greater than 8";
        }
        return null;
    }

    public static void main(String[] args) {
        UserRegisterSystem userSystem = new UserRegisterSystem();
        User user1 = new User(20, "Mike", "123567857");
        User user2 = new User(20, "Mike", "12334635465");
        User user3 = new User(30, "Lisa", "456356547547");

        userSystem.register(user1);
        userSystem.register(user2);
        userSystem.register(user3);

        System.out.println(userSystem.size());
    }
}
