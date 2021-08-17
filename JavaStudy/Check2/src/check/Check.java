package check;
import constants.Constants;
public class Check {

	private static String firstName = "砥石";
    private static String lastName = "久瑠実";


	public static void main(String[] args) {

		Check.printName(firstName,lastName);

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();


		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rp.introduce();

	}

	private static void printName(String firstName ,String lastName) {

		String name = firstName + lastName;
		System.out.println("printNameメソッド→" + name);



	}

}



