package alibek.spring.impls.pool;

import java.util.Collection;

import alibek.spring.interfaces.Computer;
import alibek.spring.interfaces.ComputerPool;

public class ProdeskPool implements ComputerPool {

	private Collection<Computer> computerCollection;

	public ProdeskPool(Collection<Computer> computerCollection) {
		super();
		this.computerCollection = computerCollection;
	}

	@Override
	public Collection<Computer> getComputerCollection() {
		return computerCollection;
	}

	public void showComputers() {
		for (Computer computer : computerCollection) {
			computer.work();
		}

	}

}
