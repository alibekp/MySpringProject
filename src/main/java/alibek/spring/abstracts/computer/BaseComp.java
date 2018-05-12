package alibek.spring.abstracts.computer;

import org.springframework.beans.factory.annotation.Autowired;

import alibek.spring.interfaces.Computer;
import alibek.spring.interfaces.Cpu;
import alibek.spring.interfaces.Motherboard;
import alibek.spring.interfaces.Videocard;

public abstract class BaseComp implements Computer {

	@Autowired
	private Cpu cpu;

	@Autowired
	private Videocard videocard;

	@Autowired
	private Motherboard motherboard;

	public BaseComp() {
		System.out.println(this + " - BaseComp computer()");
	}

	// public BaseComp(Motherboard motherboard, Cpu cpu, Videocard videocard) {
	// this();
	// this.motherboard = motherboard;
	// this.cpu = cpu;
	// this.videocard = videocard;
	//
	// }

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Videocard getVideocard() {
		return videocard;
	}

	public void setVideocard(Videocard videocard) {
		this.videocard = videocard;
	}

}
