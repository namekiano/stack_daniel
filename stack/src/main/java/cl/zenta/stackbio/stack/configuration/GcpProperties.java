package cl.zenta.stackbio.stack.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import cl.zenta.stackbio.stack.configuration.GcpProperties;

@Configuration
@EnableConfigurationProperties(GcpProperties.class)
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "gcp")
public class GcpProperties {
	
    private String projectId;

    public String getProjectId() { return projectId; }
    public void setProjectId(String projectId) { this.projectId = projectId; }


    private String computeRegion;

    public String getComputeRegion() { return computeRegion; }
    public void setComputeRegion(String computeRegion) { this.computeRegion = computeRegion; }


    private String autommlModelId;

    public String getAutommlModelId() { return autommlModelId; }
    public void setAutommlModelId(String autommlModelId) { this.autommlModelId = autommlModelId; }

}
