
class Person{
	public String name;
	public String cont;
	
	public Person(String n, String c){
		name=n;
		cont = c;}
	
	public String readName() {
		return name;
	}
	
	
	public String readPerson(){return "\nName : " + name + ", Contact : " + cont ;}
}

