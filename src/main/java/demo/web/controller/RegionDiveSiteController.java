package demo.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegionDiveSiteController {

	@RequestMapping(value = "/getDiveSites", method = RequestMethod.POST)
	public @ResponseBody WebhookResponse getAllDiveSites(@RequestBody String region) {

		// Map used for list of countries
		Map<String, List<String>> mapCountries = new HashMap<>();

		// list of indian dives
		List<String> listIndia = Arrays.asList("Planet Scuba India", "Dive Goa");
		mapCountries.put("India", listIndia);

		// list of usa dives
		List<String> listUsa = Arrays.asList("Divers Direct", "Scuba Works", "US Scuba Center");
		mapCountries.put("USA", listUsa);

		return new WebhookResponse("Country Not Found", "Country Not Found");

	}
}
