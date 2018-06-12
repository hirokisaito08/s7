package sbpayment.jp.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class mianController {
	
	@GetMapping("/intro")
	public String index() {
		return "index";
	}
	
	@Autowired
    private JdbcTemplate jdbc;

	
	@PostMapping("/post")
	public String Post(String id, String reason, int acc, RedirectAttributes attr){
	attr.addAttribute("id", id);
	attr.addAttribute("reason", reason);
	attr.addAttribute("acc", acc);

	   
	jdbc.update("INSERT INTO accumulation (id,reason,acc) VALUES (?,?,?)",id,reason,acc);
	  
	   
	   return "redirect:/index";
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

