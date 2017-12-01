package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/inla/wepa2017-AliveApplication";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/inla/wepa2017-AliveApplication";
    }

    public static String herokuUrl() {
        return "https://vast-cove-32375.herokuapp.com/";
    }
}
