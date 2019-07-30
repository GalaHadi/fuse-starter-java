package org.galatea.starter.entrypoint;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import lombok.extern.slf4j.Slf4j;
import org.galatea.starter.ASpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@Slf4j
// We don't load the entire spring application context for this test.
@WebMvcTest(StockPriceRestController.class)
public class StockPriceRestControllerTest extends ASpringTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void testHelloWorld() throws Exception {

    this.mvc.perform(
        get("/stockPrice").accept(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(jsonPath("$", is("Hello World")));
  }

}