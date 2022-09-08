package Lab;


/*
 Can you create object of a class from inside the scope of another class
constructor.
Ans= Yes
*/
public class Qpart3 {
	class Hard{
	
}
	public class Yes{
		Yes(){
			Hard hard=new Hard();
		}
	public static void main(String[] args) {
	Yes ob=new Yes();
	
	}
	}
