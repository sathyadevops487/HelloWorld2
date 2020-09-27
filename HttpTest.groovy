import java.net.URL;
import groovy.json.JsonSlurper;

def testHttpMethod(){
	def baseUrl = new URL('http://ergast.com/api/f1/2004/1/results.json')
		
	HttpURLConnection connection = (HttpURLConnection)baseUrl.openConnection();
	connection.addRequestProperty("Accept", "application/json");
	
	/*connection.with{
		doOutput = true
		requestMethod = 'GET'
		println connection.inputStream.text
	}*/
	if(connection.responseCode == 200){		
		//def json = new JsonSlurper.parse(connection.inputStream);
		def jslurper = new JsonSlurper();
		def json = jslurper.parseText(connection.inputStream.text)
		print "URL from API ------> "+json.MRData.url
	}
	else{
		println "invalid response returned from the api. ResponseCode: "+connection.responseCode
	}
}
return this