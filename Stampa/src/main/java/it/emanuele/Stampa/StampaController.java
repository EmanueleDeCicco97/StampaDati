package it.emanuele.Stampa;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class StampaController{
	String ciao = new String("");
	String totale;	

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		model.put("ciao", this.ciao);
			
		return "Form";
	}
	
	@RequestMapping(value="/dati", method=RequestMethod.POST)
	public String savePersonPost(@ModelAttribute Stampadati dati) {
		System.out.println(dati.getNome() + " " + dati.getCognome() + " "+ dati.getData());
		return "Dati";
	}
    
}