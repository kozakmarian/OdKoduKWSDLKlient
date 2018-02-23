package ajsserver;

public class Klient {

	public static void main(String[] args) throws AjsException_Exception {
		AjsServiceService service = new AjsServiceService();
		AjsService ajsService = service.getAjsServicePort();

	    
	    System.out.println(ajsService.pridajPredmet("Statistika"));

	}

}
