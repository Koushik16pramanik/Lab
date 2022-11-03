package Lab_seasons;
/*  •	Develop simple Java program using Wrapper Classes.   */
public class Student {   
	// problem 1
	 public void calculateFeesStructure(long StudentId, char studentGrade, double monthlyFees, boolean isScholarshipEligible) {  // Given data
		 			// data given by logic
					if(StudentId != 0 &&  studentGrade == 'A' && isScholarshipEligible==true) {
						double fees =monthlyFees -monthlyFees *10/100;
					System.out.println("10% of fees is exempted, the calculated fees is "+fees);
					}
					else if  (StudentId != 0 && studentGrade== 'B' &&  isScholarshipEligible==true) {
						double fees =monthlyFees -monthlyFees * 8/100;
						System.out.println("8 % of fees is exempted, the calculated fees is "+ fees);
					}
					else if (StudentId !=0 && studentGrade== 'C' && isScholarshipEligible==true) {
						double fees =monthlyFees -monthlyFees * 6/100;
						System.out.println("6 % of fees is exempted, the calculated fees is "+ fees);
					}
					else if (StudentId != 0 && studentGrade== 'D' && isScholarshipEligible==true) {
						double fees=monthlyFees -monthlyFees * 4/100;
						System.out.println("4 % of fees is exempted, the calculated fees is "+fees);
					}
					else {
						System.out.println("Not Eligible for Exemption");
						}}
	 // problem 2
		public void compareMarks (long Maths, double English ) {   // Given data
						// data given by logic
						if (English> Maths) {
							System.out.println("English mark is higher than Maths");
						} 
						else if (Maths> English) {
							System.out.println("Maths mark is higher than English");
						}
						else if (English == Maths) {
							System.out.println("Both Are Equal");
						}} 
		// problem 3
		public void validateFees(Double Fees) {   // Given data
						// data given by logic
						if (Fees.isInfinite()) {
							System.out.println("Fees is infinite");
						}
						else {
							System.out.println("Fees is not infinite");
						}
						System.out.println(Fees.byteValue());
					}}