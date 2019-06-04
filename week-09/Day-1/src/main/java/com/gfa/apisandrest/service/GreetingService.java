package com.gfa.apisandrest.service;

import com.gfa.apisandrest.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
  public Greeting toGreeting(String name, String title) {
   Greeting greeting = new Greeting(name,title);
   greeting.setGreet("Oh hi there " + name + " my dear " + title);
   return greeting;
  }
}
