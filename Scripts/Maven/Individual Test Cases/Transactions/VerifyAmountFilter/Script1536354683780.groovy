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

WebUI.waitForElementPresent(findTestObject('Transactions/select_DevelopmentProduction'), 20)

WebUI.click(findTestObject('Transactions/span_Transactions'))

WebUI.click(findTestObject('Transactions/span_All Transactions'))

WebUI.verifyElementPresent(findTestObject('Transactions/span_All Transactions'), 20)

WebUI.click(findTestObject('Transactions/span_Amount'))

WebUI.verifyElementPresent(findTestObject('Transactions/input_chevron_left_filterByAmo'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Transactions/input_chevron_left_filterByAmo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Transactions/input_attach_money_form-contro'))

WebUI.setText(findTestObject('Transactions/input_attach_money_form-contro'), '10')

WebUI.verifyElementPresent(findTestObject('Transactions/input_chevron_left_filterByAmo'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Transactions/input_chevron_left_filterByAmo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Transactions/div_Sale'), 0)

WebUI.getText(findTestObject('Transactions/div_10.00'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Transactions/div_10.00'), 20)

WebUI.closeBrowser()

