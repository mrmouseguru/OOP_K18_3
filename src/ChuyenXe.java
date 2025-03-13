
public class ChuyenXe {

	// ô 2
	int maCX;
	String hoTenTX;
	String soXe;
	double donGia;

	// ô 3
	ChuyenXe() {

	}

	ChuyenXe(int _maCX, String _hoTenTX, 
			String _soXe, double _donGia) {

		maCX = _maCX;
		hoTenTX = _hoTenTX;
		soXe = _soXe;
		donGia = _donGia;

	}
	
	double tinhDoanhThu()
	{
		return 0;
	}
	
	@Override
	public String toString() {
		return "[MA CX]: " + maCX + "\n" +
				"[HO TEN TX]: " + hoTenTX + "\n" +
				"[SO XE]: " + soXe;
		//...
	}

}
