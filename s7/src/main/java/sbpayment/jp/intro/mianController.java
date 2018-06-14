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

	
	



//	@PostMapping("/classification")
//	public String Post(int id,String reason, int acc, RedirectAttributes attr){
//		attr.addAttribute("id", id);
//		attr.addAttribute("reason", reason);
//		attr.addAttribute("acc", acc);
//			jdbc.update("INSERT INTO accumulation (id,reason,acc) VALUES (?,?,?)",id,reason,acc);
//	attr.addFlashAttribute("data",jdbc.queryForList("SELECT * FROM accumulation"));
//	
//	   return "redirect:/classification";
//	}
	
	@PostMapping("/classification")
	public String Post(String reason[], int acc[], RedirectAttributes attr){
		for(int i=0;i<reason.length;i++) {
//		attr.addAttribute("sreaon", reason);
//		attr.addAttribute("acc", acc);
		jdbc.update("INSERT INTO accumulation (reason,acc) VALUES (?,?)",reason[i],acc[i]);
//		attr.addFlashAttribute("data",jdbc.queryForMap("SELECT * FROM accumulation"));
		}
	return "redirect:/classification";
	}
	
	
	////
//	@GetMapping("/classification")
//	public String list(Model model) {
//		
//		model.addAttribute("data",jdbc.queryForList("SELECT * FROM accumulation"));
//		return "/classification";
//	}
	/////
	
	
	
	@GetMapping("/Registration")
	public String Registration() {
		return "Registration";
	}
	
	@GetMapping("/classification")
	public String classification() {
		return "classification";
	}
	
}

