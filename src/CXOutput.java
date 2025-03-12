import java.io.PrintWriter;

public class CXOutput {
	//ô 2
	PrintWriter out;
	// ô 3
	CXOutput(){
		out = new PrintWriter(System.out);
	}
	
	// 2 tham số
	
	void printThongBao(CXNoiThanh cx) {
		out.println("Nhap xe Noi thanh ok!");
		out.flush();
		//out.println("Ma CX: " + cx.maCX);
		//out.println("Ten tai xe " + cx.hoTenTX);
		out.println(cx);

		out.flush();
	}
	
	void printThongBao(CXNgoaiThanh cx) {
		out.println("Nhap xe Ngoai thanh ok!");
		out.flush();
		out.println("Ma CX: " + cx.maCX);
		out.flush();
	}

}
