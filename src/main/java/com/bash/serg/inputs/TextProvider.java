package com.bash.serg.inputs;

import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@Component
public interface TextProvider {
    String putText() throws IOException;
}
