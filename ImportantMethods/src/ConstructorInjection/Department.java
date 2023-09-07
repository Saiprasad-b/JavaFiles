package ConstructorInjection;

public class Department {
private String depName;
private int depId;


@Override
public String toString() {
	return "Department [depName--->" + depName + ", depId--->" + depId + "]";
}


public void setDepName(String depName) {
	this.depName = depName;
}


public void setDepId(int depId) {
	this.depId = depId;
}


public Department(String depName, int depId) {
	super();
	this.depName = depName;
	this.depId = depId;
}
}
