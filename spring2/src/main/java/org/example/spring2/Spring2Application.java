package org.example.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Spring2Application implements CommandLineRunner {

    @Autowired //싱글톤으로 만들어서 램에 들어있는 객체의 주소를 찾아줌.
    Environment environment; //100번 (주소를 찾음)
    //설정파일에 설정된 값을 가지고 올 수 있는 객체
    //스프링 시작될 때 싱글톤으로 프리로딩되어있는 객체
    //preloading --> 미리 쓰기전에 메모리에 올려두는 것
    public static void main(String[] args) {
        SpringApplication.run(Spring2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //프로퍼티(속성, 특징)는 String으로 리턴
        //environment.getProperty를 통해 application.properties에서 적용한 값을 읽어올 수 있음
        String port = environment.getProperty("server.port", "8080");
        System.out.println("=======================");
        System.out.println("스프링 부트 프로젝트 시작됨");
        //System.out.println("http://localhost:8888"); --> port 이대로 코드에 쓰면 보안 상의 문제
        System.out.println("http://localhost:" + port);
        System.out.println("=======================");

    }
}
