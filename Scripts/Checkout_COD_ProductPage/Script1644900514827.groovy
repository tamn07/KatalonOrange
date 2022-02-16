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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Checkout/span_Account'))

WebUI.setText(findTestObject('Checkout/input_Phone_phone'), '567 - 567 - 567')

WebUI.click(findTestObject('Object Repository/Checkout/span_Send Code'))

WebUI.setText(findTestObject('Object Repository/Checkout/input'), '3691')

WebUI.mouseOverOffset(findTestObject('Checkout/a_MEDICATIONS'), 5, 5)

WebUI.click(findTestObject('Checkout/a_Mental health medications'))

WebUI.click(findTestObject('Checkout/h2_ventolin  150ml syr'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Add to Cart'))

WebUI.click(findTestObject('Checkout/button_Shopping Cart'))

WebUI.click(findTestObject('Checkout/span_View Cart  Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/span_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Ship here'))

WebUI.click(findTestObject('Checkout/h6_8 PM- 10 PM'))

WebUI.click(findTestObject('Object Repository/Checkout/img_Add your information for complete ident_c74ba0'))

WebUI.scrollToElement(findTestObject('Checkout/div_Review your requests'), 3)

WebUI.verifyElementText(findTestObject('Checkout/button_Place Order'), 'Place Order')

WebUI.click(findTestObject('Object Repository/Checkout/button_Place Order'))

WebUI.click(findTestObject('Object Repository/Checkout/a_Continue Shopping'))

WebUI.closeBrowser()

