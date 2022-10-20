package Lab_seasons;
/*  Q.3 Write a program to create custom exception in java  */

	class CustomException extends Exception  {
    public CustomException(String str)  {
        super(str);
    }}
  class exceptIon {
  public String getBar(int i)
  throws CustomException  {
    if (i == 0)  {
      // throw custom exception
      throw new CustomException("Everything is zero ...");
    }
    else  {
      return "null";
    }}}
public class Custom_Exception {
  public static void main(String[] args) {
    // create a new class
    exceptIon d = new exceptIon();
    try  {
      // calling getBar with a zero
      String bar = d.getBar(0);
    }
    catch (CustomException e) {
      e.printStackTrace();
    }}}