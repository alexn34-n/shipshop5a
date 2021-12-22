package com.ship.shipshop5a.frontend;

import com.ship.shipshop5a.TestVaadinSessionScope;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("login")
@PageTitle("Login| ShipsOrdersShop")
public class LoginView extends VerticalLayout implements BeforeEnterObserver {
    private LoginForm login=new LoginForm();

    private  final TestVaadinSessionScope testVaadinSessionScope;

    public LoginView(TestVaadinSessionScope testVaadinSessionScope) {
        this.testVaadinSessionScope = testVaadinSessionScope;

        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        login.setAction("login");

        var registrationButton=new Button("Регистрация",event->{
            UI.getCurrent().navigate("registration");
        });
        add(new H1("ShipsOrdersShop"),login,registrationButton);//
        List<String> foreachExample=List.of("login","is","OK");
        for(String s:foreachExample){
            System.out.println(s);
        }
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        if(event.getLocation()
                .getQueryParameters()
                .getParameters()
                .containsKey("error")){
            login.setError(true);
        }

    }
}
//