package pers.chenjiahao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Jenkins示例代码
 * @author ChenJiahao(五条)
 * @date 2024/08/11 15:19:12
 */
@RestController
public class JenkinsDemoController {

    @GetMapping("demo01")
    public Object jenkinsDemo01(){
        return "jenkinsDemo01";
    }
}
