package US_15;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Page;
import utilities.ReusableMethods;

public class TC_01 {


    @Test
    public void test01() {

        //https://allovercommerce.com/ 'e gidin.
        //Kayıtlı satıcı e-postası ve şifresi ile giriş yapın.
        //username = nihalicin20@gmail.com, eposta şifresi = nihalsanlidilmen, vendor sifresi = nihalicin20@gmail.com.
        //Sayfanın altındaki Hesabım bölümünün görünür olduğunu doğrulayın.
        //Hesabım sekmesi altındaki Hesabım'ı tıklayın.
        //Mağaza Yöneticisi Bölümünün açılan Hesabım sayfasında görünür olduğunu doğrulayın.
        //Mağaza Yöneticisine tıklayın.
        //Ürünler bölümünün açılan Mağaza Yöneticisi sayfasında görünür olduğunu doğrulayın.
        //Ürünler üzerine geldiğinizde görünen Yeni Ekle'yi tıklayın.
        //Sayfanın altındaki Envanter menüsünün görünürlüğünü doğrulayın
        //Sayfanın altındaki Gönderim menüsünün görünürlüğünü doğrulayın
        //Sayfanın altındaki Bağlantılı menünün görünürlüğünü doğrulayın
        //Sayfanın altındaki Seo menüsünün görünürlüğünü doğrulayın
        //Sayfanın altındaki Gelişmiş menünün görünürlüğünü doğrulayın


            //Go to https://allovercommerce.com/
            Driver.getDriver().get("https://allovercommerce.com/");

            //Login with registered vendor email and password
            Page alloverCommercePage = new Page();

            alloverCommercePage.signIn.click();

            ReusableMethods.waitFor(2);

            alloverCommercePage.username.sendKeys("nihalicin20@gmail.com", Keys.TAB, "nihalicin20@gmail.com");

            ReusableMethods.waitFor(2);

            alloverCommercePage.signInButton.submit();

            ReusableMethods.waitFor(2);


            //Verify that the My Account section at the bottom of the page is visible
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE).perform();

            Assert.assertTrue(alloverCommercePage.hesabimYazisi.isDisplayed());

            ReusableMethods.waitFor(2);

            //Click My Account under the My Account tab
            alloverCommercePage.hesabimButton.click();

            //Verify that the Store Manager Section is visible on the My account page that opens
            ReusableMethods.waitFor(2);
            Assert.assertTrue(alloverCommercePage.storeManagerText.isDisplayed());

            //Click to Store Manager
            alloverCommercePage.storeManagerButton.click();

            actions.sendKeys(Keys.SPACE);

            //Verify that the Products section is visible on the Store Manager page that opens
            Assert.assertTrue(alloverCommercePage.productYazisi.isDisplayed());

            //Click Add New that appears when you hover over Products.
            ReusableMethods.waitFor(2);
            alloverCommercePage.productButton.click();

            //Add New click
            alloverCommercePage.addnewButton.click();

            ReusableMethods.waitFor(2);





            actions.sendKeys(Keys.SPACE, Keys.SPACE);






            //Verify visibility of Inventory menu at the bottom of the page
            Assert.assertTrue(alloverCommercePage.inventoryYazisi.isDisplayed());

            ReusableMethods.waitFor(2);

            actions.sendKeys(Keys.SPACE);

            //Verify visibility of Shipping menu at the bottom of the page
            Assert.assertTrue(alloverCommercePage.shippingYazisi.isDisplayed());


            //Verify visibility of Linked menu at the bottom of the page
            Assert.assertTrue(alloverCommercePage.linkedYazisi.isDisplayed());


            //Verify visibility of Seo menu at the bottom of the page
            Assert.assertTrue(alloverCommercePage.seoYazisi.isDisplayed());

            //Verify visibility of Advanced menu at the bottom of the page
            Assert.assertTrue(alloverCommercePage.advancedYazisi.isDisplayed());

            Driver.getDriver().quit();

        }




    }
