package group.msg.at.cloud.cloudtrain;

import group.msg.at.cloud.common.observability.CommonObservability;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Point of entry for this Spring Boot application.
 */
@SpringBootApplication(scanBasePackageClasses = {SpringDownstreamApplication.class, CommonObservability.class})
public class SpringDownstreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDownstreamApplication.class, args);
    }
}
