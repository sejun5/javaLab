package Work;

public class Shopservice {

		private static Shopservice singleton = new Shopservice();
		 
		private Shopservice() {
		}
		static Shopservice getInstance() {
			 
		return singleton;
		}
}
