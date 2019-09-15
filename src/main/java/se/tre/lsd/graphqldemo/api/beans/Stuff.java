package se.tre.lsd.graphqldemo.api.beans;

import lombok.Value;

@Value(staticConstructor = "of")
public class Stuff {

    String name;
    String color;

}
