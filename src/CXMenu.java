import java.io.PrintWriter;
import java.util.Scanner;

public class CXMenu {
	
	// ô 2
	PrintWriter out;
	Scanner in;
	String prompt;
	CXInput cxInput;
	// ô 3
	CXMenu() {
		// TODO Auto-generated constructor stub
		out = new PrintWriter(System.out);
		in = new Scanner(System.in);
		prompt = "->";
		cxInput = new CXInput();
	}
	
	CXMenu(PrintWriter _out,
	Scanner _in,
	String _prompt){
		out = _out;
		in = _in;
		prompt = _prompt;
	}
	
	CXMenu(PrintWriter _out,
			Scanner _in,
			String _prompt, CXInput _cxInput){
				//out = _out;
				//in = _in;
				//prompt = _prompt;
		//gọi đến hàm khởi tạo 3 tham số của chính nó
				this(_out, _in, _prompt);
				cxInput = _cxInput;
			}
	
	void controlLoop() {
		//chạy vô tận
		out.println("hãy gõ lệnh \"help\" để được hỗ trợ!! ");
		out.flush();
		while(true) {
			String command;
			out.print(prompt); out.flush();
			command = in.nextLine();//"help", PRINT, ADD, QUIT, ABOUT
			
			//xóa khoảng trắng 2 đầu
			command = command.trim();
			
			// kiểm tra
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;//quay trở lại vòng lặp mới
			}
			
			if("exit".equalsIgnoreCase(command))
			{
				break;
			}
			
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
		}
	}

	private void add() {
		//code
		//gửi thông điệp đến hành vi input()
		//của đối tượng CXInput
		cxInput.input();
	}

	private void help() {
		//code
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM quan lý chuyến xe");
		out.flush();
		out.println("[ADD] them mới một chuyến xe");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[EXIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		
	}
	
	

}
