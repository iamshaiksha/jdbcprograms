import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(format.format(date));
	}

}

