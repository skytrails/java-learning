package com.springmvc.helloworld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: hello controller$
 * @Param: $
 * @return: $
 * @Author: your name
 * @date: $
 */
@Controller
@RequestMapping("/hi")
public class helloController {

    @RequestMapping("/say")
    public String say() {
        return "hello";
    }
}
