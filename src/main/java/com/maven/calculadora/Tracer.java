package com.maven.calculadora;

import org.springframework.stereotype.Component;
import io.corp.calculator.TracerImpl;

@Component("tracer")
public class Tracer {
    
    private TracerImpl tracerImpl;

    public Tracer() {
        this.tracerImpl = new TracerImpl();
    }

    public void log(String message) {
        getTracerImpl().trace(message);
    }

    private TracerImpl getTracerImpl() {
        if (this.tracerImpl == null) {
            this.tracerImpl = new TracerImpl();
        } 

        return this.tracerImpl;
    }
}
