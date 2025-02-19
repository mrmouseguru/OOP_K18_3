import java.util.Scanner;

public class DuLieuIO {
	
	//khai báo biến
	Scanner keyboardInput;
	NhanHaiSo nhan2So;
	
	//khai báo và định nghĩa hàm
	DuLieuIO()
	{
		keyboardInput = new Scanner(System.in);
	}
	
	void nhapXuatDuLieu() {
		//code
		float number1;
		float number2;
		float result;
		//
		keyboardInput = new Scanner(System.in);
		System.out.print("[NHAP VAO SO THU NHAT]:");
		number1 = keyboardInput.nextFloat();
		System.out.print("[NHAP VAO SO THU HAI]:");
		number2 = keyboardInput.nextFloat();
		
		//lời gọi hàm tinhTich2So() của Class NhanHaiSo
		//khởi tạo đối tượng NhanHaiSo
		nhan2So = new NhanHaiSo(number1, number2);
		//result = tinhTich2So(number1, number2);
		result = nhan2So.tinhTich2So();
		
		//in kết quả
		System.out.println("Ket qua tich 2 so: " + result);
		return;
	}

}
