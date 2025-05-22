package vn.vuduy.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Disable Security(Bảo mật login)
//include(Bao gồm)----exclude(Loại bỏ)
//exclude = org.springframework.boot.autoconfigure.security.servlet(Config bình thường riêng class này loại bỏ ra)
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)

public class LaptopshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopshopApplication.class, args);
	}

}
