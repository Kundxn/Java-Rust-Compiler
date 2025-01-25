package com.compiler.lang.controller;

import com.compiler.lang.model.CodeInput;
import com.compiler.lang.model.CodeResponse;
import com.compiler.lang.service.CodeExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/interpreter")
public class InterpreterController {

    @Autowired
    private CodeExecutionService codeExecutionService;

    @PostMapping("/execute")
    public CodeResponse executeCode(@RequestBody CodeInput input) {
        return codeExecutionService.executeCode(input);
    }
}
