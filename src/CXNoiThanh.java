
public class CXNoiThanh extends ChuyenXe{
	
	// ô 2
	int soTuyen;
	double soKm;
	
	
	//ô 3
	CXNoiThanh(){
		
	}
	
	CXNoiThanh(int _maCX,
			String _hoTenTX,
			String _soXe,
			double _donGia, int _soTuyen, double _soKm)
	{
		super(_maCX, _hoTenTX, _soXe, _donGia);
		soTuyen = _soTuyen;
		soKm = _soKm;
	}
	
	double tinhDoanhThu() {
		return donGia * soKm;
	}

}
