/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author maher
 */
@ManagedBean
@SessionScoped
public class User {

    private String name;
    private Date dateOfBirth;
    private String userName;
    private String phoneNumber;
    private String password;
    private String bgcolor="#ffffff";

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }
    
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    /**
     * Creates a new instance of User
     */
    public User() {
    }
    public void register()
    {
        Controller.initDB("testDB");
        String userCQL = "INSERT INTO users (username, name, password, phoneNumber, background,birthdate)"
                    + "  VALUES('"+userName+"', '"+name+"', '"+password+"', '"+phoneNumber+ "', '"+bgcolor +"','" + dateOfBirth + "')";
        System.out.println("\n\n\n\n\n\n"+userCQL+"\n\n\n\n\n\n\n\n");
       Controller.insertUsers(userCQL);
       Controller.colseConnection();
    }

}
