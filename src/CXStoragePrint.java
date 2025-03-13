import java.util.ArrayList;

public class CXStoragePrint {
	
	// ô 2
	
	// ô 3
	CXStoragePrint(){
		
	}
	
	ArrayList<CXNoiThanh> getDSCXNoi(){
		//kết nối đến CSDL MemoryCXDB
		//gọi hàm static getDSCXNoi()
		//thông qua tên class
		ArrayList<CXNoiThanh> dsNoi; 
		dsNoi = MemoryCXDB.getDSCXNoi();
		return dsNoi;
	}
	
	ArrayList<CXNgoaiThanh> getDSCXNgoai(){
		return MemoryCXDB.getDSCXNgoai();
	}

}
