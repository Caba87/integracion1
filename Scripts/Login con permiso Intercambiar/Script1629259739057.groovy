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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://192.168.13.42/Clinicas-2.0.0/')

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Seguridad/Autenticacion/txt_usuario'), user)

WebUI.setText(findTestObject('Seguridad/Autenticacion/txt_contrasena'), pass)

WebUI.click(findTestObject('Object Repository/Seguridad/Autenticacion/btn_Autenticarse'))

WebUI.waitForPageLoad(0)

WebUI.refresh()

WebUI.verifyElementClickable(findTestObject('Object Repository/Seguridad/Autenticacion/btn_CerrarSesion'))

WebUI.sendKeys(findTestObject('Object Repository/Seguridad/Autenticacion/btn_CerrarSesion2'), Keys.chord(Keys.CONTROL, 'g'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementClickable(findTestObject('Admision/Admision'))

not_run: WebUI.click(findTestObject('Admision/Admision'))

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Admision/CU Anular Intercambio/AnularIntercambio'), 
    0)

