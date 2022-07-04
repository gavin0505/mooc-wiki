package icu.zxb996.wiki.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author gavin
 */
@ComponentScan("icu.zxb996")
@SpringBootApplication
@Slf4j
public class WikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikiApplication.class, args);
        log.info("启动成功！");
    }

}
