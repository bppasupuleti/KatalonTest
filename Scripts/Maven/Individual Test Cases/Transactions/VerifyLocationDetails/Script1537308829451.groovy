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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.G_SiteURL)

WebUI.waitForElementPresent(findTestObject('Transactions/input_email'), 30)

WebUI.setText(findTestObject('Transactions/input_email'), GlobalVariable.G_StaffAdmin_Email)

WebUI.setText(findTestObject('Maven Login/input_password'), GlobalVariable.G_Password)

WebUI.click(findTestObject('Transactions/span_Login exit_to_app'))

WebUI.selectOptionByValue(findTestObject('Transactions/select_DevelopmentProduction'), 'development', true)

WebUI.waitForElementPresent(findTestObject('Transactions/select_DevelopmentProduction'), 30)

WebUI.click(findTestObject('Transactions/span_Transactions'))

WebUI.click(findTestObject('Transactions/span_All Transactions'))

WebUI.verifyElementPresent(findTestObject('Transactions/span_All Transactions'), 30)

WebUI.click(findTestObject('Transactions/i_more_verticleLines'))

WebUI.waitForElementPresent(findTestObject('Transactions/span_Go_to_Location_Details'), 60)

WebUI.click(findTestObject('Transactions/span_Go_to_Location_Details'))

WebUI.waitForElementPresent(findTestObject('Transactions/div_Transaction_Location_Info'), 30)

String LocationID = WebUI.getText(findTestObject('Transactions/p_Location_ID'))

if (LocationID == '') {
    println('The value of the ApprvalID  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/small_IP Address'), 0)

String sourceData = WebUI.getText(findTestObject('Transactions/p_Source_Emergepay'), FailureHandling.STOP_ON_FAILURE)

if (sourceData == '') {
    println('The value of the ApprvalID  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/small_ComputerName'), 0)

WebUI.verifyElementPresent(findTestObject('Transactions/small_CIPSoftware_Version'), 0)

String computerDateTIME = WebUI.getText(findTestObject('Transactions/p_Computer_Date_Time_InvalidDate'), FailureHandling.STOP_ON_FAILURE)

if (computerDateTIME.contains('Invalid date')) {
    println('The value of the computer Date Time should not be invalid')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/small_Billing Address'), 0)

String terminalDateTIME = WebUI.getText(findTestObject('Transactions/p_Terminal_Date_Time_InvalidDate'), FailureHandling.STOP_ON_FAILURE)

if (terminalDateTIME.contains('Invalid date')) {
    println('The value of the computer Date Time should not be invalid')

    err
}

println('The value of the computer Date Time should not be invalid')

err

WebUI.verifyElementPresent(findTestObject('Transactions/small_Billing Zip'), 0)

WebUI.closeBrowser()

