package com.ship.shipshop5a.frontend;


import com.ship.shipshop5a.service.UserService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("registration")
@PageTitle("Registration|ShipsOrdersShop")
public class RegistrationView extends VerticalLayout {
    private UserService userService;


    public RegistrationView(UserService userService) {
        this.userService = userService;

        initRegistrationView();
    }

    private void initRegistrationView() {

        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        var phoneTextField = initTextFieldWithPlaceholder("Номер телефона судовладельца");
        var loginTextField = initTextFieldWithPlaceholder("Логин");
        var passwordTextField = initTextFieldWithPlaceholder("Пароль");
        var nameTextField = initTextFieldWithPlaceholder("Имя");
        var lastNameTextField = initTextFieldWithPlaceholder("Фамилия");
        var secondNameTextField = initTextFieldWithPlaceholder("Отчество");
        var emailTextField = initTextFieldWithPlaceholder("Почта");
        var imoTextField = initTextFieldWithPlaceholder("Имо судна");
        var name_shipTextField = initTextFieldWithPlaceholder("Название судна");

        var registrationButton = new Button("Зарегистрироваться", event -> {
            boolean hasError = false;
            if (!phoneTextField.getValue().matches("\\d+")) {
                Notification.show("Телефон должен состоять из цифр");
                hasError = true;
            }

            if (!nameTextField.getValue().matches("[а-яА-Я]+")) {
                Notification.show("Имя должено состоять из букв");
                hasError = true;
            }

            if (!lastNameTextField.getValue().matches("[а-яА-Я]+")) {
                Notification.show("Имя должено состоять из букв");
                hasError = true;
            }

            if (!secondNameTextField.getValue().matches("[а-яА-Я]+")) {
                Notification.show("Имя должено состоять из букв");
                hasError = true;
            }

            if (hasError) {
                return;
            } else {
                var user = userService.saveUser(
                        phoneTextField.getValue(),
                        loginTextField.getValue(),
                        passwordTextField.getValue(),
                        emailTextField.getValue(),
                        nameTextField.getValue(),
                        secondNameTextField.getValue(),
                        lastNameTextField.getValue(),
                        imoTextField.getValue(),
                        name_shipTextField.getValue()
                );

                Notification.show("Регистрация прошла успешно");
                UI.getCurrent().navigate("login");
            }
        });

        add(loginTextField, passwordTextField, phoneTextField, emailTextField, nameTextField,
                lastNameTextField, secondNameTextField, imoTextField, name_shipTextField, registrationButton);
    }

    private TextField initTextFieldWithPlaceholder(String placeholder) {
        var textField = new TextField();
        textField.setPlaceholder(placeholder);
        return textField;
    }
}
//
