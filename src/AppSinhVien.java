
public class AppSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bước 1:
		//khai báo 3 biến tham chiếu đối tượng
		//có tên sv1, sv2, sv3 với kiểu dữ liệu
		//tham chiếu đôi tượng SinhVien
		SinhVien sv1;
		SinhVien sv2;
		SinhVien sv3;
		float diemTB;
		
			      //bước 2 
	//bước3	     //khởi tạo đối tượng
		sv1 =    new SinhVien(1111, "Le Van teo", 2, 2);
		
		//gửi thông điệp đến hành vi tinhDiemTrungBinh()
		diemTB = sv1.tinhDiemTrungBinh();
		
		//kết quả
		System.out.println("diem trung binh cua sv1: " + diemTB);
		System.out.println("ten sv1: " + sv1.hoTen);
	}

}
