package POJO;

public  class Employee {
private String name="Ritesh";
private String address="bhadohi";
private int retirementAge=61;

public void setRetirementAge(int age) {
	if(age<61) {
		retirementAge=age;
	}
}
	public int getRetirementAge() {
		return retirementAge;
	}
}
