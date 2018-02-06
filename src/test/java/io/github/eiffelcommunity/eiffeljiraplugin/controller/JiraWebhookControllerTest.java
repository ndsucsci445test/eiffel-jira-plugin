package io.github.eiffelcommunity.eiffeljiraplugin.controller;

import io.github.eiffelcommunity.eiffeljiraplugin.service.JiraEiffelMappingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(JiraWebhookController.class)
public class JiraWebhookControllerTest {

    @MockBean
    JiraEiffelMappingService mappingService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getRequestIsNotAllowed() throws Exception {
        mockMvc
                .perform(
                        get("/webhooks/jira"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void malformedJsonIsBadRequest() throws Exception {
        mockMvc
                .perform(
                        post("/webhooks/jira")
                                .contentType("application/json")
                                .content("{\"shouldBe\": \"rejected\"}"))
                .andExpect(status().isBadRequest());
    }
}
