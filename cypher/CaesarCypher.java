package cypher;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CaesarCypher {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:\\Users\\Archana\\Desktop\\MPHASIS\\Final.txt");
		FileWriter fw = new FileWriter("C:\\Users\\Archana\\Desktop\\MPHASIS\\Final_encrypt.txt");
		FileReader e=new FileReader("C:\\Users\\Archana\\Desktop\\MPHASIS\\Final_encrypt.txt");
		FileWriter d=new FileWriter("C:\\Users\\Archana\\Desktop\\MPHASIS\\Final_decrypt.txt");
		int ch = 0;
		String data="";
//		System.out.println("Data initially");
		while ((ch = fr.read()) != -1) {
//			System.out.print((char) ch);
			data+=(char)(ch+2);
		}
//		System.out.println();
//		System.out.println("Encrypted data");
//		System.out.println(data);
		fw.write(data);
		System.out.println("Encrypting Data...");
		fr.close();
		fw.close();
		int chE=0;
		String decryptData="";
//		System.out.println();
//		System.out.println("Data in encrypted format again");
		while((chE=e.read())!=-1) {
//			System.out.print((char) chE);
			decryptData+=(char)(chE-2);
		}
//		System.out.println();
//		System.out.println("Decrypted data");
//		System.out.println(decryptData);
		d.write(decryptData);
		System.out.println("Decrypting Data...");
		System.out.println("Operation Performed Successfully!!");
		e.close();
		d.close();

	}

}
