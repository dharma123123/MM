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

WebUI.setText(findTestObject('Object Repository/new record/Page_Market Medium/input_Username_user_name'), 'admin@effiser.com')

WebUI.setEncryptedText(findTestObject('Object Repository/new record/Page_Market Medium/input_Password_password'), 'HTjkZxmukiSYlKtBT0vFPg==')

WebUI.click(findTestObject('Object Repository/new record/Page_Market Medium/button_Login'))
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/div_Deals_combo-1244-trigger-picker'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/td_All Incentives'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/div_100-3530'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/span_Search Items'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/span_Search'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/div_'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/div_'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/span_Add'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/div_'))

WebUI.setText(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/input_BB HLTHY GOURMT PATE CHKN CAT 125OZ12_numberfield-1732-inputEl'), 
    '1')

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/span_Save'))

WebUI.click(findTestObject('Object Repository/new record/Page_DO NOT USE PROD REPLICA/div_success Changes saved successfully'))

