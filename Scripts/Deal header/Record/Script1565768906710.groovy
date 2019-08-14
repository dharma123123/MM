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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://chewydev.marketmedium.net/login')

WebUI.setText(findTestObject('Object Repository/record/Page_Market Medium/input_Username_user_name'), 'admin@effiser.com')

WebUI.setEncryptedText(findTestObject('Object Repository/record/Page_Market Medium/input_Password_password'), 'HTjkZxmukiSYlKtBT0vFPg==')

WebUI.click(findTestObject('Object Repository/record/Page_Market Medium/button_Login'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/record/Page_DO NOT USE PROD REPLICA/div_100-3527'))

WebUI.click(findTestObject('Object Repository/record/Page_DO NOT USE PROD REPLICA/div_'))
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/record/Page_DO NOT USE PROD REPLICA/input_TRUCHW BAKES BNJT TRT 8OZ_numberfield-1671-inputEl'), 
    '2')


