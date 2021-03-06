import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pwa-orange.snaptec.co/')

WebUI.click(findTestObject('Object Repository/Checkout/span_Account'))

WebUI.setText(findTestObject('Object Repository/Checkout/input_Phone_phone'), '+966 567 - 567 - 567')

WebUI.click(findTestObject('Object Repository/Checkout/span_Send Code'))

WebUI.setText(findTestObject('Object Repository/Checkout/input'), '1')

WebUI.click(findTestObject('Object Repository/Checkout/a_Mental health medications'))

WebUI.click(findTestObject('Object Repository/Checkout/h2_zelax 10mg 30tab'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Checkout/span_1Shopping Cart'))

WebUI.click(findTestObject('Object Repository/Checkout/button_View Cart  Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/span_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Ship here'))

WebUI.click(findTestObject('Object Repository/Checkout/h6_8 PM- 10 PM'))

WebUI.click(findTestObject('Object Repository/Checkout/div_mada debit card_image-root-Qpm paymentM_4430c1'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Place Order'))

WebUI.click(findTestObject('Object Repository/Checkout/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Checkout/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Checkout/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Checkout/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Checkout/div_id(katalon-rec_elementInfoDiv)'))

WebUI.setText(findTestObject('Object Repository/Checkout/input_Expiry Date_wpwl-control wpwl-control-expiry'), '12 / 22')

WebUI.click(findTestObject('Object Repository/Checkout/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Checkout/div_CVV_wpwl-wrapper wpwl-wrapper-cvv'))

WebUI.doubleClick(findTestObject('Object Repository/Checkout/div_id(katalon-rec_elementInfoDiv)'))

WebUI.setText(findTestObject('Object Repository/Checkout/input_Card holder_card.holder'), 'test')

WebUI.click(findTestObject('Object Repository/Checkout/button_Pay now'))

WebUI.click(findTestObject('Object Repository/Checkout/span_Back to home'))

