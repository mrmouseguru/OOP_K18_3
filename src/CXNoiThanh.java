
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
	
	//toString()
	@Override
	public String toString() {
		return /*"[MA CX]: " + maCX + "\n" +
				"[HO TEN TX]: " + hoTenTX + "\n" +
				"[SO XE]: " + soXe*/ super.toString() + 
				"\n[SO TUYEN]: " + soTuyen +
				"\n[SO KM]: " + soKm;
		//...
	}

}
