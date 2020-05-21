package bdd.demo.vaadin15.views;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("home-view")
@JsModule("./src/views/home-view.js")
@Route(value = "")
public class HomeView extends PolymerTemplate<HomeView.HomeViewModel> {
    @Id("email")
    private TextField email;

    @Id("first-name")
    private TextField firstName;

    @Id("last-name")
    private TextField lastName;

    @Id("ok")
    private Button ok;

    @Id("cancel")
    private Button cancel;

    public HomeView() {
        ok.addClickListener(e-> Notification.show(getOkMessage()));
        cancel.addClickListener(e-> Notification.show("Cancel clicked"));
    }

    private String getOkMessage() {
        return "FirstName: " + firstName.getValue() + ", LastName: " + lastName.getValue();
    }

    public static interface HomeViewModel extends TemplateModel {

    }
}
