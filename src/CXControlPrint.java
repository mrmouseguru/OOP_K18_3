import java.util.ArrayList;

public class CXControlPrint {
	
	// ô 2
	CXStoragePrint cxStoragePrint;
	CXOutputPrint cxOutputPrint;
	
	// ô 3
	public CXControlPrint() {
		cxStoragePrint = new CXStoragePrint();
		cxOutputPrint = new CXOutputPrint();
	}
	
	void printDSCX() {
		
		ArrayList<CXNoiThanh> dsNoi;
		ArrayList<CXNgoaiThanh> dsNgoai;
		//gủi thông điệp đến đối tựng CXStoragePrint
		dsNoi = cxStoragePrint.getDSCXNoi();
		dsNgoai = cxStoragePrint.getDSCXNgoai();
		
		//gửi thông điệp đến đối tương CXOutputPrint
		cxOutputPrint.printAllCX(dsNoi, dsNgoai);
	}
	

}
