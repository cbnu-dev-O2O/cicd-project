package kr.easw.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public ResponseEntity<Void> test1() {
        System.out.println("test1");
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/test2")
    public ResponseEntity<Void> test2() {
        System.out.println("test2");
        return ResponseEntity.noContent().build();
    }

   // @GetMapping("/test3")
    public ResponseEntity<String> test3(){
        System.out.println("test3");

        return ResponseEntity.ok("Hello World");
    }

}
