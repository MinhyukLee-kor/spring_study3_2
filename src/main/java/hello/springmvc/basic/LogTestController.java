package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    private Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace(" info log={}",name);
        log.debug(" info log={}",name);
        log.info(" info log={}",name);
        log.warn(" info log={}",name);
        log.error(" info log={}",name);

        return "ok";
    }
}
