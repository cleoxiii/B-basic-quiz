package com.thoughtworks.gtb.basicquiz.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EducationControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_get_education_list_by_id() throws Exception {
        mockMvc.perform(get("/users/1/educations"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].title", is("Secondary school specializing in artistic")))
                .andExpect(jsonPath("$[0].year", is(2005)))
                .andExpect(jsonPath("$[1].title", is("First level graduation in Graphic Design")))
                .andExpect(jsonPath("$[1].year", is(2009)));
    }
}
