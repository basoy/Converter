package com.bash.serg;

import com.bash.serg.converters.Converter;
import com.bash.serg.inputs.TextProvider;
import com.bash.serg.outputs.TextOutput;
import org.springframework.stereotype.Component;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Serg Bash on 20.01.2016.
 */
@Component
public class Controller {

    @Inject
    @Named("consoleIn")
    private TextProvider textProvider;
    @Inject
    @Named("funky")
    private Converter converter;
    @Inject
    @Named("consoleAndWindow")
    private TextOutput textOutput;

    void initialize(){
        textOutput.showText(converter.convert(textProvider.putText()));
    }
}
