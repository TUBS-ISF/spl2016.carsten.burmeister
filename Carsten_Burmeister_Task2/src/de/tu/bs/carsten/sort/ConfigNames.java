package de.tu.bs.carsten.sort;

public enum ConfigNames {
	BUBBLE_SORT("BubbleSort"), RANDOM_SORT("RandomSort"), JAVA_SORT("JavaSort"), FILE_INPUT("FileInput"), FILE_OUTPUT("FileOutput");
	
	private final String code;

	private ConfigNames(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
