package com.ecommerce.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTests {
    public void runOnWindows() {
        System.out.println("This runs on Windows");
}

@Test
@EnabledOnOs({OS.LINUX})
public void runOnLinux() {
        System.out.println("This runs on Linux");
}


@Test
@DisabledIf("Math.random()")
void mightNotBeExecuted() {
        System.out.println("This may or not execute");
		}

}
