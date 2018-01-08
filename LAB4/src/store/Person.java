package store;

public class Person  {
	private String namn;//name of the person
	private int nr; //number of items the person carries.
	
	public Person(String namn, int  nr){
		
		this.namn = namn;
		this.nr = nr;
	}
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn ;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	@Override
	public String toString(){
		return namn;
		
	}
	/*public String toString(){
		return nr;
		
	}*/

	
	
	
	
	
}
