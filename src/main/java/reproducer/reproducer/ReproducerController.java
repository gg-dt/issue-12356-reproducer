package reproducer.reproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ReproducerController {

    @GetMapping("/get/{param}")
    String get(@PathVariable("param") String param) {
        return param;
    }

}
