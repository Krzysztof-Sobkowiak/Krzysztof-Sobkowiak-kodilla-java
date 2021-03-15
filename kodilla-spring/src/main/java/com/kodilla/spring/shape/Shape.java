package com.kodilla.spring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public interface Shape {

    String getShapeName();
}
