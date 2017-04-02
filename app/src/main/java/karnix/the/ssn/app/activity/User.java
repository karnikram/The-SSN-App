package karnix.the.ssn.app.activity;

/**
 * Created by vvvro on 4/2/2017.
 */

public class User {
    public String uid;
    public String userName;
    public String userImage;
    public String userEmail;
    public User(){

    }
    public User(String uid, String userName, String userImage, String userEmail){
        this.uid = uid;
        this.userName = userName;
        this.userImage = userImage;
        this.userEmail = userEmail;
    }
    public void setUID(String uid){
        this.uid = uid;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setUserImage(String userImage){
        this.userImage = userImage;
    }
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    public String getUID() {
        return uid;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserImage(){
        return userImage;
    }
    public String getUserEmail(){
        return userEmail;
    }
}