package org.mutualser.oauth2.model;

public class User {
    private String name;
    private String roleName;

    public User() {
    }

    public User(String name, String roleName) {
        super();
        this.name = name;
        this.roleName = roleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getRoleName() {
		return roleName;
	}

}
