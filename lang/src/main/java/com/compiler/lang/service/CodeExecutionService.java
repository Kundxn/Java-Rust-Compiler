package com.compiler.lang.service;

import com.compiler.lang.model.CodeInput;
import com.compiler.lang.model.CodeResponse;
import org.springframework.stereotype.Service;

@Service
public class CodeExecutionService {

    public CodeResponse executeCode(CodeInput input) {
        String language = input.getLanguage();
        String code = input.getCode();
        String output = "Executed code in " + language + ": " + code;

        return new CodeResponse("success", output);
    }
}
