import java.util.Scanner;

/**
 * Desription :Demo of traffic light
 * @author vishakhraik
 * Date : 14/03/2021
 */
public class TrafficLightDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Select a option:1.red 2.yellow 3.green ");
		int option=sc.nextInt();
		if(option==1) {
			System.out.println("STOP");
		}else if(option==2) {
			System.out.println("READY");
		}else {
			System.out.println("GO");
		}
	}
}
