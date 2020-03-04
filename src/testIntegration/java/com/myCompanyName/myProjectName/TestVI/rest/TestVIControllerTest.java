//package com.myCompanyName.myProjectName.TestVI.rest;
package com.virtualidentity.firasproject.authors.rest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.virtualidentity.firasproject.ApiMatchers;
import com.virtualidentity.firasproject.WebMvcTest;
import com.virtualidentity.firasproject.generated.model.TestVI;
import org.junit.jupiter.api.Test;

public class TestVIControllerTest  extends WebMvcTest {

  private static final String URL = "/testVI/";

  @Test
  public void WHEN_get_test_THEN_response_contains_correct_data_structure() throws Exception {
    // Act
    performGET(URL)

        // Assert
        .andExpect(status().isOk())
        .andExpect(ApiMatchers.responseMatchesModel(TestVI.class));
  }

  /*@Test
  public void WHEN_get_test_THEN_response_is_error() throws Exception {
    // Act
    performGET(URL)

        // Assert
        .andExpect(status().isInternalServerError())
        .andExpect(ApiMatchers.responseMatchesModel(Error.class));
  }*/

  @Test
  public void WHEN_get_test_THEN_response_is_not_found() throws Exception {
    // Act
    performGET(URL+"justToGet404")

        // Assert
        .andExpect(status().is4xxClientError());
  }

}
