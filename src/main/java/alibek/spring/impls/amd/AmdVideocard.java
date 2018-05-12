package alibek.spring.impls.amd;

import org.springframework.stereotype.Component;

import alibek.spring.interfaces.Videocard;

@Component
public class AmdVideocard implements Videocard {

	public void graphics() {
		System.out.println("Amd videocard selected");

	}

}
