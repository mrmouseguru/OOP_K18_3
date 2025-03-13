import java.util.ArrayList;

public class MemoryCXDB {
	
	// ô 2
	static ArrayList<CXNoiThanh> databaseNoiThanh = 
			new ArrayList<CXNoiThanh>() ;
	static ArrayList<CXNgoaiThanh> databaseNgoaiThanh
		= new ArrayList<CXNgoaiThanh>();
	
	//thêm vào CSDL một số chuyến xe
	//khối static
	static {
		CXNoiThanh cxNoi1 = new CXNoiThanh(1111, "Le Van Teo", "Teo 111",
				700, 3, 40);
		CXNgoaiThanh cxNgoai1 = new CXNgoaiThanh(2222, "Nguyen Ty", 
				"ty 2222", 500, "Ha noi", 2);
		addCXNoiThanh(cxNoi1);
		addCXNgoaiThanh(cxNgoai1);
	}
	
	// ô 3
	static void addCXNoiThanh(CXNoiThanh cx) {
		//thêm chuyến xe vào danh sách 
		databaseNoiThanh.add(cx);
	}
	
	static void addCXNgoaiThanh(CXNgoaiThanh cx) {
		databaseNgoaiThanh.add(cx);
	}
	
	static ArrayList<CXNoiThanh> getDSCXNoi() {
		return databaseNoiThanh;
	}
	
	static ArrayList<CXNgoaiThanh> getDSCXNgoai(){
		return databaseNgoaiThanh;
	}

}
