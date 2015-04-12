/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Garfield
 */
public class Damn {
    private int id,active;
    private String name,password,email;

    public int getId() {
        return id;
    }


    
    public int getActive()
    {
        return active;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setActive(int active)
    {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
