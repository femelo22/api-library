package br.com.lfmelo.resources.exception;

import org.aspectj.weaver.ast.Not;
import org.springframework.validation.BindingResult;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiErros {

    private List<String> errors;

    public ApiErros(BindingResult bindingResult) {
        this.errors = new ArrayList<>();
        bindingResult.getAllErrors().forEach(error -> {
            this.errors.add(error.getDefaultMessage());
        });
    }

    public ApiErros(BusinessException ex) {
        this.errors = Arrays.asList(ex.getMessage());
    }

    public ApiErros(NotFoundException ex) {
        this.errors = Arrays.asList(ex.getMessage());
    }

    public List<String> getErrors() {
        return errors;
    }
}
