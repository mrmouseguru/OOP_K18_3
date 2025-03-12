import java.io.PrintWriter;
import java.util.Scanner;

public class CXInput {

	// ô 2
	Scanner keyboard;
	PrintWriter out;

	// ô 3
	CXInput() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
	}

	CXInput(Scanner _keyboard, PrintWriter _out) {
		keyboard = _keyboard;
		out = _out;
	}

	void input() {
		// nhập vào thông tin của chuyên xe
		int maCX;
		String hoTenTX;
		String soXe;
		double donGia;
		int loaiCX;
		int soTuyen;
		float soKm;
		int soNgayDi;
		String noiDen;
		out.print("[NHAP MA CX]:");
		out.flush();
		maCX = keyboard.nextInt();//<= 1111Enter
		//maCX = 1111
		keyboard.nextLine();//<= "Enter"
		// họ tên tài xế
		out.print("[NHAP HO TEN TAI XE:]");
		out.flush();
		hoTenTX = keyboard.nextLine();//chờ nhập

		// số xe
		out.print("[NHAP SO XE:]");
		out.flush();
		soXe = keyboard.nextLine();//<=

		// nhập đơn giá
		out.print("[NHAP DON GIA:]");
		out.flush();
		donGia = keyboard.nextFloat();

		// sự lựa chọn loại chuyến xe nào?
		// nhập sự lựa chọn
		out.print("[CHỌN LOẠI CHUYẾN XE \n1 - Noi Thanh / 2 - Ngoai Thanh]");
		out.flush();
		loaiCX = keyboard.nextInt();
		
		//kiểm tra xem người dùng đã nhập loại nào
		if(loaiCX == 1) {
			//nhập thông tin cx nội thành
			out.print("[NHAP SO TUYEN:]");
			out.flush();
			soTuyen = keyboard.nextInt();
			
			//số km
			out.print("[NHAP SO KM:]");
			out.flush();
			soKm = keyboard.nextFloat();
		}
		if(loaiCX == 2) {
			out.print("[NHAP SO NGAY DI]");
			out.flush();
			soNgayDi = keyboard.nextInt();
			keyboard.nextLine();//<===Enter
			
			out.print("[NHAP NOI DEN:]");
			out.flush();
			noiDen = keyboard.nextLine();
		}

	}

}
