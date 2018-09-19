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

WebUI.waitForElementPresent(findTestObject('Transactions/select_DevelopmentProduction'), 20)

WebUI.selectOptionByValue(findTestObject('Transactions/select_DevelopmentProduction'), 'development', true)

WebUI.waitForElementPresent(findTestObject('Transactions/select_DevelopmentProduction'), 20)

WebUI.click(findTestObject('Transactions/span_Transactions'))

WebUI.click(findTestObject('Transactions/span_All Transactions'))

WebUI.verifyElementPresent(findTestObject('Transactions/span_All Transactions'), 20)

WebUI.click(findTestObject('Transactions/span_Column'))

WebUI.click(findTestObject('Transactions/button_Reset to Default'))

WebUI.click(findTestObject('Transactions/li_Type'))

WebUI.click(findTestObject('Transactions/i_keyboard_arrow_right'))

WebUI.waitForElementPresent(findTestObject('Transactions/li_Name'), 30)

WebUI.click(findTestObject('Transactions/li_Name'))

WebUI.verifyElementPresent(findTestObject('Transactions/i_keyboard_arrow_right'), 20)

WebUI.click(findTestObject('Transactions/i_keyboard_arrow_right'))

WebUI.click(findTestObject('Transactions/button_Apply'))

WebUI.verifyElementPresent(findTestObject('Transactions/div_Type'), 20)

WebUI.verifyElementPresent(findTestObject('Transactions/div_Name'), 20)

WebUI.closeBrowser()

