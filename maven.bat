cd c:\Users\kathyw\Downloads\Katalon_Studio_Windows_64-5.4.1\Katalon_Studio_Windows_64-5.4.1
katalon -noSplash  -runMode=console -consoleLog -projectPath="C:\Users\kathyw\Katalon Studio\Katalon.prj" -retry=1 -retryFailedTestCases=true -testSuitePath="Test Suites/Maven_User_Tests" -executionProfile="MavenStaging" -browserType="Chrome"
katalon -noSplash  -runMode=console -consoleLog -projectPath="C:\Users\kathyw\Katalon Studio\Katalon.prj" -retry=1 -retryFailedTestCases=true -testSuitePath="Test Suites/Maven_MandP_Tests" -executionProfile="MavenStaging" -browserType="Chrome"
