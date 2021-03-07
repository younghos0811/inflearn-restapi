package com.younghok.inflearndemorestapi.events;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest  //web 관련 bean 테스트
public class EventControllerTests {

    @Autowired
    MockMvc mockMvc; //web서버를 뛰우진 않지만 디스패처서블릿을 만들기떄문에 단위테스트보다는 느림

    @Test
    public void createrEvent() throws Exception {
        mockMvc.perform(post("/api/events/")
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaTypes.HAL_JSON)
                    )
                .andExpect(status().isCreated());
    }

}
