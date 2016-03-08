package springstuff;
import org.springframework.sterotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
public class HelloWorld {

	@RequestMapping(method=REquestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("message","This is spring framework");
		
		return "hello";
	}
}
