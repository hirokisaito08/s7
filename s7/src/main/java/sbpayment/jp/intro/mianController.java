package sbpayment.jp.intro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mianController {
	
	@GetMapping("/intro")
	public String index() {
		return "index";
	}
	
	@GetMapping("/Registration")
	public String Registration() {
		return "Registration";
	}
	
	@GetMapping("/classification")
	public String classification() {
		return "classification";
	}
	
}

