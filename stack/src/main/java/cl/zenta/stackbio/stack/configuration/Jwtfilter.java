package cl.zenta.stackbio.stack.configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;

import cl.zenta.stackbio.stack.helper.MessageErrorHelper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.TextCodec;

public class Jwtfilter implements Filter{
	
	@Value("${wallet.jwt.secret}")
	private String secret;
	
	@Value("${wallet.jwt.bearer}")
	private String bearer;
	 
	@Override
	public void init(final FilterConfig filterConfig) throws ServletException {
	 
	}
	  
	@Override
	public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain) throws IOException, ServletException {

		final HttpServletRequest request = (HttpServletRequest) req;
	    final HttpServletResponse response = (HttpServletResponse) res;
	    final String authHeader = request.getHeader("authorization");
	 
	    if (HttpMethod.OPTIONS.toString().equals(request.getMethod())) {
	      response.setStatus(HttpServletResponse.SC_OK);
	      chain.doFilter(req, res);
	    } else {
	 
	      if (authHeader == null || !authHeader.startsWith(bearer)) {
	        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	        response.getWriter().write(MessageErrorHelper.tokenIdValidationException("Token inválido", "formato incorrecto."));
	        response.getWriter().flush();
	        response.getWriter().close();
	        return;
	      }
	 
	      final String token = authHeader.substring(bearer.length());
	 
	      try {
	        final Claims claims = Jwts.parser()
	            .setSigningKey(TextCodec.BASE64.encode(secret))
	            .parseClaimsJws(token)
	            .getBody();
	        request.setAttribute("claims", claims);
	      } catch (final Exception e) {
	        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	        response.getWriter().write(MessageErrorHelper.tokenIdValidationException("Token inválido", "el token se encuentra expirado. Realize login para obtener uno nuevo."));
	        response.getWriter().flush();
	        response.getWriter().close();
	        return;
	      }
	 
	      chain.doFilter(req, res);
	    }
	}

	@Override
	public void destroy() {
		
	}

}
