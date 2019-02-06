# How to run both tests in parallel

1. Download Selenium Server Standalone Server, Chrome Driver and Gecko Driver from: https://www.seleniumhq.org/download/

2. In a terminal run the following scripts:

   1. java -jar selenium-server-standalone-3.141.59.jar -role hub

   1. java -Dwebdriver.chrome.driver=<_Path to your chrome driver_> -Dwebdriver.gecko.driver=<_Path to your gecko (Firefox) driver_> -jar selenium-server-standalone-3.141.59.jar 
    -role node -hub http://172.16.32.193:4444/grid/register/ 

3. Open the project in Intellij > Right click on testing.xml > Run Testing.xml