package cl.zenta.stackbio.stack.configuration;

import org.springframework.context.ApplicationContextAware;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter implements ApplicationContextAware {

	@Override
    protected void configure(HttpSecurity security) throws Exception
    {
        security.httpBasic().disable();
        getHttp().csrf().disable();
    }
}
