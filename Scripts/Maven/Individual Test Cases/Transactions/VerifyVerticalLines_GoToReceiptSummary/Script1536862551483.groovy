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

WebUI.waitForElementPresent(findTestObject('Transactions/span_Go to Receipt Summary'), 60)

WebUI.click(findTestObject('Transactions/span_Go to Receipt Summary'))

WebUI.waitForElementPresent(findTestObject('Transactions/Page_The Maven Project/Page_The Maven Project/b_Monitoring Staging'), 
    40)

String addressValue = WebUI.getText(findTestObject('Transactions/MonitorStaging_Address'), FailureHandling.STOP_ON_FAILURE)

if (addressValue == '') {
    println('The value of the Address box CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/small_CashierName'), 30)

String AppovalID = WebUI.getText(findTestObject('Transactions/p_ApprovalID'))

if (AppovalID == '') {
    println('The value of the ApprvalID  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/p_REF_ID'), 0)

String TransactionAmount = WebUI.getText(findTestObject('Transactions/p_CreditSaleValues'), FailureHandling.STOP_ON_FAILURE)

if (TransactionAmount == '') {
    println('The value of the ApprvalID  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/small_Tip'), 0)

String totalAmount = WebUI.getText(findTestObject('Transactions/p_TotalTransaction'))

if (totalAmount == '') {
    println('The value of the ApprvalID  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/small_Cash Back'), 0)

WebUI.verifyElementPresent(findTestObject('Transactions/small_Customer Name'), 0)

WebUI.verifyElementPresent(findTestObject('Transactions/small_Billing Address'), 0)

WebUI.verifyElementPresent(findTestObject('Transactions/small_Billing Zip'), 0)

WebUI.closeBrowser()

