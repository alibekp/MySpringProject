package alibek.spring.impls.asus;

import alibek.spring.interfaces.Cpu;

public class AsusCpu implements Cpu {

	private String Cpumodel;

	public void calculateSomething() {
		System.out.println("Asus processor selected");
		System.out.println("The model is: " + Cpumodel);

	}

	public String getCpumodel() {
		return Cpumodel;
	}

	public void setCpumodel(String cpumodel) {
		Cpumodel = cpumodel;
	}

}
