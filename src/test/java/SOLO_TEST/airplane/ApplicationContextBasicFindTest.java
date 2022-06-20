package SOLO_TEST.airplane;

import SOLO_TEST.airplane.client.ClientService;
import SOLO_TEST.airplane.client.ClientServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
        ClientService clientService = ac.getBean("clientService", ClientService.class);
        assertThat(clientService).isInstanceOf(ClientServiceImpl.class);
    }


    @Test
    @DisplayName("이름없이 타임으로 조회")
    void findBeanByType(){
        ClientService clientService = ac.getBean(ClientService.class);
        assertThat(clientService).isInstanceOf(ClientServiceImpl.class);
    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByType2(){
        ClientService clientService = ac.getBean("clientService", ClientServiceImpl.class);
        assertThat(clientService).isInstanceOf(ClientServiceImpl.class);
    }

    @Test
    @DisplayName("빈 이름으로 조회X")
    void findByNameX(){
//        ac.getBean("xxxx",ClientService.class)
//        ClientService xxxx = ac.getBean("xxxx", ClientService.class);
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("xxxx", ClientService.class));
    }
}
