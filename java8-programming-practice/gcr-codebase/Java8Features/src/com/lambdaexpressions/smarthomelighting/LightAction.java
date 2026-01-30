package com.lambdaexpressions.smarthomelighting;

@FunctionalInterface
public interface LightAction {
    void activate(int brightness, String color);
}
