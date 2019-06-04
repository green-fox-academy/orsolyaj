package com.gfa.apisandrest.controller;

import com.gfa.apisandrest.model.AHandler;
import com.gfa.apisandrest.model.DoUntilInput;
import com.gfa.apisandrest.model.ErrorModel;
import com.gfa.apisandrest.service.AppendAService;
import com.gfa.apisandrest.service.DoublingService;
import com.gfa.apisandrest.service.ErrorService;
import com.gfa.apisandrest.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {
  private DoublingService doublingService;
  private GreetingService greetingService;
  private ErrorService errorService;
  private AppendAService appendAService;

  public RestControllers(DoublingService doublingService, GreetingService greetingService, ErrorService errorService, AppendAService appendAService) {
    this.doublingService = doublingService;
    this.greetingService = greetingService;
    this.errorService = errorService;
    this.appendAService = appendAService;
  }

  @GetMapping("/doubling")
  public Object renderDoubling(@RequestParam(required = false) Integer input) {
    if (input != null) {
      return doublingService.doubling(input);
    } else
      return errorService.showError("Please provide input");
  }


  @GetMapping("/greeter")
  public Object renderGreet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (name != null && title != null) {
      return greetingService.toGreeting(name, title);
    } else if (name != null && title == null) {
      return errorService.showError("Please provide title");
    } else if (name == null && title != null) {
      return errorService.showError("Please provide name");
    } else
      return errorService.showError("Please provide a name and a title!");
  }

  @GetMapping("/appenda/{appendable}")
  public Object renderAppend(@PathVariable(required = false) String appendable) {
    if (appendable != null) {
      return appendAService.appendA(appendable);
    } else
      return errorService.showError("404");
  }

  @PostMapping("dountil/{action}")
  ResponseEntity<?> action(@PathVariable(required = false) String action, @RequestBody(required = false) DoUntilInput doUntilInput) {
    if (doUntilInput == null) {
      return ResponseEntity.status((HttpStatus.BAD_REQUEST)).body(errorService.showError("enter number"));
    } else if (action.equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK).body(doublingService.sum(doUntilInput.getUntil()));
    } else if (action.equals("factor")) {
      return ResponseEntity.status(HttpStatus.OK).body(doublingService.factor(doUntilInput.getUntil()));
    } else
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.showError("Please provide an action"));
  }

  @PostMapping("/arrays")
    ResponseEntity<?> arrayHandler(@RequestBody(required = false)AHandler aHandler) {
    if (aHandler== null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.showError("no object"));
    } else  {
      return ResponseEntity.status(HttpStatus.OK).body(aHandler.getResult());
    }
  }
}

//  @ExceptionHandler( {MissingServletRequestParameterException.class, NullPointerException.class})
//  public ErrorModel handleMissingServletRequestParameterException() {
//    return new ErrorModel("SuchError");
//  }

