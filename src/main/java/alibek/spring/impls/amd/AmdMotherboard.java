package alibek.spring.impls.amd;

import org.springframework.stereotype.Component;

import alibek.spring.interfaces.Motherboard;

@Component
public class AmdMotherboard implements Motherboard {

	public void connectAll() {
		System.out.println("Amd motherboard selected");

	}

}
