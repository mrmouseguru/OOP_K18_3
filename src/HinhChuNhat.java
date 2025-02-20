
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
	
	float tinhDienTich()
	{
		//code
		float dienTich = 0;
		dienTich = chieuDai * chieuRong;
		return dienTich;
	}
	
	float tinhChuVi()
	{
		float chuVi = 0;
		chuVi = (chieuDai + chieuRong) * 2;
		return chuVi;
	}

}
