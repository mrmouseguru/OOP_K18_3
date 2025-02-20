import java.util.Scanner;

public class AppHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//khai báo biến có tên hcn có kiểu 
		//dữ liệu là HinhChuNhat
		HinhChuNhat hcn;
		Scanner keyboardInput;
		float chieuDai = 0;
		float chieuRong = 0;
		float dienTich = 0;
		float chuVi = 0;
		
		
		//khởi tạo đối tượng Scanner
		keyboardInput = new Scanner(System.in);
		//gán đối tượng cho biến keyboardInput
		System.out.print("[NHAP CHIEU DAI]:");
		chieuDai = keyboardInput.nextFloat();
		System.out.print("[NHAP CHIEU RONG]:");
		chieuRong = keyboardInput.nextFloat();
		
		
		//gọi hàm tinhDienTich và hàm tinhChuVi()
		//thông qua biến hcn
		//khởi tạo đối tượng HinhChuNhat
		hcn = new HinhChuNhat(chieuDai, chieuRong);
		//gán đối tượng HinhChuNhat cho biến hcn
		dienTich = hcn.tinhDienTich();
		chuVi = hcn.tinhChuVi();
		
		//hiển thị kết quả
		System.out.println("[DIEN TICH HCN]: " + dienTich);
		System.out.println("[CHU VI HCN]: " + chuVi);
	}

}
