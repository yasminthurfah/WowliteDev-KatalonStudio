import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wowlite.interadsdev.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login/Page_PixelPop  Log in/tb_email'), 'hananurulaz@gmail.com')

WebUI.setEncryptedText(findTestObject('Login/Page_PixelPop  Log in/tb_password'), 'OqiYbwExq6wp74bmfRBSbg==')

WebUI.sendKeys(findTestObject('Login/Page_PixelPop  Log in/button_Log in'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Display/btn_Display'))

WebUI.click(findTestObject('Display/btn_StopDisplay'))

WebUI.delay(3)

WebUI.click(findTestObject('Display/btn_DeleteDisplay'))

WebUI.verifyTextPresent('Warning!', false)

WebUI.click(findTestObject('Display/btn_SureDeleteDisplay'))

WebUI.verifyTextPresent('Success!', false)

WebUI.click(findTestObject('Display/btn_ConfirmSuccessDelete'))

WebUI.delay(3)

WebUI.closeBrowser()

