package arrange;

import org.testng.annotations.DataProvider;

/**
 * Package: arrange
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 11.04.2018 2018
 */
public class DataProviderUtil {

    @DataProvider(name ="languageData")
    public Object[][] getData(){
        return new Object[][]{{"//*[@id=\"js-link-box-fr\"]","Visiter la page d’accueil"},{"//*[@id=\"js-link-box-zh\"]","首页"}};
    }
}
