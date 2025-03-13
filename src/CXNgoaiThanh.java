
public class CXNgoaiThanh extends ChuyenXe{
	
	//ô 2
	String noiDen;
	int soNgayDi;
	
	//ô 3
	CXNgoaiThanh(){}
	
	CXNgoaiThanh(int _maCX,
			String _hoTenTX,
			String _soXe,
			double _donGia, String _noiDen,	int _soNgayDi)
	{
		super(_maCX, _hoTenTX, _soXe, _donGia);
		noiDen = _noiDen;
		soNgayDi = _soNgayDi;
	}
	
	@Override
	double tinhDoanhThu()
	{
		return donGia * soNgayDi;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n[NOI DEN]: " + noiDen +
				"\n[SO NGAY DI]: "+ soNgayDi;
	}
}
