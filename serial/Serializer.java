package serial;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
public static void main(String[] args)throws IOException {
	Employee e1=new Employee(1,"Jane Doe",3256.4f);
	Employee e2=new Employee(2,"John Doe",1245.6f);
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Archana\\Desktop\\MPHASIS\\serial.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	System.out.println("Serializing....");
	oos.writeObject(e1);
	oos.writeObject(e2);
	System.out.println("Serialization is Done!!");
	oos.close();
}
}
