package cl.talentoDigital.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.talentoDigital.dto.DetalleDTO;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientController {
	@GetMapping("/user")
	public ModelAndView home(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("client/home");
		modelAndView.addObject("detalle", new DetalleDTO());
		modelAndView.addObject("valores", session.getAttribute("valores"));
		return modelAndView;
	}

	@PostMapping("/users")
	public RedirectView home(HttpSession session, @ModelAttribute DetalleDTO detalle) {
		List<DetalleDTO> listaDetalles = new ArrayList<>();
		if (session.getAttribute("valores") != null)
			listaDetalles.addAll((List<DetalleDTO>) session.getAttribute("valores"));
		listaDetalles.add(detalle);
		session.setAttribute("valores", listaDetalles);
		return new RedirectView("/user");
	}
}