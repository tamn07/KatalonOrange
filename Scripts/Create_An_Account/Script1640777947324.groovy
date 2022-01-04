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

WebUI.navigateToUrl('https://pwa-orange.snaptec.co/create-account')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Create_An_Account/input_Create customer account_firstname'), 'Test')

WebUI.setText(findTestObject('Object Repository/Create_An_Account/input_Create customer account_lastname'), 'Test 1')

WebUI.setText(findTestObject('Object Repository/Create_An_Account/input_Create customer account_email'), 'testewghjkiuuq@gmail.com')

WebUI.setText(findTestObject('Object Repository/Create_An_Account/input_Phone_phone'), '585563562')

WebUI.click(findTestObject('Object Repository/Create_An_Account/button_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Create_An_Account/input'), '3691')

WebUI.click(findTestObject('Create_An_Account/button_Log Out'))

WebUI.closeBrowser()

