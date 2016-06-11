package de.tu.bs.carsten.sort; 

public  class  Logger {
	

	private static Logger logger;

	
	
	public static Logger getInstance(){
		synchronized (Logger.class) {
			if(logger == null){
				logger = new Logger();
			}
		}
		return logger;
	}

	
	
	public void log(String text){
		System.out.println(text);
	}


}
