package alibek.spring.impls.asus;

import alibek.spring.interfaces.Motherboard;

public class AsusMotherboard implements Motherboard {

	private String Motherboardmodel;

	public void connectAll() {
		System.out.println("Asus motherboard selected");
		System.out.println("The model is: " + Motherboardmodel);

	}

	public String getMotherboardmodel() {
		return Motherboardmodel;
	}

	public void setMotherboardmodel(String motherboardmodel) {
		Motherboardmodel = motherboardmodel;
	}

}
