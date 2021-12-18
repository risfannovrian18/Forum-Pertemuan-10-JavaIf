public class KetentuanInputNama {

	public static void main(String[] args) {
		String nama = "Risfan Novrian";
		
		if (nama.length() < 3) {
			System.out.println("Nama tidak boleh kurang dari 3 karakter!");
		}else if (nama.length() > 30) {
			System.out.println("Nama tidak boleh lebih dari 30 karakter!");
		}else {
			System.out.println("Nama yang bagus!!");
		}
	}

}
