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
import org.apache.poi.ss.formula.functions.Today
import org.openqa.selenium.Keys as Keys
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.core.logging.KeywordLogger

WebUI.delay(15)
WebUI.click(findTestObject('MMdeal01/HomePage_Market Medium/span_Add Deal'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_name'))
WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_name'),findTestData("TestData1").getValue(3, 7))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_type_id'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_type_id'),findTestData("TestData1").getValue(1, 1))
WebUI.sendKeys(findTestObject('Input'), Keys.chord('',Keys.ENTER,Keys.TAB))
WebUI.delay(1)
WebUI.setText(findTestObject('MMdeal01/GenericOR/G_input__performance_id'), '')
WebUI.sendKeys(findTestObject('Input'), Keys.chord('',Keys.ENTER,Keys.TAB))

WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_start_date'))
WebUI.delay(1)
WebUI.mouseOver(findTestObject('MMdeal01/GenericOR/G_input__performance_id'))
WebUI.delay(2)
String Actual = WebUI.getAttribute(findTestObject('MMdeal01/GenericOR/G_input__performance_id'), 'data-errorqtip')
String Expected = '<ul class="x-list-plain"><li>This field is required</li></ul>'

assert Actual == Expected
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/Cancel'))