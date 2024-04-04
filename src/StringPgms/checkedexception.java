package Logics;

public class checkedexception {
static void gender() throws freebusException{
	String Gender ="male";
	if(Gender=="female"){
		System.out.println("bus is free");
	}else{
		throw new freebusException("not free bus");
	}
}
public static void main(String[] args) {
	try{
		gender();
	}
	catch(freebusException e){
		System.out.println(e.getMessage());
	}
}
}
class freebusException extends Exception {
	String msg;
	public freebusException(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}
