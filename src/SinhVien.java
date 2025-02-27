
public class SinhVien {
	
	//biến đối tượng - instance variable
	//field - trường
	//attribute - thuộc tính
	int maSV;
	String hoTen;
	float diemLT;
	float diemTH;
	
	//hàm khởi tạo đối tượng mặc định
	SinhVien()
	{
		maSV = 0;
		hoTen = null;
		diemLT = 0;
		diemTH = 0;
	}
	
	//hàm khởi tạo đôi tượng có 4 tham số
	SinhVien(int _maSV, String _hoTen, float _diemLT,
			float _diemTH)
	{
		maSV = _maSV;
		hoTen = _hoTen;
		diemLT = _diemLT;
		diemTH = _diemTH;
	}
	
	//method - phương thức - trở thành hành vi của
	//đối tượng
	float tinhDiemTrungBinh()
	{
		float diemTB;
		diemTB = (diemLT + diemTH)/2;
		return diemTB;
	}
	
	//toString()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
