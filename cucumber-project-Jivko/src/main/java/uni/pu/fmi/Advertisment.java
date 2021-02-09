package uni.pu.fmi;

import org.joda.time.DateTime;

/**
 * 
 */
public class Advertisment {

    /**
     * Default constructor
     */
    public Advertisment() {
    }

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private int id_number;

    /**
     * 
     */
    private DateTime date;

    /**
     * 
     */
    private Double price;

    /**
     * 
     */
    private String category;

    /**
     * 
     */
    public User User;


    /**
     * @return
     */
    public String get_title() {
		return title;
        
    }

    /**
     * @param title 
     * @return
     */
    public void set_title(String title) {
       this.title = title;
    }

    /**
     * @return
     */
    public DateTime get_date() {
		return date;		
       
    }

    /**
     * @param date 
     * @return
     */
    public void set_date(DateTime date) {
       this.date = date;
    }

    /**
     * @return
     */
    public Double get_price() {
		return price;
       
    }

    /**
     * @param price 
     * @return
     */
    public void set_price(Double price) {
        this.price = price;
    }

    /**
     * @return
     */
    public String get_category() {
		return category;
       
    }

    /**
     * @param category 
     * @return
     */
    public void set_category(String category) {
        this.category = category;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId_number() {
		return id_number;
	}

	public void setId_number(int id_number) {
		this.id_number = id_number;
	}

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

}