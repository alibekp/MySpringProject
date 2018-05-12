package alibek.spring.impls.asus;

import alibek.spring.interfaces.Videocard;

public class AsusVideocard implements Videocard {

	private String gpumodel;

	public void graphics() {
		System.out.println("Asus videocard selected");
		System.out.println("The model is: " + gpumodel);
	}

	public String getGpumodel() {
		return gpumodel;
	}

	public void setGpumodel(String gpumodel) {
		this.gpumodel = gpumodel;
	}

}
