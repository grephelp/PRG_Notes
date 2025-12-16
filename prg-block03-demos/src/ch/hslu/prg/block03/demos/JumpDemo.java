package ch.hslu.prg.block03.demos;

public class JumpDemo {

	public static void main(String[] args) {

		String[] emails = new String[10];
		
		emails[0] = "jordan.sucur@hslu.ch";
		emails[4] = "hansli.pechvogel@stud.hslu.ch";
		emails[7] = "beat.weber@stud.hslu.ch";
		
		/*-1
		for (int i = 0; i < emails.length ; i++) {
			
			System.out.println(emails[i]);
			
		}
		*/
		
		for (int i = 0; i < emails.length; i++) {
			
			if (emails[i] == null) {
				continue;
			}
		}
		
		System.out.println(emails[i] + "  ");
	}

}
