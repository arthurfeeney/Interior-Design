
import org.scalatest._
import org.scalatestplus.play._
import play.api.http.MimeTypes
import play.api.test._
import org.scalatestplus.play.guice.GuiceOneServerPerSuite
import org.scalatest.selenium.WebBrowser.PasswordField



class BrowserModelSpec extends PlaySpec with GuiceOneServerPerSuite with OneBrowserPerSuite with HtmlUnitFactory {
  "Interior Design Site" must {
    "provide a web driver" in {
      go to s"http://localhost:$port"
      pageTitle mustBe "Interior Design Homepage"
      click on id("home")
      eventually {
        pageTitle mustBe "Interior Design Homepage"
        click on id("news")
        eventually {
          pageTitle mustBe "Interior Design Updates"
        }
        click on id("loginPage")
        eventually {
          pageTitle mustBe "Login to Your Account"
        }
      }
    }
    
    "manage receipts" in {
      go to s"http://localhost:$port"
      pageTitle mustBe "Interior Design Homepage"
      click on id("loginPage")
      eventually {
        pageTitle mustBe "Login to Your Account"
      }
      // account won't exist b/c not database.
      textField("name").value = "katie"
      pwdField("pw").value = "123"
      
    }
    
    "empty receipt" in {
      go to s"http://localhost:$port/viewReceipt?clientToView=arthur"
      click on id("home")
      eventually {
        pageTitle mustBe "Interior Design Homepage"
      }
    }
  }
}