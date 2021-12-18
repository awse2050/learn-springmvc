package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // Rest API 핵심 Annotation
public class LogTestController {


    // private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";
        // 아래와 같이 사용하면 안된다.
        // 자바 언어와 관련이 있음.
        // 문자 연산이 일어나기 떄문에 쓸모없는 메모리를 사용하게 된다.
        log.info("sdfds : " + name);
        log.info("log : {}", name); // 메서드를 호출시 파라미터만 던지는 것

        // log 레벨 설정
        log.trace("trace : {}", name);
        log.debug("debug : {}", name);
        log.error("error : {}", name);
        log.warn("warn : {}", name);

        // Controller와 다르게 진짜 텍스트가 반환된다.
        return "ok";
    }

}
