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

WebUI.click(findTestObject('Checkout/img_Arabic_undefined image-loaded-SHk undefined'))

WebUI.scrollToElement(findTestObject('Checkout/div_0 reviewsPONDS DFT POWDER (NEW) 200G10.35 SARAdd to Cart'), 0)

WebUI.mouseOver(findTestObject('Checkout/div_0 reviewsPONDS DFT POWDER (NEW) 200G10.35 SARAdd to Cart'))

WebUI.mouseOver(findTestObject('Checkout/div_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Checkout/a_View cart'))

WebUI.click(findTestObject('Object Repository/Checkout/span_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Ship here'))

WebUI.click(findTestObject('Object Repository/Checkout/h6_2 PM- 4 PM'))

WebUI.click(findTestObject('Object Repository/Checkout/img_Add your information for complete ident_c74ba0'))

WebUI.click(findTestObject('Object Repository/Checkout/button_Place Order'))

WebUI.click(findTestObject('Object Repository/Checkout/a_Continue Shopping'))

WebUI.closeBrowser()

