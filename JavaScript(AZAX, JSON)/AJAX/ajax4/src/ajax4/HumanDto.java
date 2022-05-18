package ajax4;

import java.io.Serializable;

public class HumanDto implements Serializable{
	private int number;
	private String name;
	
	public HumanDto() {
	}

	public HumanDto(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}
