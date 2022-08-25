package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("name = {}", name);
        log.debug("name = {}", name);
        log.info("name = {}", name);
        log.warn("name = {}", name);
        log.error("name = {}", name);

        return "ok";
    }
}
