package com.virtualidentity.firasproject.authors.rest;

import com.virtualidentity.firasproject.common.rest.controller.BaseController;
import com.virtualidentity.firasproject.generated.TestVIApi;
import com.virtualidentity.firasproject.generated.model.TestVI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class TestVIController extends BaseController implements TestVIApi {

  @Override
  public ResponseEntity<TestVI> getStringTest() {

    TestVI vi = new TestVI().value("Virtual Identity");

    return new ResponseEntity<>(vi, HttpStatus.OK);
  }
}
