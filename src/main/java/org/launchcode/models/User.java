package org.launchcode.models;
import java.util.Date;

/**
 * Created by ethan on 4/3/17.
 */
public class User {
    private String username;
    private String email;
    private String password;
    private int userId;
    private static int nextId = 1;
    private Date register;


    public User(){
        this.setDate();
        userId = nextId;
        nextId++;
    }

    public User(String username, String email, String password){
        this();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getDate() {return this.register.toString(); }

    public void setDate() { this.register = new Date(); }

    public int getUserId() { return this.userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
