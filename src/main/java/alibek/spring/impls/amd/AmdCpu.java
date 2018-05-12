package alibek.spring.impls.amd;

import org.springframework.stereotype.Component;

import alibek.spring.interfaces.Cpu;

@Component
public class AmdCpu implements Cpu {

	public void calculateSomething() {
		System.out.println("Amd processor selected");

	}

}
