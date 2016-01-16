package pl.keruzam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@RequestMapping("/status")
	public String status() {
		return "<h1>OK.</h2>";
	}

}
