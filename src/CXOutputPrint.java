import java.io.PrintWriter;
import java.util.ArrayList;

public class CXOutputPrint {
	
	//ô 2
	PrintWriter out;
	
	// ô 3
	CXOutputPrint(){
		out = new PrintWriter(System.out);
	}
	
	//
	
	void printAllCX(ArrayList<CXNoiThanh> dsNoi,
			ArrayList<CXNgoaiThanh> dsNgoai) {
		//xử lý in tất cả các chuyến xe của 2 danh sách
		
		//for-each
		for(CXNoiThanh cxNoi : dsNoi) {
			out.println(cxNoi);
			out.flush();
		}
		
		for(CXNgoaiThanh cxNgoai : dsNgoai) {
			out.println(cxNgoai);
			out.flush();
		}

	}

}
