package ru.test.autoru.elements;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.annotation.Param;
import io.qameta.htmlelements.element.HtmlElement;

public interface SearchForm extends HtmlElement {

    @FindBy(".//span[contains(@class, 'RadioGroup_type_button')]//button[. = '{{ value }}']")
    HtmlElement categoryCar(@Param("value") String value);

    @FindBy(".//div[contains(@class, 'ListingCarsFilters-module__actions')] //span[contains(., 'Все параметры')]")
    HtmlElement allParameters();

    @FindBy("//span[@class='Button__content'][contains(., '{{ value }}')]")
    HtmlElement suggestButton(@Param("value") String value);

    @FindBy("//span[@class='TextInput__box'][contains(., '{{ value }}')] //input[@class='TextInput__control']")
    HtmlElement textInput(@Param("value") String value);

    @FindBy("//div[@class='CatalogEquipmentFiltersGroup__item'] [contains(., '{{ value }}')] //input")
    HtmlElement checkbox(@Param("value") String value);

    @FindBy("//button[contains(@class, 'Button Button_color_blue Button_size_m Button_type_button Button_width_full')]")
    HtmlElement showResults();

    @FindBy("//div[@class='MenuItem MenuItem_size_m'] [contains(., '{{ value }}')]")
    HtmlElement menuItem(@Param("value") String value);
}
