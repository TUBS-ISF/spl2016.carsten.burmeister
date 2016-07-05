
public aspect Logging {	
	pointcut logSort(List<T> list): (execution(void SortAlgorithm+.sort(List<T> , ..)) || execution(* SortAlgorithm.sort(List<T> , ..))) && args(list,..);
	pointcut logRead(): execution(* DataInput+.readData()) || execution(* DataInput.readData());
	pointcut logWrite(): execution(void DataOutput+.writeData(..)) || execution(* DataOutput+.writeData(..));
	pointcut logAllCallsFromMain(): call(* *.*(..)) && this(de.tu.bs.carsten.sort.MainClass);

	void around(List<T> list): logSort(list) {
		de.tu.bs.carsten.sort.Logger l = de.tu.bs.carsten.sort.Logger.getInstance();
		logger.log("Going to sort "+list.size()+" datasets.");
		process();
		logger.log("Done sorting.");
		return;
	}

	before(): logRead() {
		de.tu.bs.carsten.sort.Logger.getInstance().log("Done reading");
	}

	after() returning(): logRead() {
		de.tu.bs.carsten.sort.Logger.getInstance().log("Reading finished successfully");
	}
	
	after() throwing (RuntimeException e): logRead() {
		de.tu.bs.carsten.sort.Logger.getInstance().log("Ran into an exception. Printing stack trace:");
		e.printStackTrace();
	}

	void around(): logWrite() {
		de.tu.bs.carsten.sort.Logger l = de.tu.bs.carsten.sort.Logger.getInstance();
		logger.log("Going to sort.");
		process();
		logger.log("Done sorting.");
		return;
	}
	
	before(): logAllCallsFromMain() {
		de.tu.bs.carsten.sort.Logger.getInstance().log("Going into a function in " + thisJoinPoint.getSourceLocation());
	}
	
	after() returning(): logAllCallsFromMain() {
		de.tu.bs.carsten.sort.Logger.getInstance().log("Succesfully returned in " + thisJoinPoint.getSourceLocation());
	}
	
	after() throwing (RuntimeException e): logAllCallsFromMain() {
		de.tu.bs.carsten.sort.Logger.getInstance().log("Returned in " + thisJoinPoint.getSourceLocation() + " with exception: ");
		e.printStackTrace();
	}
}