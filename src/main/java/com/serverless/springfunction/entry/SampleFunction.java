package com.serverless.springfunction.entry;

import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
public class SampleFunction implements Function<String, String> {

    @Override
    public String apply(String input) {
        return "Hello " + input;
    }
}
