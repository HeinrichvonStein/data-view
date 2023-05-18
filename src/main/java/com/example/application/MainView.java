package com.example.application;

import com.example.application.data.DataSourceConfig;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * A Designer generated component for the main-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("main-view")
@JsModule("./src/views/main-view.ts")
@Route("")
public class MainView extends LitTemplate {

    @Id("hostIP")
    private TextField hostIP;
    @Id("username")
    private TextField username;
    @Id("password")
    private PasswordField password;
    @Id("connectButton")
    private Button connectButton;
    private DataSourceConfig dataSourceConfig;
    private DataSource dataSource;
    private Connection connection;
    /**
     * Creates a new MainView.
     */
    public MainView() {

        connectButton.addClickListener(event -> {
            Notification.show(hostIP.getValue());
            Notification.show(username.getValue());
            Notification.show(password.getValue());
            Notification.show(connectButton.getText());
            dataSourceConfig = new DataSourceConfig(hostIP.getValue(),
                    username.getValue(),
                    password.getValue()
            );
            dataSource = dataSourceConfig.getDataSource();

            Notification notification;
            try {
                connection = dataSource.getConnection();
                notification = Notification.show("Connection success!");
                notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            } catch (SQLException e) {
                notification = Notification.show("Connection failure!");
                notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                throw new RuntimeException(e);
            }
        });
    }
}