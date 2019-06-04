package com.gfa.apisandrest.service;

import com.gfa.apisandrest.model.ErrorModel;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {
   public ErrorModel showError(String string) {
     return new ErrorModel(string);
   }
}
