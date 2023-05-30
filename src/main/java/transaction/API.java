package transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class API {
    @Autowired
    AService aService;
    @GetMapping("/")
    public String test() {
//        aService.tttt();
        return "ddd";
    }
}
