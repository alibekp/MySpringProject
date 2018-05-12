package alibek.spring.impls.conveyor;

import alibek.spring.interfaces.Computer;
import alibek.spring.interfaces.ComputerConveyor;

public abstract class ProdeskConveyor implements ComputerConveyor {

	@Override
	public abstract Computer createComp();

}
