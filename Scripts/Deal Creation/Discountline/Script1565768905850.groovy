import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

WebUI.navigateToUrl('https://chewydev.marketmedium.net/login')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('MMdeal01/HomePage_Market Medium/input_Username_user_name'),
	'admin@effiser.com')
WebUI.setText(findTestObject('MMdeal01/HomePage_Market Medium/input_Password_password'),'adminWelcome123')
WebUI.click(findTestObject('MMdeal01/HomePage_Market Medium/button_Login'))
WebUI.delay(25)
WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/600-3471'))
//WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/div_CHWY-2777'))
WebUI.delay(8)
//WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/ADD'))
WebUI.click(findTestObject('MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/span_search'))
//WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/discount on type'))
//WebUI.setText(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/discount on type'),'Item')
//WebUI.sendKeys(findTestObject('Input'), Keys.chord('Text String',Keys.ENTER,Keys.TAB))
WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/item number in search'))
WebUI.setText(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/item number in search'), '%')
WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/Search_botton'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/first_checkbox'))
WebUI.click(findTestObject('Object Repository/MMdeal01/Deal_Header/Page_CHEWY DEV - MARKETMEDIUM/searchpop_add'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/Save button'))
WebUI.delay(2)
String actual = WebUI.getText(findTestObject('Object Repository/MMdeal01/GenericOR/Validation error'))
String expected = '''ERROR: Validation errors
Please correct the errors on the page.'''
println actual

assert actual == expected
