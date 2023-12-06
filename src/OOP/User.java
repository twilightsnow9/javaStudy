package OOP;

public class User {

    //   私有属性
    private String username;
    private String password;
    private String email;
    private String sex;
    private int age;

    //无参构造
    public User() {
    }
    //有参构造
    public User(String username, String password, String email, String sex, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.age = age;
    }

    // getter setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

}