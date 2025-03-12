
public class CXStorage {
	
	// ô 2
	
	// ô 3
	CXStorage(){
		
	}
	
	void insertCXNoi(CXNoiThanh cx) {
		//gọi hàm static của lớp MemoryCXDB
		//thông qua tên lớp
		MemoryCXDB.addCXNoiThanh(cx);
	}
	
	void insertCXNgoai(CXNgoaiThanh cx) {
		MemoryCXDB.addCXNgoaiThanh(cx);
	}

}
