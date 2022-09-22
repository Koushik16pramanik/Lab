package Lab_seasons;
/*
Q.4 Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime,
 MovieTicketPrice as instance variables.
 */
class Movie {
	
	String Moviename,Starttime,Endtime,Ticketprice;
	
	String getMovie() {
		return("\n MovieName:"+Moviename+"\n Strattime:"+Starttime+"\n Endtime"+Endtime+"\n Ticketprice"+Ticketprice);
	}
		void Movie(String Moviename, String Starttime, String Endtime, String Ticketprice) {
		this.Moviename=Moviename;
		this.Starttime=Starttime;
		this.Endtime=Endtime;
		this.Ticketprice=Ticketprice;
		}}
 public class Lab_Q3{
	 public static void main(String []args) {
		 Movie m=new Movie();
		 m.Movie("Iron Man","14:00","18:00","130");
		 System.out.println(m.getMovie());
	 }
}
