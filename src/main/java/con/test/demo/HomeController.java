package con.test.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengyongjun
 * @date 6/15/20 7:49 AM
 */

@RestController
@RequestMapping(value = "/home")
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger (HomeController.class);


    @RequestMapping(value = "/index")
    public String Index()
    {
        return "hello world";
    }

}
