import groovy.json.JsonSlurper;

def doSimpleHttp(){
		 def baseUrl = new URL('http://ergast.com/api/f1/2004/1/results.json')
		
		 HttpURLConnection connection = (HttpURLConnection) baseUrl.openConnection();
		 connection.addRequestProperty("Accept", "application/json");	 
		 
		 connection.with {
		   doOutput = true
		   requestMethod = 'GET'
		   println connection.inputStream.text
		 }
		 if(connection.responseCode == 200){
				def json =  new JsonSlurper().parse(connection.inputStream.text)
				println json.query.MRData.url
		 }
}

return this

