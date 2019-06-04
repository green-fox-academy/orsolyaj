package com.gfa.resttest;

import com.gfa.resttest.controller.GuardianController;
import com.jayway.jsonpath.JsonPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;


  @Test
  public void grootWithQueryParam() throws Exception {
    mockMvc.perform(get("/groot?message=kakao"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.message", is("kakao")));
  }

  @Test
  public void grootWithOutQueryParam() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void yonduWithQueryParam() throws Exception {
    mockMvc.perform(get("/yondu?distance=6&time=2"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.distance", is(6)))
            .andExpect(jsonPath("$.time", is(2)))
            .andExpect(jsonPath("$.speed", is(3)));
  }

  @Test
  public void yonduWithOutQueryParam() throws Exception {
    mockMvc.perform(get("/yondu"))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.error", is("Enter distance and time, time cant be 0")));
  }
}
