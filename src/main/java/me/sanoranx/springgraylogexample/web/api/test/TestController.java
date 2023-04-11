package me.sanoranx.springgraylogexample.web.api.test;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import me.sanoranx.springgraylogexample.web.api.test.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TestController {

    TestService testService;

    public void testGetMethod() {
        log.info("TEST GET METHOD IN TestController WAS CALLED!");
        testService.testMethod();
    }

}
