package com.ship.shipshop5a;

import com.vaadin.flow.spring.annotation.VaadinSessionScope;
import org.springframework.stereotype.Component;

@VaadinSessionScope
//@UIScope
@Component
public class TestVaadinSessionScope {

    public TestVaadinSessionScope() {
        System.out.println("The Vaadin Test Session scope has  been initialized ");
    }
}