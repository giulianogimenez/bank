package br.gov.sp.fatec.bank.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class AccountsBoot {

	public static void main(String[] args) {
		SpringApplication.run(AccountsBoot.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "accounts";
	}
}
