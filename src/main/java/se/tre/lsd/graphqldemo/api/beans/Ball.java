package se.tre.lsd.graphqldemo.api.beans;

import lombok.Value;

@Value(staticConstructor = "of")
public class Ball {

    String name;
    String color;

}
