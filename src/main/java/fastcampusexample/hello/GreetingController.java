package fastcampusexample.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!"; //상수
    private final AtomicLong counter = new AtomicLong(); //AtomicLong? -> 원자처럼 변형되거나 하지 않고 온전하게 끝나는 연산

    @RequestMapping("/greeting") //url 요청을 받아와서 반환함
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        //RequestParam 은 url에서 보내진 파라메터를 받아와서 지역변수로 바꿔줌

        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        //counter.incrementAndGet() : 하나 증가한 수 가져와서 아이디로 대입
        //String.format: 변수가 있는 문자열을 출력해줌.
    }
}
