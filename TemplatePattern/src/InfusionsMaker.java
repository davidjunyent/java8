import com.dj.bar.Barman;
import com.dj.exceptions.NoEsPotServirException;
import com.dj.infusionstemplate.TeNegre;
import com.dj.infusionstemplate.TeVerd;

public class InfusionsMaker {
	public static void main(String args[]) {
		
		try {
			new Barman().fesInsusio(new TeNegre(), new TeVerd(), new TeNegre());
		} catch (NoEsPotServirException e) {
			e.printStackTrace();
		}
	}
}
