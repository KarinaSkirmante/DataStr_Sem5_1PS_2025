package model;

public class City {
	private String title;
	private float squareKM;
	private int citizens;
	private String mayorSurname;
	
	//TODO uztaisīt pārbaudes set funkcijās
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getSquareKM() {
		return squareKM;
	}
	public void setSquareKM(float squareKM) {
		this.squareKM = squareKM;
	}
	public int getCitizens() {
		return citizens;
	}
	public void setCitizens(int citizens) {
		this.citizens = citizens;
	}
	public String getMayorSurname() {
		return mayorSurname;
	}
	public void setMayorSurname(String mayorSurname) {
		this.mayorSurname = mayorSurname;
	}
	
	public City()
	{
		setTitle("Testa pilsēta");
		setSquareKM(100);
		setCitizens(1000);
		setMayorSurname("Testiņš");
	}
	public City(String title, float squareKM, int citizens, String mayorSurname) {
		setTitle(title);
		setSquareKM(squareKM);
		setCitizens(citizens);
		setMayorSurname(mayorSurname);
	}
	
	public String toString() {
		return title + " ( " + squareKM + " km^2), cilvēku skaits: " 
				+ citizens + " (mērs: " + mayorSurname + ")";
	}

}
