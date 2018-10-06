//package com.didispace.web;
//
//
//@RestController
//public class HelloController {
//
//    @RequestMapping(value="/hello")
//    public String index() {
//        return "Hello World";
//    }
//}

package com.didispace.web;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }

}
