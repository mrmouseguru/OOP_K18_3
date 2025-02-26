
public class HinhChuNhat {
	
	//khai báo biến
	float chieuDai;
	float chieuRong;
	
	//khai báo và định nghĩa hàm
	HinhChuNhat()
	{
		//code
		chieuDai = 0;
		chieuRong = 0;
	}
	
	HinhChuNhat(float cd, float cr)
	{
		//code
		chieuDai = cd;
		chieuRong = cr;
	}
	//phương thức - method
	float tinhDienTich()
	{
		//code
		float dienTich = 0;
		dienTich = chieuDai * chieuRong;
		return dienTich;
	}
	//method - 
	float tinhChuVi()
	{
		float chuVi = 0;
		chuVi = (chieuDai + chieuRong) * 2;
		return chuVi;
	}
	//hàm - function
	//đây KHÔNG PHẢI LÀ METHOD
	//vì nó sẽ không trở thành hành của đối tượng
	//không có việc NHẬN THÔNG ĐIỆP 
	//DIỄN RA Ở ĐÂY
	static void xyz() {
		System.out.println("XYZ");
	}

}
