package alibek.spring.impls.computer;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import alibek.spring.abstracts.computer.BaseComp;
import alibek.spring.interfaces.Cpu;
import alibek.spring.interfaces.Motherboard;
import alibek.spring.interfaces.Videocard;
import spring.enums.ColorStyle;

@Component
public class CompProdesk extends BaseComp implements InitializingBean, DisposableBean {

	private ColorStyle color;
	private int price;
	private boolean unused;

	public CompProdesk() {
	}

	// public CompProdesk(Motherboard motherboard, Cpu cpu, Videocard videocard) {
	// super(motherboard, cpu, videocard);
	// }

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CompProdesk prodesk1() {
		return new CompProdesk();
	}

	@Bean
	@Scope
	public CompProdesk prodesk2() {
		return new CompProdesk(ColorStyle.PURPLE, 2011, true);
	}

	public CompProdesk(Motherboard motherboard, Cpu cpu, Videocard videocard, ColorStyle color, int price, boolean unused) {
		// super(motherboard, cpu, videocard);
		this.color = color;
		this.price = price;
		this.unused = unused;
	}

	public CompProdesk(ColorStyle color, int price, boolean unused) {
		this.color = color;
		this.price = price;
		this.unused = unused;
	}

	@Override
	public void work() {
		getMotherboard().connectAll();
		getCpu().calculateSomething();
		getVideocard().graphics();
		System.out.println("color is : " + color);
		System.out.println("price is : " + price);
		System.out.println("unused? : " + unused);

	}

	@Override
	public void play() {
		System.out.println("Prodesk is playing Far Cry 5 now! Enjoy");

	}

	public ColorStyle getColor() {
		return color;
	}

	public void setColor(ColorStyle color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isUnused() {
		return unused;
	}

	public void setUnused(boolean unused) {
		this.unused = unused;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + " - method destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " - method init()");

	}

}
