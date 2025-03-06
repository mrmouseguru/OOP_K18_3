import java.io.PrintWriter;
import java.util.Scanner;

public class CXInput {
	
	//ô 2
	Scanner keyboard;
	PrintWriter out;
	
	//ô 3
	CXInput(){
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
	}
	
	CXInput(Scanner _keyboard,
	PrintWriter _out)
	{
		keyboard = _keyboard;
		out = _out;
	}
	
	void input() {
		//nhập vào thông tin của chuyên xe
		int maCX;
		out.print("[NHAP MA CX]:");
		out.flush();
		maCX = keyboard.nextInt();
		
	}

}
