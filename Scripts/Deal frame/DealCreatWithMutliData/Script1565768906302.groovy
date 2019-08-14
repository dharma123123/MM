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
import org.apache.poi.ss.formula.functions.Today as Today
import org.openqa.selenium.Keys as Keys
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('MMdeal01/HomePage_Market Medium/input_Username_user_name'), GlobalVariable.UserName)

WebUI.setText(findTestObject('MMdeal01/HomePage_Market Medium/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('MMdeal01/HomePage_Market Medium/button_Login'))

WebUI.delay(20)

for (int r = 1; r <= findTestData('TestData1').getRowNumbers(); r++) {
    for (int r1 = 1; r1 <= 3; r1++) {
        WebUI.click(findTestObject('MMdeal01/HomePage_Market Medium/span_Add Deal'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_name'))

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_name'), 'YK_test_sample')

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_type_id'))

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_type_id'), findTestData('TestData1').getValue(
                1, r))

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__performance_id'))

        WebUI.setText(findTestObject('MMdeal01/GenericOR/G_input__performance_id'), findTestData('TestData1').getValue(
                3, 1))

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_start_date'), findTestData('TestData1').getValue(
                6, 1))

        WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__deal_end_date'), findTestData('TestData1').getValue(
                6, 3))

        WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__vendor_id'), findTestData('TestData1').getValue(
                2, 1))

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__division_code'), findTestData('TestData1').getValue(
                4, r1))

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/comments_box'), '')

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/vendor_track'), '')

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/G_input__program_name'), 'yuva_prog')

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/MMdeal01/GenericOR/Currency'), findTestData('TestData1').getValue(
                5, 4))

        WebUI.sendKeys(findTestObject('Input'), Keys.chord('', Keys.ENTER, Keys.TAB))

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/MMdeal01/GenericOR/Cancel'))
    }
}

