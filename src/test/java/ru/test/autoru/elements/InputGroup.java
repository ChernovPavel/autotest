package ru.test.autoru.elements;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.annotation.Param;
import io.qameta.htmlelements.element.HtmlElement;

public interface InputGroup extends HtmlElement{

    @FindBy(".//input[contains(@class, 'TextInput__control') and preceding-sibling::div[contains(., '{{ value }}')]]")
    HtmlElement input(@Param("value") String value);


}
