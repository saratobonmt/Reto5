package co.usa.ciclo3.ciclo3.web;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Profile")
public class ControllerProfile {
	@GetMapping("/view")
	public Map<String, Object> viewProfile(@AuthenticationPrincipal OAuth2User oAuth2User) {
		return oAuth2User.getAttributes();
	}

}
