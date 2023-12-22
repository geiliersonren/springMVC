package com.study.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: HelloController
 * Package: com.study.mvc
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/21 22:24
 * @Version 1.0
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String getindex() {
        return "index";
    }

    @RequestMapping(value = "/hello")
    public String getHello() {

        return "hello";
    }

    @RequestMapping(value = "/target")
    public String getTarget() {

        return "target";
    }
}
