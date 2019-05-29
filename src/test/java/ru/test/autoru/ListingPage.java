package ru.test.autoru;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.annotation.Param;
import io.qameta.htmlelements.element.HtmlElement;
import org.junit.experimental.theories.ParametersSuppliedBy;
import ru.test.autoru.elements.SearchForm;

public interface ListingPage extends WebPage {

    @FindBy(".//div[contains(@class, 'ListingCarsFilters-module__container')]")
    SearchForm searchForm();


}
