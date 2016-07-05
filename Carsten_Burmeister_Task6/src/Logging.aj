import java.util.List;
import java.util.Comparator;


public aspect Logging {	
	pointcut logSort(List list, Comparator comp): (execution(void SortAlgorithm+.sort(List , Comparator)) || execution(* SortAlgorithm.sort(List , Comparator))) && args(list,comp);
	pointcut logRead(): execution(* DataInput+.readData()) || execution(* DataInput.readData());
	pointcut logWrite(): execution(void DataOutput+.writeData(..)) || execution(* DataOutput+.writeData(..));
	pointcut logAllCallsFromMain(): call(* *.*(..)) && this(MainClass);

	void around(List list, Comparator comp): logSort(list, comp) {
		Logger l = Logger.getInstance();
		l.log("Going to sort "+list.size()+" datasets.");
		proceed(list, comp);
		l.log("Done sorting.");
		return;
	}

	before(): logRead() {
		Logger.getInstance().log("Done reading");
	}

	after() returning(): logRead() {
		Logger.getInstance().log("Reading finished successfully");
	}
	
	after() throwing (RuntimeException e): logRead() {
		Logger.getInstance().log("Ran into an exception. Printing stack trace:");
		e.printStackTrace();
	}

	void around(): logWrite() {
		Logger l = Logger.getInstance();
		l.log("Going to sort.");
		proceed();
		l.log("Done sorting.");
		return;
	}
	
	before(): logAllCallsFromMain() {
		Logger.getInstance().log("Going into a function in " + thisJoinPoint.getSourceLocation());
	}
	
	after() returning(): logAllCallsFromMain() {
		Logger.getInstance().log("Succesfully returned in " + thisJoinPoint.getSourceLocation());
	}
	
	after() throwing (RuntimeException e): logAllCallsFromMain() {
		Logger.getInstance().log("Returned in " + thisJoinPoint.getSourceLocation() + " with exception: ");
		e.printStackTrace();
	}
}