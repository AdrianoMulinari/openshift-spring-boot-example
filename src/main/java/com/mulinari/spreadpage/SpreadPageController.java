package com.mulinari.spreadpage;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{userId}")
public class SpreadPageController {
	
	@RequestMapping(method = RequestMethod.GET)
	String findCoins(@PathVariable String userId) {
		return "Message for UserId: " + userId;
	}

}
