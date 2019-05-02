package io.github.chernov;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

public interface MainPage extends WebPage {

    @FindBy("//div[contains(@class, 'ServiceNavigation')]//a[contains(., 'Объявления')]")
    HtmlElement offers();

}
