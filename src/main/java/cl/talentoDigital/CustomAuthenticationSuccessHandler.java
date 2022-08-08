package cl.talentoDigital;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
@Configuration
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// estoy implementando en método onAuthenticationSuccess con mi propio sistema de redireccionamiento, 
		//para poder tener una forma personalizada de redirigir a distintas vistas, mis roles o perfiles
		Set<String> roles =AuthorityUtils.authorityListToSet(authentication.getAuthorities());
		if (roles.contains("ADMIN")) { //ROL_es un prefijo (se usa cuando viene como rol desde la configuración de seguridad configure(AuthenticationManagerBuilder auth)),
			//lo que viene a continuación es el nombre del rol (Ej: ROL_BODEGA, ROL_USER. ROL_ADMIN), si viene como autoridad (y no como rol), entonces no es necesario poner el prefijo ROL_
			response.sendRedirect("/admin"); // se va al controlador que tiene ese pathern (AdminController, a su método home)

			} else {
			response.sendRedirect("/user");// se va al controlador que tiene ese pathern (HomeController, a su método home)

		}
	}

}
