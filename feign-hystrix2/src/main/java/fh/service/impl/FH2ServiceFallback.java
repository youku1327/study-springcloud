package fh.service.impl;

import fh.service.FH2Service;
import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p> </p>
 */
@Component
public class FH2ServiceFallback implements FH2Service {
    @Override
    public String getFeign(String username) {

        return "sorry feilure,you can try it again";
    }
}
