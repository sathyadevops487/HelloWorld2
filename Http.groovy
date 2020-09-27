import groovy.json.JsonSlurper;

def doSimpleHttp(){
		 def baseUrl = new URL('http://ergast.com/api/f1/2004/1/results.json')
		 
		 HttpURLConnection connection = (HttpURLConnection) baseUrl.openConnection();
		 connection.addRequestProperty("Accept", "application/json");
		 
			 if(connection.responseCode == 200){
					def json =  new JsonSlurper().parse(connection.inputStream)
					println json.MRData.url
			 }else{
				 println connection.responseCode
			 }
		 
}

return this

