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

WebUI.waitForElementPresent(findTestObject('Transactions/Page_The Maven Project/Page_The Maven Project/Page_The Maven Project/Page_The Maven Project/span_Go to Other Details'), 
    60)

WebUI.click(findTestObject('Transactions/Page_The Maven Project/Page_The Maven Project/Page_The Maven Project/Page_The Maven Project/span_Go to Other Details'))

WebUI.waitForElementPresent(findTestObject('Transactions/p_TransactionID'), 40)

String DateTIme = WebUI.getText(findTestObject('Transactions/p_DateTime'))

not_run: if (DateTime == '') {
    println('The value of the DateTime  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/p_ReferenceNumber'), 30)

String refernceNumber = WebUI.getText(findTestObject('Transactions/p_ReferenceNumber'), FailureHandling.STOP_ON_FAILURE)

if (refernceNumber == '') {
    println('The value of the refernceNumber  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/p_Transaction_Type'), 0)

String transactionType = WebUI.getText(findTestObject('Transactions/p_Transaction_Type'), FailureHandling.STOP_ON_FAILURE)

if (transactionType == '') {
    println('The value of the transactionType  CAN NOT BE EMPTY')

    err
}

WebUI.verifyElementPresent(findTestObject('Transactions/p_ApprovalNumberResult'), 30)

WebUI.closeBrowser()

