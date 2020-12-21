package Registration_System;

public class User {
    private Integer age;
    private String username;
    private String password;

    public User(Integer age, String username, String password){
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public int hashCode(){
        return age.hashCode() | username.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(!(obj instanceof User)) return false;
        User user = (User) obj;
        if(user.getAge().equals(this.getAge()) && user.getUsername().equals(this.getUsername())){
            return true;
        }
        return false;
    }
}
