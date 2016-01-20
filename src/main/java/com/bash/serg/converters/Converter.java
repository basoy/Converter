package com.bash.serg.converters;

import org.springframework.stereotype.Component;

/**
 * Created by Serg Bash on 18.01.2016.
 */
@Component
public interface Converter {
   String  convert(String inputText);
}
