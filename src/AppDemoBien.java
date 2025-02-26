
public class AppDemoBien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soNguyen;
		soNguyen = 4;
		
		//khai báo biến tham chiếu đối tượng
		//có tên là hcn
		//có kiểu tham chiếu đối tượng HinhChuNhat
		//Bước 1
		HinhChuNhat hcn;
		hcn.tinhDienTich();//LỖI VÌ CHƯA THỰC HIỆN BƯỚC 2,3
		//bước 2
		
		//BƯỚC 3:
		hcn = new HinhChuNhat();
		
		//dùng remote - biến tham chiếu đối tượng hcn
		hcn.tinhChuVi();

	}

}
