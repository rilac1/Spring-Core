package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (
        // 뺄 목록을 지정 (강의 편의상 AppConfig 를 뺀다. 실무에서는 굳이 안뺌)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))

public class AutoAppConfig {

    // 같은 이름으로 빈을 올리려한다면 수동으로 등록한 빈이 우선으로 호출된다.
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
