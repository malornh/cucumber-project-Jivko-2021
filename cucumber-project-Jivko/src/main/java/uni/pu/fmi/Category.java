package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Category {

    /**
     * Default constructor
     */
    public Category() {
    }

    /**
     * 
     */
    private String categoryName;

    /**
     * 
     */
    private int id_number;

    /**
     * 
     */
    public Set<Advertisment> Advertisment;

    /**
     * @return
     */
    public String get_categoryName() {
        // TODO implement here
        return null;
    }

    /**
     * @param categoryName 
     * @return
     */
    public void set_categoryName(String categoryName) {
        
    }

	public int getId_number() {
		return id_number;
	}

	public void setId_number(int id_number) {
		this.id_number = id_number;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}