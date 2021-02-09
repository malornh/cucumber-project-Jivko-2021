package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private int id_number;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    public Set<Advertisment> Advertisment;

    /**
     * @return
     */
    public String get_firstName() {
		return firstName;
        
    }

    /**
     * @param firstName 
     * @return
     */
    public void set_firstName(String firstName) {
        
    }

    /**
     * @return
     */
    public String get_lastName() {
		return lastName;
        
    }

    /**
     * @param lastName 
     * @return
     */
    public void set_lastName(String lastName) {
        ;
    }

    /**
     * @return
     */
    public String get_username() {
		return username;
        
    }

    /**
     * @param username 
     * @return
     */
    public void set_username(String username) {
       this.username = username;
    }

    /**
     * @return
     */
    public String get_email() {
		return email;
        
    }

    /**
     * @param email 
     * @return
     */
    public void set_email(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public int get_id_number() {
		return id_number;
        
    }

    /**
     * @return
     */
    public String get_password() {
		return password;
        
    }

    /**
     * @param password 
     * @return
     */
    public void set_password(String password) {
        this.password = password;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId_number() {
		return id_number;
	}

	public void setId_number(int id_number) {
		this.id_number = id_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}