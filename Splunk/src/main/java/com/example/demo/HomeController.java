package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@RequestMapping("/home")
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping
    public String home(
            @RequestParam(defaultValue = "default value", required = false) String value
    ){
        logger.error("Api Calling: Home {}",value);
        logger.warn("Api Calling: Home {}",value);
        logger.info("Api Calling: Home {}",value);

        logger.debug("Api Calling: Home {}",value);
        logger.trace("Api Calling: Home {}",value);
        return "this is home api " + value;
    }
}
